// constructs needed for every monitor, independent from state machine
#include "constraints.h"
typedef enum {
	StartTask,
	EndTask,
	KillTask
} eEventKind;

typedef enum {
	OK,
	FAILURE
} eMonitorResult;

typedef struct _MonitorEvent {
	eEventKind kind;
	uint64_t timestamp;
	uint64_t cur_time;
	void* taskAddr;
} MonitorEvent;

typedef struct _MonitorFeedback {
	eMonitorResult result;
	char* nextTask; // we may need to have a set of tasks. Not sure what is more convenient: to represent a task by name or as a number/enum
	type_action action_response;
	int path;
} MonitorFeedback;

