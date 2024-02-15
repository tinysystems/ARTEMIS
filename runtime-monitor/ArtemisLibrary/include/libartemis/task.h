/*
 * task.h
 *
 *  Created on: Aug 11, 2022
 *      Author: erenyildiz
 */

#ifndef LIBARTEMIS_TASK_H_
#define LIBARTEMIS_TASK_H_
#include "stdint.h"

typedef enum {TASK_READY = 1, TASK_FINISHED = 2, TASK_INIT = 0,  TASK_NEXT = 4} state_t;
typedef void (task_func_t)(void);
typedef unsigned task_idx_t;

#define SCRATCH_SIZE 0x10

#define CUR_TASK (curctx->task)
#define CUR_INFO (curctx->task->info)
#define CUR_SCRATCH (curctx->task->info.scratch)

/** @brief Task */
typedef struct task_t {
    /** @brief function address */
    task_func_t *func;
    /** @brief index (only used for showing progress) */
    task_idx_t idx;

    uint16_t pathState;

    uint64_t lastTime;

    uint64_t energy;

    uint64_t power;

    state_t status;
    /** @brief helpful for keeping track of state and return task */
    struct {
        unsigned int scratch[SCRATCH_SIZE];
        struct task_t *return_task;
    } info;
} task_t;

/** @brief Execution context */
typedef struct _context_t {
    /** @brief current running task */
    task_t *task;
    /** @brief indicate whether to jump to commit stage on power failure*/
    uint8_t needCommit;
} context_t;



#endif /* LIBARTEMIS_TASK_H_ */
