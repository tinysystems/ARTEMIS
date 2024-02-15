/*
 * monitor.c
 *
 *  Created on: Jun 4, 2023
 *      Author: erenyildiz
 */
#include <libartemis/task.h>
#include <stdio.h>
#include <stdlib.h>
#include "monitor/monitorinfra.h"
#include "ImmortalThreadsPruned.h"
#include "constraints.h"
#include "clock.h"
// derived from the concrete monitor
typedef enum {
    Idle,
    TaskRunning
} eMonitorState;

// variables and constants from the monitor
_gdef const int MAX_TRIES = 3;

//_gdef const MonitorFeedback MONITOR_OK = {OK, ""};

//_gdef int counter = 0;

//_gdef eMonitorState currentState = Idle;

// main logic, for now implemented as switch
// this also means that the monitor is just a single task
// but starting it requires some input from the runtime
// it is unclear if we will have complex monitors that need further decomposition.
// at any time of the activation, the monitor is supposed to execute just a single transition in the SM
MonitorFeedback consume(MonitorEvent ev) {


    _begin;
        _def MonitorEvent volatile ev_local;
        _def MonitorFeedback result;
        _def int i;
        _WR(ev_local, ev);
        _WR(result.action_response, NONE);
        if(ev_local.kind == StartTask){

            // Check Collection Constraints
            _WR(i,1);
            while( monitorConstraints[((task_t *)ev_local.taskAddr)->idx].collection[i].state ){
                if(monitorConstraints[((task_t *)ev_local.taskAddr)->idx].collection[i].collect
                        < monitorConstraints[((task_t *)ev_local.taskAddr)->idx].collection[i].collectLimit){
                    _WR_SELF(uint64_t, monitorConstraints[((task_t *)ev_local.taskAddr)->idx].collection[i].collect,
                             monitorConstraints[((task_t *)ev_local.taskAddr)->idx].collection[i].collect + 1);
                    _WR(result.action_response, monitorConstraints[((task_t *)ev_local.taskAddr)->idx].collection[i].action);
                    _WR(result.path ,  monitorConstraints[((task_t *)ev_local.taskAddr)->idx].collection[i].dataPath);
                    return result;
                    // TODO: Run dependent task

                }
                _WR_SELF(int,i, i+1);
            }

            // Check MTID constraints
            //
            _WR(i,1);
            while( monitorConstraints[((task_t *)ev_local.taskAddr)->idx].TID[i].state ){
                if((ev_local.timestamp - monitorConstraints[((task_t *)ev_local.taskAddr)->idx].TID[i].dependentTaskID->lastTime)
                        >= monitorConstraints[((task_t *)ev_local.taskAddr)->idx].TID[i].expireTime){
                    //Expired
                    _WR(result.action_response, monitorConstraints[((task_t *)ev_local.taskAddr)->idx].TID[i].action);
                    _WR(result.path, monitorConstraints[((task_t *)ev_local.taskAddr)->idx].TID[i].dataPath);
                    _WR(monitorConstraints[((task_t *)ev_local.taskAddr)->idx].TID[i].attemptCount, monitorConstraints[((task_t *)ev_local.taskAddr)->idx].TID[i].attemptCount + 1);
                    // if violated max attempt, send max attempt action type
                    if(monitorConstraints[((task_t *)ev_local.taskAddr)->idx].TID[i].attemptCount>monitorConstraints[((task_t *)ev_local.taskAddr)->idx].TID[i].maxAttempt){
                        if(result.action_response, monitorConstraints[((task_t *)ev_local.taskAddr)->idx].TID[i].maxAttemptState){
                            _WR(result.action_response, NONE);
                        }else{
                            _WR(result.action_response, monitorConstraints[((task_t *)ev_local.taskAddr)->idx].TID[i].maxAttemptAction);
                            _WR( monitorConstraints[((task_t *)ev_local.taskAddr)->idx].TID[i].maxAttemptState,1);
                        }
                    }
                    return result;
                }
                _WR_SELF(int,i, i+1);
            }


            // Check and Update Max Re-execution Attempt Constraints
            if(monitorConstraints[((task_t *)ev_local.taskAddr)->idx].reExecution.state ){
                if(monitorConstraints[((task_t *)ev_local.taskAddr)->idx].reExecution.count
                        > monitorConstraints[((task_t *)ev_local.taskAddr)->idx].reExecution.countLimit){

                    _WR(result.action_response, monitorConstraints[((task_t *)ev_local.taskAddr)->idx].reExecution.action);
                    _WR(result.path ,  monitorConstraints[((task_t *)ev_local.taskAddr)->idx].reExecution.dataPath);
                    _WR(monitorConstraints[((task_t *)ev_local.taskAddr)->idx].reExecution.count,0); //Restart Count
                    return result;
                }
                _WR_SELF(uint64_t,monitorConstraints[((task_t *)ev_local.taskAddr)->idx].reExecution.count,
                         monitorConstraints[((task_t *)ev_local.taskAddr)->idx].reExecution.count+1); // increase count
            }


            // Check Periodic Constraints
            if(monitorConstraints[((task_t *)ev_local.taskAddr)->idx].periodic.state){
                if(!monitorConstraints[((task_t *)ev_local.taskAddr)->idx].periodic.firstExe){
                    if(GetTime() - ((task_t *)ev_local.taskAddr)->lastTime
                                            > monitorConstraints[((task_t *)ev_local.taskAddr)->idx].periodic.period){

                        _WR(monitorConstraints[((task_t *)ev_local.taskAddr)->idx].periodic.firstExe, __SET); // after violation Set the first exe flag to restart operation
                        _WR(result.path ,  monitorConstraints[((task_t *)ev_local.taskAddr)->idx].periodic.dataPath);
                        _WR(result.action_response, monitorConstraints[((task_t *)ev_local.taskAddr)->idx].periodic.action);
                        return result;
                    }

                }else{
                    // If it is first execution of the task, reset first exe flag
                    _WR(monitorConstraints[((task_t *)ev_local.taskAddr)->idx].periodic.firstExe,__RESET);
                }

            }

            // Update Max Execution Time (deltaT)
            // TODO: Clarify deltaT means, if it represent the time from first start to end or from last start to end
            // current version assumes that it is from last start to end
            if(monitorConstraints[((task_t *)ev_local.taskAddr)->idx].deltaT.state ){
                _WR(monitorConstraints[((task_t *)ev_local.taskAddr)->idx].deltaT.startTime, ev_local.timestamp);
            }


        }else if (ev_local.kind == EndTask){

            // clear the attempt count for MTID
            _WR(i,1);
            while( monitorConstraints[((task_t *)ev_local.taskAddr)->idx].TID[i].state ){

                _WR(monitorConstraints[((task_t *)ev_local.taskAddr)->idx].TID[i].attemptCount, 0);
                _WR_SELF(int,i, i+1);
            }

            // Check Max Execution Time
            if(monitorConstraints[((task_t *)ev_local.taskAddr)->idx].deltaT.state ){
                //TODO: Check the end time (ev_local.timestamp) if it changes after reboot
                if(ev_local.timestamp - monitorConstraints[((task_t *)ev_local.taskAddr)->idx].deltaT.startTime
                        > monitorConstraints[((task_t *)ev_local.taskAddr)->idx].deltaT.expireTime){
                    _WR(result.action_response, monitorConstraints[((task_t *)ev_local.taskAddr)->idx].deltaT.action);
                    _WR(result.path, monitorConstraints[((task_t *)ev_local.taskAddr)->idx].deltaT.dataPath);
                    return result;

                }
            }


            // Update Collection Constraints
            // Clear collect
            while( monitorConstraints[((task_t *)ev_local.taskAddr)->idx].collection[i].state ){
               if(monitorConstraints[((task_t *)ev_local.taskAddr)->idx].collection[i].collect
                       >= monitorConstraints[((task_t *)ev_local.taskAddr)->idx].collection[i].collectLimit){

                   _WR( monitorConstraints[((task_t *)ev_local.taskAddr)->idx].collection[i].collect, 0);
               }
               _WR_SELF(int,i, i+1);
           }
        }
        return result;
        _end;
}




