# SOLID

SOLID Principles are coding standards for developers that helps avoiding a bad code design. It was promoted by Uncle Bob and is used across the object-oriented programming spectrum. When applied properly it makes the code more extendable, logical, and easier to read.


## Principles

### S - Single Responsibility

**A class should have one, and only one, reason to change.**

One class should serve only one purpose. All the methods and properties should work towards the same goal. When a class serves multiple purposes or responsibilities, it should be made a new class.

### O - Open-Closed

**Entities should be open for extension, but closed for modification.**

Software entities (classes, modules, functions, etc.) should be extendable without changing the contents of the extended class.

### L - Liskov Substitution

**Subclass/derived classes should be substitutable for their base/parent class.**

It states that any implementation of an abstraction (interface) should be substitutable in any place that the abstraction is accepted.

### I - Interface Segregation

**A client should not be forced to implement an interface that it doesn’t use.**

It means that interfaces should be broken into many smaller ones, so they better satisfy the exact needs of its clients.

### D - Dependency Inversion

**High-level modules should not depend on low-level modules. Both should depend on abstractions.**
**Abstractions should not depend on details. Details should depend on abstractions.**

Depend on abstractions, not on concretions. This way modules can be easily changed by other modules just changing the dependency module. Any changes to the lower-level module won't affect the higher-level one.


#### References

- [SOLID Principles-simple and easy explanation](https://betterprogramming.pub/solid-principles-simple-and-easy-explanation-f57d86c47a7f)
