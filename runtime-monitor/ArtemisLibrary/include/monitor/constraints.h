/*
 * constraints.h
 *
 *  Created on: Jun 2, 2023
 *      Author: erenyildiz
 */

#ifndef MONITOR_CONSTRAINTS_H_
#define MONITOR_CONSTRAINTS_H_

#include <libartemis/task.h>
#include "stdint.h"
#include "stdbool.h"


#ifndef MAX_ARG
#define MAX_ARG 10
#endif

#ifndef MAX_TASK_NUM
#define MAX_TASK_NUM 20
#endif

#ifndef MAX_PATH_NUM
#define MAX_PATH_NUM 20
#endif

#define __SET 1;
#define __RESET 0;
typedef enum {NONE = 0, RESTART_TASK = 1, RESTART_PATH = 2, SKIP_TASK = 3,  SKIP_PATH = 4 } type_action;
typedef struct {
    uint64_t timeStamp;
    uint64_t expireTime;
    task_t *dependentTaskID;
    type_action action;
    uint64_t maxAttempt;
    uint64_t attemptCount;
    type_action maxAttemptAction;
    char maxAttemptState;
    int dataPath;
    char state;   //
}edge_TID;

typedef struct {
    uint64_t count;
    uint64_t countLimit;
    type_action action;
    int dataPath;
    bool state;   //
}edge_ReExe;

typedef struct {
    uint64_t collect;
    uint64_t collectLimit;
    task_t *dependentTaskID;
    type_action action;
    int dataPath;
    bool state;   //
}edge_Collect;

typedef struct {
    uint64_t startTime;
    uint64_t endTime;
    uint64_t expireTime;
    type_action action;
    int dataPath;
    bool state;   //
}edge_ExeTime;

typedef struct {
    bool firstExe;
    uint64_t period;
    type_action action;
    //uint64_t count;
    int dataPath;
    bool state;   //
}edge_Periodic;

typedef struct {
    edge_TID TID[MAX_ARG];
    edge_ReExe reExecution;
    edge_Collect collection[MAX_ARG];
    edge_ExeTime deltaT;
    edge_Periodic periodic;
}monitoringConstraints;

extern monitoringConstraints monitorConstraints[MAX_TASK_NUM];
#endif /* MONITOR_CONSTRAINTS_H_ */
