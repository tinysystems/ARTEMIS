/*
 * monitor.h
 *
 *  Created on: Jun 2, 2023
 *      Author: erenyildiz
 */

#ifndef MONITOR_MONITOR_H_
#define MONITOR_MONITOR_H_

#include "monitorinfra.h"
#include "constraints.h"
#include "ImmortalThreadsPruned.h"

//extern monitoringConstraints monitorConstraints;
extern uint8_t monitorInited;

extern MonitorFeedback consume(MonitorEvent ev);
extern MonitorEvent taskEvent;
extern MonitorFeedback result;
void constraintAssignment();



#endif /* MONITOR_MONITOR_H_ */
