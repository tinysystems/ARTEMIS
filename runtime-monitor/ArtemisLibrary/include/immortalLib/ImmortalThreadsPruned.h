/*
 * ImmortalThreadsPruned.h
 *
 *  Created on: Feb 20, 2023
 *      Author: erenyildiz
 */

#ifndef IMMORTALLIB_IMMORTALTHREADSPRUNED_H_
#define IMMORTALLIB_IMMORTALTHREADSPRUNED_H_

#include <stdint.h>
#include "common.h"
#include "mem.h"

extern uint16_t cur_line;
extern privatization_buffer_t _imt_global_privatization_buffer;

/* defines the static variables in fram */
#define _def static __fram    /* for the lower FRAM area */
#define __def static __hifram /* for the lower HIFRAM area */

/* global variables */
#define _gdef __fram
#define __gdef __hifram


#define _begin                                                        \
  switch (cur_line) {                                                   \
  case 0:


#define _end                                                          \
  cur_line = __COUNTER__; /* set line counter to a different value */     \
  }                            /*  end switch */


void CHECKPOINT();

#define _CHECKPOINT()                                                          \
  cur_line = __COUNTER__ + 1;                                           \
  case __COUNTER__:

#define _WR(_arg_, _val_)                                                      \
  _CHECKPOINT();                                                               \
  _arg_ = _val_;

#define _WR_SELF(_type_, _arg_, _val_)                                         \
  extern privatization_buffer_t _imt_global_privatization_buffer;              \
  _CHECKPOINT();                                                               \
  *((_type_ *)&_imt_global_privatization_buffer.buffer[0]) = _val_;            \
  _CHECKPOINT();                                                               \
  _arg_ = *((_type_ *)&_imt_global_privatization_buffer.buffer[0]);

#define _monitor_call(val, func)                                         \
        val = func;                                                     \
        cur_line = 0;

#define _monitor_finalize(val, func)                                         \
        if (cur_line != 0)                                                   \
            _monitor_call(val, func)


#endif /* IMMORTALLIB_IMMORTALTHREADSPRUNED_H_ */
