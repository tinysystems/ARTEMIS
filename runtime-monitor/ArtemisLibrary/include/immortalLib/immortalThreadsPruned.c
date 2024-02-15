/*
 * immortalThreadsPruned.c
 *
 *  Created on: Feb 20, 2023
 *      Author: erenyildiz
 */
//#include "ImmortalThreadsPruned.h"
#include "mem.h"
#include <stdint.h>
#include "common.h"

__fram volatile uint16_t cur_line;
__fram privatization_buffer_t _imt_global_privatization_buffer;



