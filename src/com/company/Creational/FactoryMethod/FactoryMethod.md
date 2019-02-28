# Factory Method Design Pattern

----
## What is Factory Method


> Factory method pattern enables us to create an object without exposing the creation logic to the client and refer to 
the newly-created object using a common interface.

----
## When to use Factory Method

    1. A class cannot anticipate the type of objects it needs to create beforehand.
    2. A class requires its subclasses to specify the objects it creates.
    3. You want to localize the logic to instantiate a complex object.

---
### Steps

    1. Have an interface for the objects
    2. Have concrete classes impementing the same interface
    3. Have a factory with factory method to generate objects
    4. Use a factory to get a concrete class by passing needed information.
    
----
## Examples 

* Tasks:

   1. Let's suppose we want some cars, for different purposes (types) so we go to car factory,
      tell the types and needs and factory gives us some car, but we do not know how the car gonna be
      constructed. It will give a factory flexibility for some point change to producing car for the 
      same input parameters. 
   2. 

* Real Software 

  [Java calendar](https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html#getInstance--)