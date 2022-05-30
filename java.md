# Java

A general-purpose, concurrent, strongly typed, class-based, object-oriented programming language. Java applications are compiled into bytecode that runs on Java Virtual Machines (JVM).


## Primitives

All variables must first be declared before they can be used:
- byte: 8-bit signed two's complement integer.
- short: 16-bit signed two's complement integer.
- int: 32-bit signed two's complement integer.
- long: 64-bit two's complement integer.
- float: single-precision 32-bit floating point.
- double: double-precision 64-bit floating point.
- boolean: true or false.
- char: single 16-bit Unicode character.

In addition to the primitive data types, Java provides support for character strings via the `java.lang.String` class. Enclosing your character string within double quotes will automatically create a new String object. String are immutable, which means that once created, their values cannot be changed.


## Collections

Java provides a collections framework. A collection is an object that represents a group of objects. Among the advantages of the collections framework, are:
- Reducing programming effort by providing data structures and algorithms
- Increasing performance by providing high-performance implementations of data structures and algorithms

This framework includes three important interfaces such as:
- Set: unordered collection of unique objects (does **NOT** allow duplicates)
- List: ordered and indexed collection which may contain duplicates
- Map: data structure based on key-value pair and hashing (may contain duplicate values but the keys are always unique)

There are many concrete implementations of these interfaces available in the Collection API, e.g. ArrayList, LinkedList, LinkedHashSet, TreeSet, HashSet, HashMap.

**When to use List, Set, and Map in Java?**

List:
- Access elements frequently by using the index
- Store elements and maintain its insertion order

Set:
- Store unique elements

Map:
- Store data based on its key


## Memory model

Java does memory management automatically. This process is called **garbage collector**, and it is responsible for looking at heap memory, identifying (or marking) which objects are in use (referenced) and which are not, and deleting the unused (or unreferenced) objects. 

An in use object, or a referenced object, means that some part of your program still maintains a pointer to that object. An unused object, or unreferenced object, is no longer referenced by any part of your program. So the memory used by an unreferenced object can be reclaimed.

The heap is separated in three parts:
- Young Generation: where all new objects are allocated and "aged". When this part is full, a **minor garbage collection** happens (very quickly). Some objects are aged and eventually moved to the old generation.
- Old (or Tenured) Generation: where long surviving objects are stored. When this generation needs to be collected, a **major garbage collection** happens, which is much slower.
- Permanent Generation: where metadata required by the JVM is stored. This part is populated by the JVM at runtime based on classes used by the application and is included in a **full garbage collection**.

All minor and major garbage collections are considered **"Stop the World"** events. This means that all threads are stopped until the operation completes.


### References

- [What is Java? Definition, Meaning & Features of Java Platforms](https://www.guru99.com/java-platform.html)
- [Primitive Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [Collections Framework Overview](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html)
- [Difference between Set, List and Map in Java - Interview question](https://www.java67.com/2013/01/difference-between-set-list-and-map-in-java.html)
- [Describing Garbage Collection](https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/gc01/index.html)
