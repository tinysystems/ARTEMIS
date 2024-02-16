# ARTEMIS Overview
ARTEMIS is the first framework designed to facilitate flexible property checking of intermittent programs at runtime. ARTEMIS is developed based on techniques from the area of runtime monitoring, offers a specification language for specifying an open set of properties, and provides automatic generation of monitors responsible for checking the properties. In ARTEMIS, developers use a language to define desired properties of the intermittent system, focusing on system properties rather than implementation specifics. You can obtain the ARTEMIS Property Specification Language by referring to our paper published in [EuroSys'24](https://2024.eurosys.org/).

This repository contains the code associated with EuroSys'24 paper #134 "Adaptable Runtime Monitoring for Intermittent Systems".


# Repository Structure
ARTEMIS consists of two main components ARTEMIS Code Generator ("src" folder) and ARTEMIS runtime/monitor (runtime-monitor folder). The repository also contains the example holder which includes a Heath Monitoring App.  

```
├── examples
│   ├── ArtemisExample                                 # Example Eclipse project that demonstrates ARTEMIS languages
│   |   ├── model.artemis                              # Example application with properties expressed in the ARTEMIS property specification language                      
│   |   └── model.machine                              # Representation of properties as state machines. The file is automatically generated from model.artemis
├── runtime-monitor
│   └── ArtemisLibrary
│       ├── include
│       │   ├── artemis.c                              # ARTEMIS runtime source code
│       │   ├── hardwareSim                            # Clock for Timekeeping Simulation
│       │   │   ├── clock.c
│       │   │   └── clock.h
│       │   ├── headers.h
│       │   ├── immortalLib                            # Pronned Immortal Thread Structure Used for Monitor
│       │   │   ├── common.h
│       │   │   ├── immortalThreadsPruned.c
│       │   │   └── ImmortalThreadsPruned.h
│       │   ├── libartemis                             # ARTEMIS runtime headers
│       │   │   ├── artemis.h
│       │   │   ├── interface.h
│       │   │   └── task.h
│       │   ├── libmsp                                 # Hardware libraries for MSP430
│       │   │   ├── mem.h
│       │   │   ├── watchdog.c
│       │   │   └── watchdog.h
│       │   └── monitor                                # ARTEMIS monitor source and headers
│       │       ├── constraints.h
│       │       ├── monitor.c
│       │       ├── monitor.h
│       │       └── monitorinfra.h
│       └── libArtemisLibrary.a                        # ARTEMIS Library object
└── src
    └── dsl                                            # Xtext projects that implement the ARTEMIS languages
        ├── org.artemis.base.parent
        │   ├── org.artemis.base                       # Base language that defines common constructs like predefined types, constants and expressions
        │   ├── org.artemis.base.ide                   # This and the remaining projects are automatically generated
        │   ├── org.artemis.base.target
        │   ├── org.artemis.base.tests
        │   ├── org.artemis.base.ui
        │   ├── org.artemis.base.ui.tests
        │   └── pom.xml
        ├── org.artemis.sm                             # ARTEMIS state machine language that extends the Base language
        ├── org.artemis.sm.ide
        ├── org.artemis.sm.tests
        ├── org.artemis.sm.ui
        ├── org.artemis.sm.ui.tests
        └── org.artemis.spec.parent                                 
            ├── org.artemis.spec                       # ARTEMIS property specification language that extends the Base language
            ├── org.artemis.spec.ide                   # This and the remaining projects are automatically generated
            ├── org.artemis.spec.target
            ├── org.artemis.spec.tests
            ├── org.artemis.spec.ui
            ├── org.artemis.spec.ui.tests
```

### ARTEMIS Languages and Code Generator
The implementation of the ARTEMIS languages is located in the "src/dsl" folder. There are three languages: Base (provides commonly found constructs), Spec - the ARTEMIS property specification language, and SM - the language for expressing monitors as state machines. All languages are implemented in the Xtext language workbench. The grammars can be found in the "src" folders of projects org.artemis.base, org.artemis.spec and org.artemis.sm. The code generator from property specifications to state machines can be found in project org.artemis.spec, package org.artemis.spec.generator.



### ARTEMIS Runtime/Monitor
The ARTEMIS runtime and monitor are located in the "runtime-monitor" folder as a static C library. This library includes hardware configuration for MSP430FR5994, as well as ARTEMIS source codes, such as memory configuration MACROS for non-volatile variables (mem.h), and a timekeeping simulator (clock.h). The ARTEMIS runtime's source code and headers can be found in the "libartemis" folder, while the ARTEMIS monitor's source code and headers are located in the "monitor" folder. Additionally, the Artemis C library includes a small version of Immortal Threads in the "ImmortalLib" folder, since the monitor code utilizes Immortal Threads to ensure monitoring against intermittent execution constraints.

### ARTEMIS Example
The example is located in folder "examples/ArtemisExample". It contains a model expressed in the ARTEMIS language and is an implementation of the example shown in [EuroSys'24 paper](https://2024.eurosys.org/).
