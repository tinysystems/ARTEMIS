/*
 * clock.h
 *
 *  Created on: Nov 4, 2022
 *      Author: erenyildiz
 */

#ifndef HARDWARESIM_CLOCK_H_
#define HARDWARESIM_CLOCK_H_

extern uint64_t sec;
extern uint64_t time_ms;
extern uint64_t volatile runtime_ov;
extern uint64_t volatile monitor_ov;
extern uint64_t volatile run_ov;
extern uint64_t volatile mon_ov;
extern uint64_t volatile Energy_ov;
void clockStart();
uint64_t GetTime();

#endif /* HARDWARESIM_CLOCK_H_ */
