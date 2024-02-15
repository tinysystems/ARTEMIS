# ARTEMIS Overview
ARTEMIS is the first framework designed to facilitate flexible property checking of intermittent programs at runtime. ARTEMIS is developed based on techniques from the area of runtime monitoring, offers a specification language for specifying an open set of properties, and provides automatic generation of monitors responsible for checking the properties. In ARTEMIS, developers use a language to define desired properties of the intermittent system, focusing on system properties rather than implementation specifics. You can obtain the ARTEMIS Property Specification Language by referring to our paper published in [EuroSys'24](https://2024.eurosys.org/).

This repository contains the code associated with EuroSys'24 paper #134 "Adaptable Runtime Monitoring for Intermittent Systems".


# Repository Structure
<p>ARTEMIS consists of two main components ARTEMIS Code Generation and ARTEMIS runtime/monitor.</p>

```
├── examples
│   └── ArtemisExample
│       ├── model.artemis
│       └── model.machine
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
    └── dsl
        ├── org.artemis.base.parent
        │   ├── org.artemis.base
        │   ├── org.artemis.base.ide
        │   ├── org.artemis.base.target
        │   ├── org.artemis.base.tests
        │   ├── org.artemis.base.ui
        │   ├── org.artemis.base.ui.tests
        │   └── pom.xml
        ├── org.artemis.sm
        │   ├── bin
        │   ├── build.properties
        │   ├── META-INF
        │   ├── model
        │   ├── plugin.xml
        │   ├── plugin.xml_gen
        │   ├── src
        │   ├── src-gen
        │   └── xtend-gen
        ├── org.artemis.sm.ide
        │   ├── bin
        │   ├── build.properties
        │   ├── META-INF
        │   ├── src
        │   └── src-gen
        ├── org.artemis.sm.tests
        │   ├── build.properties
        │   ├── META-INF
        │   ├── src
        │   ├── src-gen
        │   ├── test-bin
        │   └── xtend-gen
        ├── org.artemis.sm.ui
        │   ├── bin
        │   ├── build.properties
        │   ├── META-INF
        │   ├── plugin.xml
        │   ├── plugin.xml_gen
        │   ├── src
        │   └── src-gen
        ├── org.artemis.sm.ui.tests
        │   ├── build.properties
        │   ├── META-INF
        │   ├── src-gen
        │   └── test-bin
        └── org.artemis.spec.parent
            ├── org.artemis.spec
            │   ├── build.properties
            │   ├── META-INF
            │   ├── model
            │   ├── plugin.xml
            │   ├── plugin.xml_gen
            │   ├── pom.xml
            │   ├── src
            │   ├── src-gen
            │   ├── target
            │   └── xtend-gen
            ├── org.artemis.spec.ide
            │   ├── build.properties
            │   ├── META-INF
            │   ├── pom.xml
            │   ├── src
            │   ├── src-gen
            │   └── target
            ├── org.artemis.spec.target
            │   ├── org.artemis.spec.target.target
            │   └── pom.xml
            ├── org.artemis.spec.tests
            │   ├── build.properties
            │   ├── META-INF
            │   ├── pom.xml
            │   ├── src
            │   ├── src-gen
            │   ├── target
            │   └── xtend-gen
            ├── org.artemis.spec.ui
            │   ├── build.properties
            │   ├── META-INF
            │   ├── plugin.xml
            │   ├── plugin.xml_gen
            │   ├── pom.xml
            │   ├── src
            │   ├── src-gen
            │   └── target
            ├── org.artemis.spec.ui.tests
            │   ├── build.properties
            │   └── target
            └── pom.xml
```


## Runtime
