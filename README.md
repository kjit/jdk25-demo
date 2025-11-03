# jdk25-demo
Presentation of latest features and changes in JDK version 25

## Core Language Features:

- Primitive Types in Patterns (JEP 507, Third Preview): Enhanced pattern matching support for primitive types in instanceof and switch statements
- Module Import Declarations (JEP 511, Preview): New syntax to import entire module's public API
- Flexible Constructor Bodies (JEP 513): More flexible constructor definitions
- Compact Source Files and Instance Main Methods (JEP 512): Simplified class structure and instance-level main methods

## Concurrency Improvements:

 - Scoped Values (JEP 506, Final): A thread-safe alternative to ThreadLocal for sharing immutable data
 - Structured Concurrency (JEP 505, Fifth Preview): Better management of related concurrent tasks
 - Stable Values (JEP 502, Preview): Thread-safe single-assignment variables with deferred initialization

## Performance Enhancements:

- Compact Object Headers (JEP 519, Final): Reduced memory usage with 64-bit object headers (down from 96 bits)
- Vector API (JEP 508, Tenth Incubator): Improved support for vector computations
- Shenandoah GC improvements (JEP 521): Finalized generational garbage collector

## Security and Cryptography:

- Key Derivation Function API (JEP 510, Final): Official API for cryptographic key derivation
- PEM Encodings for Cryptographic Objects (JEP 470, Preview): Enhanced cryptography workflow support

## JFR Enhancements:
- CPU-time profiling on Linux (JEP 509, Experimental)
- Cooperative Sampling, Method Timing, and Tracing (JEP 518 & 520)

## Platform Changes:

- Removed support for 32-bit x86 (JEP 503)

