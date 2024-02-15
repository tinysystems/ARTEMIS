/*
 * clock.c
 *
 *  Created on: Nov 4, 2022
 *      Author: erenyildiz
 */

#include <msp430.h>
#include "mem.h"
#include <stdlib.h>
#include <stdint.h>
#include "clock.h"

__nv uint16_t sec_counter = 37000;
__nv uint64_t sec = 0;
__nv uint64_t time_ms = 0;
__nv uint64_t volatile runtime_ov = 0;
__nv uint64_t volatile monitor_ov = 0;
__nv uint64_t volatile run_ov = 0;
__nv uint64_t volatile mon_ov = 0;
__nv uint64_t volatile Energy_ov = 0;
void clockStart(){
    TA4CCR0 = sec_counter;//max 65535
    TA4CTL = TASSEL__ACLK + MC_1;  //set the max period for 16bit timer operation
    TA4CCTL0 = CCIE;  //enable compare reg 0
//    TA4R = 0x00;
    _BIS_SR( GIE); //ENABLE GLOBAL INTERRRUPTS
}


void __attribute__ ((interrupt(TIMER4_A0_VECTOR))) Timer_A4 (void)
{

    sec++;

}
uint64_t GetTime(){

    time_ms = sec*1000 + (uint64_t)(TA4R/37);
    return time_ms;

}
