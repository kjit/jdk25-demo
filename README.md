# jdk25-demo
Presentation of latest features and changes in JDK version 25

## Core Language Features:

- 512:  	Compact Source Files and Instance Main Methods (25)
- 513:  	Flexible Constructor Bodies (25)
- 511:   	Module Import Declarations (25)
- 456:  	Unnamed Variables & Patterns (22)

## Library API Enhancements:

### General improvements

- 485:  	Stream Gatherers (24)
- 506:  	Scoped Values (25)
- 484:  	Class-File API (24)
- 454:  	Foreign Function & Memory API (22)

### Security & Cryptography

- 510:  	Key Derivation Function API (25)
- 497:  	Quantum-Resistant Module-Lattice-Based Digital Signature Algorithm (24)
- 496:  	Quantum-Resistant Module-Lattice-Based Key Encapsulation Mechanism (24)

### Integrity by Default

- 472:  	Prepare to Restrict the Use of JNI (24)
- 498:  	Warn upon Use of Memory-Access Methods in sun.misc.Unsafe (24)
- 486:  	Permanently Disable the Security Manager (24)

## Tools

- 458:  	Launch Multi-File Source-Code Programs (22)
- 493:  	Linking Run-Time Images without JMODs (24)
- 467:  	Markdown Documentation Comments (23)

## Platform Changes:

### Flight Recorder

- 518:  	JFR Cooperative Sampling (25)
- 509:  	JFR CPU-Time Profiling (Experimental) (25)
- 520:  	JFR Method Timing & Tracing (25)

### Garbage Collectors

- 521: 		Generational Shenandoah (25)
- 475:  	Late Barrier Expansion for G1 (24)
- 423:  	Region Pinning for G1 (22)
- 474:  	ZGC: Generational Mode by Default (23)
- 490:  	ZGC: Remove the Non-Generational Mode (24)

### JIT Compilers

- 515:  	Ahead-of-Time Method Profiling (25)

### Run-Time System

- 483:  	Ahead-of-Time Class Loading & Linking (24)
- 514:  	Ahead-of-Time Command-Line Ergonomics (25)
- 519:  	Compact Object Headers (25)
- 491:  	Synchronize Virtual Threads without Pinning (24)

## Deprecations and removals

### HotSpot JVM

- 501:  	Deprecate the 32-bit x86 Port for Removal (24)
- 503:  	Remove the 32-bit x86 Port (25)
- 479:  	Remove the Windows 32-bit x86 Port (24)

### Libraries

- 471:  	Deprecate the Memory-Access Methods in sun.misc.Unsafe for Removal (23)

## Preview and incubating

### Language

- 507:  	Primitive Types in Patterns, instanceof, and switch (Third Preview) (25)

### Libraries

- 470:  	PEM Encodings of Cryptographic Objects (Preview) (25)
- 502:  	Stable Values (Preview) (25)
- 505:  	Structured Concurrency (Fifth Preview) (25)
- 508:  	Vector API (Tenth Incubator) (25)
