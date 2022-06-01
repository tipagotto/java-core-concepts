# Object Oriented Programming

**Object-oriented programming (OOP) is the most popular programming paradigm that relies on the concept of classes and objects.** It is used to structure a software program into simple, reusable pieces of code blueprints (classes), which are used to create instances of objects.

A class is an abstract blueprint used to create more specific, concrete objects. Classes can also contain functions, called methods available only to objects of that type. These functions are defined within the class and perform some action helpful to that specific type of object.


## Benefits

- Models complex things as simple structures
- Reusabability (objects can be used across the whole application)
- Allowing class-specific behaviors (polymorphism)
- Easier to debug
- Secure, protects information through encapsulation


## Building blocks

- Classes: user defined data types, a blueprint for the structure of methods and attributes. Individual objects are created from this blueprint.
- Objects: instances of classes created with specific data.
- Attributes: the information that is stored. Attributes are defined in the Class template.
- Methods: represent behaviors, perform actions, might return information about an object, or update an object's data.


## Principles

### Inheritance

**Child classes inherit data and behaviors from parent class.** Allows classes to inherit features of other classes (reusability).

If basic attributes and behaviors are defined in a parent class, child classes can be created extending the functionality of the parent class, and adding additional attributes and behaviors.

### Encapsulation

**Containing all important information inside an object, and only exposing selected information to the outside world.**

Requires defining some fields as private and some as public:
- Private (or Internal) interface: methods and properties, accessible from other methods of the same class.
- Public (or External) interface: methods and properties, accessible also from outside the class.

Benefits:
- Security (protects against common mistakes): only public methods and attributes are accessible from the outside.
- Supportable: most code undergoes updates and improvements.
- Hides complexity: no one can see what’s behind an object.

### Abstraction

**The user interacts with only selected attributes and methods of an object.** Abstraction uses simplified, high level tools, to access a complex object.

The main benefit here is that by using simple classes to represent complexity it is possible to hide complex details from the user.

### Polymorphism

**Designing objects to share behaviors.** Allows the same method to execute different behaviors.

Methods (uses inheritance):
- Overriding (at runtime): a child class can provide a different implementation than its parent class.
- Overloading (at compile time): methods may have the same name, but a different number of parameters passed into the method call. Different results may occur depending on the number of parameters passed in.


## Extras

Take a look at ["Exploring object-oriented programming concepts with Java"](https://www.educative.io/blog/object-oriented-programming-concepts-java).


#### References

- [What is object-oriented programming? OOP explained in depth](https://www.educative.io/blog/object-oriented-programming)
