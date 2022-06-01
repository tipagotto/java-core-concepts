# Spring

**An open-source and lightweight solution (alternative to Java EE) for building enterprise application.**

## Dependency Injection(DI) and Inversion of Control (IoC)

Spring works as an IoC container. This container enables DI, in which an object is injected into another (target) object as a property via constructors/setters, instead of target object creating new instances themselves. In this approach, the application objects are just simple POJOs (Plain Old Java Object) that can be used in different environments/implementations. This helps achieving loose coupling by wiring independent components/objects.

**The Spring container will create the objects, wire them together, configure them, and manage their complete life cycle from creation till destruction. The Spring container uses dependency injection (DI) to manage the components that make up an application.**


## Aspect Oriented Programming (AOP)

AOP allows separation of cross-cutting concerns by adding behaviors (aspects) to the application code instead of application involving into those concerns itself. This enables application to be modular instead of mixing different concerns to a single place.


## Beans

**A Spring bean is an object that is instantiated, assembled, and managed by a Spring container. These beans are created with the configuration metadata supplied to the container.**


## Annotations

The use of annotations leverages Spring DI engine capabilities. Also, it adds *supplemental* information to a class.

Examples:
- @Configuration: classes that can contain bean definition methods annotated with @Bean.
- @Controller: classes that serve as a controller in Spring MVC.
- @Service: classes where the business logic should be placed.
- @Repository: classes where the database access logic should be placed (DAOs).
- @Components: classes with general purposes, e.g. REST resource classes.
- @Autowired: marks a dependency which Spring is going to resolve and inject. It can be used in a constructor, setter, or field injection.
- @Bean: marks a factory method which instantiates a Spring bean.
- @Qualifier: provides the bean id or bean name.
- @Value: injects property values into beans. It can be used in a constructor, setter, or field injection.
... @DependsOn, @Lazy, @Required, @Primary, @Scope, @Profile, @Import, @ComponentScan the list goes on...


### Stereotype Annotations and AOP: 

It is used to create a pointcut that targets all classes that have a particular stereotype.

Example: 
- Measuring the execution time of methods from the DAO layer. It is possible create an aspect (using AspectJ annotations - @Aspect, @Pointcut, @Around), taking advantage of the @Repository stereotype.
```java
@Aspect
@Component
public class PerformanceAspect {
    @Pointcut("within(@org.springframework.stereotype.Repository *)")
    public void repositoryClassMethods() {};

    @Around("repositoryClassMethods()")
    public Object measureMethodExecutionTime(ProceedingJoinPoint joinPoint) 
      throws Throwable {
        long start = System.nanoTime();
        Object returnValue = joinPoint.proceed();
        long end = System.nanoTime();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(
          "Execution of " + methodName + " took " + 
          TimeUnit.NANOSECONDS.toMillis(end - start) + " ms");
        return returnValue;
    }
}
```


## Transactions

On enterprise applications, transaction management is important to ensure data integrity and consistency.

The concept of transactions can be described using the ACID properties:
- Atomicity: a transaction consists of a single unit of work... either the entire sequence of operations is successful or unsuccessful.
- Consistency: the referential integrity of the database.
- Isolation: many transactions can be processed simultaneously... each transaction should be isolated from others to prevent data corruption.
- Durability: once a transaction is completed, its results are permanent

Spring framework provides an abstract layer on top of different transaction management APIs. Spring adds transaction capabilities to POJOs.

The `@EnableTransactionManagement` annotation can be used in a `@Configuration` class to enable transactional support.
Spring provides the `@Transactional` annotation at class or method levels. This annotation allows configuring:
- transaction Propagation Type
- transaction Isolation Level
- transaction operation Timeout
- transaction Rollback rules


## Extras

It is possible to find really good and simple explanation and code samples on [Baeldung](https://www.baeldung.com/).


#### References

- [Core Concepts Of The Spring Framework](https://www.dariawan.com/tutorials/spring/core-concepts-of-the-spring-framework/)
- [Spring - Quick Concepts and Example](https://www.logicbig.com/tutorials/spring-framework/spring-core/quick-start.html)
- [Part 1: Spring Annotations](https://www.techferry.com/articles/spring-annotations.html)
- [Spring Core Annotations](https://www.baeldung.com/spring-core-annotations)
- [Spring Bean Annotations](https://www.baeldung.com/spring-bean-annotations)
- [Spring - Transaction Management](https://www.tutorialspoint.com/spring/spring_transaction_management.htm)
- [Transactions with Spring and JPA](https://www.baeldung.com/transaction-configuration-with-jpa-and-spring)
