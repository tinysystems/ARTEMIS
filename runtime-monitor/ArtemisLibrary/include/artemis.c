#include <libartemis/artemis.h>
#include <libartemis/interface.h>
#include <stdarg.h>
#include <string.h>
#include <msp430.h>
//#include "energyHarvester.h"
#include "monitor/monitor.h"

__nv task_input_channel task_input_channels;
__nv int dataPaths[MAX_PATH_NUM][MAX_TASK_NUM] = {[0 ... MAX_PATH_NUM-1][0 ... MAX_TASK_NUM-1] = 0};
__nv char mayfly_constraints = 0;
int dataPathCounter;
__nv int pathIDCount [2] = {1,1};
__nv int pathLayerCounter [2] = {0,0};
__nv int __pathIDCount = 1;
__nv int __pathLayerCounter = 0;


//#define INTERMITTENT
//#define OVERHEAD
__nv uint16_t scratch_bak[SCRATCH_SIZE];

/**
 * @brief dirtylist to save src address
 */
__nv uint8_t** data_src_base = &data_src;
/**
 * @brief dirtylist to save dst address
 */
__nv uint8_t** data_dest_base = &data_dest;
/**
 * @brief dirtylist to save size
 */
__nv unsigned* data_size_base = &data_size;

/**
 * @brief var to iterate over dirtylist
 */
__nv volatile unsigned gv_index=0;
/**
 * @brief len of dirtylist
 */
__nv volatile unsigned num_dirty_gv=0;

/**
 * @brief double buffered context
 */
__nv context_t context_1 = {0};
/**
 * @brief double buffered context
 */
__nv context_t context_0 = {
	.task = TASK_REF(_entry_task),
	.needCommit = 0,
};
/**
 * @brief current context
 */
__nv context_t * volatile curctx = &context_0;
/**
 * @brief current version which updates at every reboot or transition
 */
__nv volatile unsigned _numBoots = 0;

__nv task_t *task_list_count[MAX_TASK_NUM];

/**
 * @brief Function to be invoked at the beginning of every task
 */
void save_prv2org();

void artemis_check_monitor(MonitorFeedback result){
#ifdef OVERHEAD
        mon_ov = GetTime();
#endif

    task_t *next_task;
    context_t *next_ctx;
    int taskIdx;
    switch (result.action_response) {
        case NONE:
            if (curctx->task->status == TASK_FINISHED){
                // set the next task in the path
                next_task = artemis_nexttask();
                next_ctx = (curctx == &context_0 ? &context_1 : &context_0 );
                next_ctx->task = next_task;
                next_ctx->task->pathState = curctx->task->pathState ^ 0x01;
                next_ctx->needCommit = 1;
                next_task->status = TASK_READY;
                curctx = next_ctx;
#ifdef OVERHEAD
                monitor_ov = monitor_ov + (GetTime() - mon_ov);
#endif
                artemis_contex_switch();
            }
            break;
        case RESTART_TASK:
            // to restart task, call artemis_contex_switch with curr task
            curctx->task->status = TASK_READY;
#ifdef OVERHEAD
                monitor_ov = monitor_ov + (GetTime() - mon_ov);
#endif
            artemis_contex_switch();
            break;
        case RESTART_PATH:
            // to restart path, clear the task index in the path
            // and call Artemis Context Switch with curr task
            __pathLayerCounter = 0;
            __pathIDCount = result.path;
            taskIdx = dataPaths[__pathIDCount][__pathLayerCounter];
            __pathLayerCounter++;
            pathIDCount[curctx->task->pathState^0x01] = __pathIDCount ;
            pathLayerCounter[curctx->task->pathState^0x01] = __pathLayerCounter;
            next_task =  task_list_count[taskIdx];
            next_ctx = (curctx == &context_0 ? &context_1 : &context_0 );
            next_ctx->task = next_task;
            next_ctx->task->pathState = curctx->task->pathState ^ 0x01;
            next_ctx->needCommit = 1;
            next_task->status = TASK_READY;
            curctx = next_ctx;
#ifdef OVERHEAD
                monitor_ov = monitor_ov + (GetTime() - mon_ov);
#endif
            artemis_contex_switch();
            break;
        case SKIP_TASK:
            // increase task index in the path and call artemis_next_task
            // and artemis_contex_switch
            next_task = artemis_nexttask();
            next_ctx = (curctx == &context_0 ? &context_1 : &context_0 );
            next_ctx->task = next_task;
            next_ctx->task->pathState = curctx->task->pathState ^ 0x01;
            next_ctx->needCommit = 1;
            next_task->status = TASK_READY;
            curctx = next_ctx;
#ifdef OVERHEAD
                monitor_ov = monitor_ov + (GetTime() - mon_ov);
#endif
            artemis_contex_switch();
            break;
        case SKIP_PATH:
            // increase path index and clear task index and
            // call artemis_next_task and artemis_contex_switch
            __pathIDCount = 0;
            __pathIDCount = pathLayerCounter[curctx->task->pathState] +1;
            taskIdx = dataPaths[__pathIDCount][__pathLayerCounter];
            if(!taskIdx){
                //sleep();
                __pathIDCount = 1;
                __pathLayerCounter = 0;
                taskIdx = dataPaths[__pathIDCount][__pathLayerCounter];
            }
            pathIDCount[curctx->task->pathState^0x01] = __pathIDCount ;
            pathLayerCounter[curctx->task->pathState^0x01] = __pathLayerCounter;
            /*next_task =  task_list_count[taskIdx];
            next_ctx = (curctx == &context_0 ? &context_1 : &context_0 );
            next_ctx->task = next_task;
            next_ctx->task->pathState = curctx->task->pathState ^ 0x01;
            next_ctx->needCommit = 1;
            next_task->status = TASK_READY;
            curctx = next_ctx;
            artemis_contex_switch();*/
            break;
    }
#ifdef OVERHEAD
                monitor_ov = monitor_ov + (GetTime() - mon_ov);
#endif

}
void task_prologue()
{

	// increment version
	if(_numBoots == 0xFFFF){
		clear_isDirty();
		++_numBoots;
	}
	++_numBoots;
	// commit if needed
	if (curctx->needCommit) {
		while (gv_index < num_dirty_gv) {
			uint8_t* w_data_dest = *(data_dest_base + gv_index);
			uint8_t* w_data_src= *(data_src_base + gv_index);
			unsigned w_data_size = *(data_size_base + gv_index);
			memcpy(w_data_dest, w_data_src, w_data_size);
			++gv_index;
		}
		num_dirty_gv = 0;
		gv_index = 0;
		curctx->needCommit = 0;
	}
	else {
		num_dirty_gv=0;
	}
}

/**
 * @brief Transfer control to the given task
 * @details Finalize the current task and jump to the given task.
 *          This function does not return.
 *
 *//*
void transition_to(task_t *next_task)
{
	// double-buffered update to deal with power failure
	context_t *next_ctx;
	next_ctx = (curctx == &context_0 ? &context_1 : &context_0 );
	next_ctx->task = next_task;
	next_ctx->needCommit = 1;

	// atomic update of curctx
	curctx = next_ctx;

	// fire task prologue
	task_prologue();
	// jump to next tast
	__asm__ volatile ( // volatile because output operands unused by C
			"mov #0x2400, r1\n"
			"br %[ntask]\n"
			:
			: [ntask] "r" (next_task->func)
			);
}*/
/*
void mayfly_transition()
{
    __pathIDCount = pathIDCount;
    __pathLayerCounter = pathLayerCounter;
    int taskIdx = dataPaths[__pathIDCount][__pathLayerCounter];
    if(!taskIdx)
        sleep();
    __pathLayerCounter++;
    if(!dataPaths[__pathIDCount][__pathLayerCounter]){
        __pathIDCount++;
//        __pathLayerCounter = 0;
        if(!dataPaths[__pathIDCount][__pathLayerCounter]){
            __pathIDCount = 1;
        }
    }
    uint32_t time = GetTime();
    int i = 1;
    char expired = __RESET;
    while((task_input_channels.state [taskIdx][i])&((!expired))){
        if((!task_input_channels.input [taskIdx][i]->state)||(GetTime() -
                task_input_channels.input [taskIdx][i]->time_stamp > task_input_channels.expire_time [taskIdx][i])){
             __pathIDCount = task_input_channels.dataPath[taskIdx][i];
             __pathLayerCounter = 0;
             taskIdx = dataPaths[__pathIDCount][__pathLayerCounter];
             __pathLayerCounter++;
              if(!dataPaths[__pathIDCount][__pathLayerCounter]){
                  __pathIDCount++;
                  __pathLayerCounter = 0;
              }
        }
        i++;
    }

    // double-buffered update to deal with power failure
    task_t *next_task = task_list_count[taskIdx];
    context_t *next_ctx;
    next_ctx = (curctx == &context_0 ? &context_1 : &context_0 );
    next_ctx->task = next_task;
    next_ctx->needCommit = 1;

    // atomic update of curctx
    curctx = next_ctx;

    // fire task prologue
    task_prologue();
    // jump to next tast
    __asm__ volatile ( // volatile because output operands unused by C
            "mov #0x2400, r1\n"
            "br %[ntask]\n"
            :
            : [ntask] "r" (next_task->func)
            );

}*/

task_t* artemis_nexttask()
{

    __pathIDCount = pathIDCount[curctx->task->pathState];
    __pathLayerCounter = pathLayerCounter[curctx->task->pathState];
    int taskIdx = dataPaths[__pathIDCount][__pathLayerCounter];
    if(!taskIdx){
        //sleep();
        __pathIDCount = 1;
        __pathLayerCounter = 0;
        taskIdx = dataPaths[__pathIDCount][__pathLayerCounter];
    }
    __pathLayerCounter++;
    if(!dataPaths[__pathIDCount][__pathLayerCounter]){
        __pathIDCount++;
        __pathLayerCounter = 0;
        if(!dataPaths[__pathIDCount][__pathLayerCounter]){
            __pathIDCount = 1;
        }
    }
    /*
    uint64_t time = GetTime();
    int i = 1;
    char expired = __RESET; /// Gereksiz
    while((task_input_channels.state [taskIdx][i])&((!expired))){ //
        if((!task_input_channels.input [taskIdx][i]->state)||(GetTime() -
                task_input_channels.input [taskIdx][i]->time_stamp > task_input_channels.expire_time [taskIdx][i])){
             __pathIDCount = task_input_channels.dataPath[taskIdx][i];
             __pathLayerCounter = 0;
             taskIdx = dataPaths[__pathIDCount][__pathLayerCounter];
             __pathLayerCounter++;
              if(!dataPaths[__pathIDCount][__pathLayerCounter]){
                  __pathIDCount++;
                  __pathLayerCounter = 0;
              }
        }
        i++;
    }*/
    pathIDCount[curctx->task->pathState^0x01] = __pathIDCount ;
    pathLayerCounter[curctx->task->pathState^0x01] = __pathLayerCounter;
    return task_list_count[taskIdx];
}
/*
task_t* mayfly_constraint_check(){
    __pathIDCount = pathIDCount[curctx->task->pathState];
    __pathLayerCounter = pathLayerCounter[curctx->task->pathState];
    int taskIdx = dataPaths[__pathIDCount][__pathLayerCounter];
    uint64_t time = GetTime();
    int i = 1;
    char expired = __RESET; /// Gereksiz
    while((task_input_channels.state [taskIdx][i])&((!expired))){ //
        if((!task_input_channels.input [taskIdx][i]->state)||(GetTime() -
                task_input_channels.input [taskIdx][i]->time_stamp > task_input_channels.expire_time [taskIdx][i])){
             __pathIDCount = task_input_channels.dataPath[taskIdx][i];
             __pathLayerCounter = 0;
             taskIdx = dataPaths[__pathIDCount][__pathLayerCounter];
             __pathLayerCounter++;
              if(!dataPaths[__pathIDCount][__pathLayerCounter]){
                  __pathIDCount++;
                  __pathLayerCounter = 0;
              }
        }
        i++;
    }
    pathIDCount[curctx->task->pathState^0x01] = __pathIDCount ;
    pathLayerCounter[curctx->task->pathState^0x01] = __pathLayerCounter;
    return task_list_count[taskIdx];

}*/

void artemis_transition()
{
    uint64_t end_time = GetTime();
    taskEvent.timestamp = end_time;
    curctx->task->lastTime = end_time;
    curctx->task->status = TASK_FINISHED;
    save_prv2org ();
    artemis_contex_switch();
}


void artemis_contex_switch(){
    task_t *next_task;
    context_t *next_ctx;
    // double-buffered update to deal with power failure
    switch(curctx->task->status)
    {
    case TASK_FINISHED:

    // Calling monitor for task end
        taskEvent.taskAddr = curctx->task;
        taskEvent.kind = EndTask;
        save_prv2org ();
#ifdef OVERHEAD
        mon_ov = GetTime();
#endif
        _monitor_call(result,consume(taskEvent));
#ifdef OVERHEAD
        monitor_ov = monitor_ov + (GetTime() - mon_ov);
#endif
        artemis_check_monitor(result);
        // call monitor check and update status as TASK_READY

        /*curctx->task->status = TASK_NEXT;

        next_task = artemis_nexttask();
        next_ctx = (curctx == &context_0 ? &context_1 : &context_0 );
        next_ctx->task = next_task;
        next_ctx->task->pathState = curctx->task->pathState ^ 0x01;
        next_ctx->needCommit = 1;
        next_task->status = TASK_READY;

        // atomic update of curctx
        curctx = next_ctx;
        // call monitor for start
        taskEvent.taskAddr = curctx->task;
        taskEvent.kind = StartTask;
        taskEvent.cur_time = GetTime();
        _monitor_call(result,consume(taskEvent));
        artemis_check_monitor(result);*/
        break;
    /*case TASK_NEXT:
        next_task = artemis_nexttask();
        next_ctx = (curctx == &context_0 ? &context_1 : &context_0 );
        next_ctx->task = next_task;
        next_ctx->task->pathState = curctx->task->pathState ^ 0x01;
        next_ctx->needCommit = 1;
        next_task->status = TASK_READY;

        // atomic update of curctx
        curctx = next_ctx;
        // call monitor for start
        taskEvent.taskAddr = curctx->task;
        taskEvent.kind = StartTask;
        taskEvent.cur_time = GetTime();
        _monitor_call(result,consume(taskEvent));
        artemis_check_monitor(result);
        break;*/
    case TASK_READY:
/*        next_task = mayfly_constraint_check();
        next_ctx = (curctx == &context_0 ? &context_1 : &context_0 );
        next_ctx->task = next_task;
        next_ctx->needCommit = 1;
        next_task->status = TASK_READY;

        if(curctx->task->func != next_ctx->task->func){
            // kill curtask monitor
            taskEvent.taskAddr = curctx->task;
            taskEvent.kind = KillTask;
            //taskEvent.cur_time = GetTime();
            _monitor_call(result,consume(taskEvent));
        }*/
        /// Get time
        //curctx = next_ctx;
        // call monitor for start
        taskEvent.taskAddr = curctx->task;
        taskEvent.kind = StartTask;
        taskEvent.timestamp = GetTime();
        _monitor_call(result,consume(taskEvent));
        artemis_check_monitor(result);
        break;
    case TASK_INIT:
        next_task = artemis_nexttask();
        next_ctx = (curctx == &context_0 ? &context_1 : &context_0 );
        next_ctx->task = next_task;
        next_ctx->task->pathState = 1;
        next_ctx->needCommit = 1;
        next_task->status = TASK_READY;
        // atomic update of curctx
        curctx = next_ctx;
        // Calling monitor for task start
        taskEvent.taskAddr = curctx->task;
        taskEvent.kind = StartTask;
        taskEvent.timestamp = GetTime();
        _monitor_call(result,consume(taskEvent));
        artemis_check_monitor(result);
        break;
    }
    // fire task prologue
    task_prologue();
#ifdef INTERMITTENT
    CheckEnergy(curctx->task->energy,curctx->task->power);
#endif


    // jump to next tast
    __asm__ volatile ( // volatile because output operands unused by C
            "mov #0x2400, r1\n"
            "br %[ntask]\n"
            :
            : [ntask] "r" (curctx->task->func)
            );

}


/**
 * @brief save variable data to dirtylist
 *
 */
void write_to_gbuf(uint8_t *data_src, uint8_t *data_dest, size_t var_size) 
{
	// save to dirtylist
	*(data_size_base + num_dirty_gv) = var_size;
	*(data_dest_base + num_dirty_gv) = data_dest;
	*(data_src_base + num_dirty_gv) = data_src;
	// increment count
	num_dirty_gv++;
}


void sleep()
{
    while(1);
}

/** @brief Entry point upon reboot */
int main() {
	_init();

	// initialize monitor constraints
	if (!monitorInited){
	    constraintAssignment();
	    monitorInited = __SET;
	}
	 _monitor_finalize(result,consume(taskEvent));
	// (better alternative: transition_to(curctx->task);
/*
	 if(curctx->task->status == TASK_FINISHED)
	     curctx->task->status == TASK_NEXT;*/
	// check for update
	 artemis_contex_switch();
	//task_prologue();

	// jump to curctx
	/*__asm__ volatile ( // volatile because output operands unused by C
			"br %[nt]\n"
			);*/
}


