# Decorator Design pattern

----
## What is Decorator


> Decorator allows us to extend the behavior of some object on runtime without affecting the other objects of the same class.

----
## When to use Decorator

    1. When sub classing is become impractical and we need large number of different possibilities to make independent 
    object or we can say we have number of combination for an object.
    2.  Secondly when we want to add functionality to individual object not to all object at run-time we use 
    decorator design pattern. 

----
## Examples 

* Tasks:

     1.[Pizza](https://stackoverflow.com/questions/2707401/understand-the-decorator-pattern-with-a-real-world-example)
     
     2.[Drawing](https://dzone.com/articles/decorator-design-pattern-in-java)

* [Real software](https://stackoverflow.com/questions/6366385/use-cases-and-examples-of-gof-decorator-pattern-for-io)

----
## Comparison with other design patterns

1. Decorator looks quite similar to Bridge design pattern but actually they are different:
Main difference is that Decorator classes extend the main class that they want to decorate,
in other words, they keep being the same type just enhancing some functionality. In contrary,
in case of Bridge design pattern, an one abstraction does not extend the other one, but just has it.