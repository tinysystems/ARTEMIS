/**
 * \file common.h
 * \brief Common utility fucntions and type definitions
 *
 * \copyright Copyright 2022 The ImmortalThreads authors. All rights reserved.
 * \license MIT License. See accompanying file LICENSE.txt at
 * https://github.com/tinysystems/ImmortalThreads/blob/main/LICENSE.txt
 */
#ifndef IMMORTALITY_COMMON_H_
#define IMMORTALITY_COMMON_H_


#include <stdbool.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

typedef struct {
  /**
   * privatization buffer for the _WR_SELF macro
   */
  uint64_t volatile buffer[3];
} privatization_buffer_t;

#ifdef __cplusplus
}
#endif

#endif /* ifndef IMMORTALITY_COMMON_H_ */
