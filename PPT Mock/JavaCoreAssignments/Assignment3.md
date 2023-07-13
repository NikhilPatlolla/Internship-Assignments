**Q1. Write a simple Banking System program using OOPs concepts where you can get the account holder's name, balance, etc.?**

Here's an example of a simple banking system program in Java using OOPs concepts:

```java
class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 5000.0);
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(2000.0);
        account.withdraw(1500.0);
    }
}
```

In the above program, the `BankAccount` class represents a bank account with properties like `accountHolderName` and `balance`. It has methods to get the account holder's name, get the balance, deposit money, and withdraw money. The `main()` method in the `BankingSystem` class demonstrates the usage of the `BankAccount` class by creating an account, accessing account information, and performing deposit and withdrawal operations.

**Q2. Write a program where you inherit a method from a parent class and show method overriding concept?**

Here's an example program in Java that demonstrates method overriding:

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
}

public class MethodOverrideDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal is making a sound.

        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog is barking.
    }
}
```

In the above program, the `Animal` class has a `makeSound()` method that simply prints "Animal is making a sound". The `Dog` class extends the `Animal` class and overrides the `makeSound()` method to print "Dog is barking". When the `makeSound()` method is called on an instance of the `Animal` class, the parent class's method is invoked. When the `makeSound()` method is called on an instance of the `Dog` class, the child class's overridden method is invoked.

**Q3. Write a program to show runtime polymorphism in Java?**

Runtime polymorphism in Java is achieved through method overriding. Here's an example program that demonstrates runtime polymorphism:

```java
class Vehicle {
    public void drive() {
        System.out.println("Vehicle is being driven.");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is being driven.");
    }
}

class Bike extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Bike is being driven.");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        vehicle1.drive(); // Output: Car is being driven.

        Vehicle vehicle2 = new Bike();
        vehicle2.drive(); // Output: Bike is being driven.
    }
}
```

In the above program, the `Vehicle` class has a `drive()` method that simply prints "Vehicle is being driven". The `Car` and `Bike` classes extend the `Vehicle` class and override the `drive()` method with their specific implementations. The `main()` method demonstrates runtime polymorphism by creating instances of the `Car` and `Bike` classes and assigning them to a variable of type `Vehicle`. When the `drive()` method is called on these instances, the appropriate overridden method is invoked based on the actual object type.

**Q4. Write a program to show compile-time polymorphism in Java?**

Compile-time polymorphism in Java is achieved through method overloading. Here's an example program that demonstrates compile-time polymorphism:

```java
public class CompileTimePolymorphismDemo {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        CompileTimePolymorphismDemo demo = new CompileTimePolymorphismDemo();
        int sum1 = demo.add(5, 10);
        double sum2 = demo.add(3.5, 2.5);

        System.out.println("Sum of integers: " +

 sum1); // Output: Sum of integers: 15
        System.out.println("Sum of doubles: " + sum2); // Output: Sum of doubles: 6.0
    }
}
```

In the above program, the `CompileTimePolymorphismDemo` class has two overloaded `add()` methods. One method accepts two integers and returns their sum, while the other method accepts two doubles and returns their sum. The `main()` method demonstrates compile-time polymorphism by invoking the appropriate `add()` method based on the argument types. The Java compiler resolves the method call at compile-time based on the number and types of arguments.

**Q5. Achieve loose coupling in Java by using OOPs concepts?**

Loose coupling is a design principle that promotes independent and modular components in a software system. In Java, loose coupling can be achieved through the following OOPs concepts:

1. **Abstraction**: Use abstract classes or interfaces to define contracts and hide implementation details. Components can interact with each other through these abstractions, reducing dependencies on concrete implementations.

2. **Inheritance**: Utilize inheritance to establish relationships between classes and enable code reuse. By inheriting from abstract classes or implementing interfaces, components can be designed to work with common behaviors and still be loosely coupled.

3. **Composition**: Encapsulate objects within other objects to create higher-level components. Components can communicate with each other through well-defined interfaces, reducing direct dependencies and allowing for flexible composition of functionalities.

4. **Dependency Injection**: Instead of creating dependencies within a class, inject them from external sources. By using dependency injection frameworks or manual injection, dependencies can be easily replaced or modified, promoting loose coupling.

5. **Interface-based Programming**: Program to interfaces rather than concrete implementations. This allows components to depend on abstractions rather than specific implementations, enabling easy replacement or enhancement of components without affecting other parts of the system.

By applying these concepts, components can be developed and interconnected in a way that promotes flexibility, extensibility, and maintainability. Loose coupling allows for easier testing, reduces the impact of changes, and promotes modular and scalable software systems.

**Q6. What is the benefit of encapsulation in Java?**

Encapsulation is one of the fundamental principles of object-oriented programming. It refers to the bundling of data and methods within a class, where the class controls the access to its internal state. Encapsulation provides the following benefits in Java:

1. **Data Hiding**: Encapsulation hides the internal data of a class from external access, protecting it from unauthorized modifications. Only the methods of the class can access and modify the internal state, ensuring data integrity and security.

2. **Abstraction**: Encapsulation allows the class to provide an abstraction of its internal implementation details. It presents a public interface (methods) through which other classes can interact with the encapsulated data. This abstraction simplifies the usage of the class and promotes modular design.

3. **Encapsulation**: Encapsulation enables the class to encapsulate related data and methods together, making it easier to understand, manage, and maintain. By grouping data and methods, encapsulation enhances code organization and reduces complexity.

4. **Code Flexibility**: Encapsulation provides flexibility in modifying the internal implementation of a class without affecting the external code that uses the class. As long as the public interface remains the same, internal changes can be made without impacting the client code, facilitating code evolution and maintenance.

5. **Code Reusability**: Encapsulation promotes code reuse by encapsulating related behaviors and data into reusable classes. The encapsulated classes can be easily reused in other parts of the application or in different applications, leading to more efficient and modular code development.

Overall, encapsulation enhances the maintainability, flexibility, and security of the code by hiding the internal details and providing a well-defined public interface. It promotes good software engineering practices and enables the development of robust and scalable applications.

**Q7. Is Java a 100% Object-Oriented Programming language? If no, why?**

No, Java is not considered a 100% object-oriented programming (OOP) language. While Java follows many OOP principles and supports object-oriented concepts, there are a few aspects that deviate from pure OOP:

1. **Primitive Types**: Java includes primitive data types like `int`, `char`, `boolean`, etc., which are not objects. These primitive types do not have associated behaviors or methods and are not part of the class hierarchy.

2. **Static Members**: Java allows the declaration of static methods and variables at the class level. Static members belong to the class itself rather than specific instances and can be accessed without creating an object. This deviates from the concept of objects being the sole carriers of behavior and state.

3. **Procedural Programming**: Java supports procedural programming paradigms as well. It allows the use of procedural constructs like loops (`for`, `while`), conditional statements (`if`, `switch`), and functions (`static` methods) outside of classes. This mixing of procedural and object-oriented styles makes Java a hybrid language.

Despite these deviations, Java is widely considered an object-oriented language due to its extensive support for encapsulation, inheritance, polymorphism, and other object-oriented features. The majority of programming in Java revolves around objects and classes, making it suitable for object-oriented development.

**Q8. What are the advantages of abstraction

 in Java?**

Abstraction is a fundamental concept in object-oriented programming that focuses on hiding unnecessary details and exposing only essential information to the users of a class or module. In Java, abstraction offers several advantages:

1. **Simplifies Complexity**: Abstraction allows complex systems to be represented in a simplified manner by hiding irrelevant details. It provides a higher-level view of the system, making it easier to understand, maintain, and work with.

2. **Enhances Modularity**: Abstraction promotes modularity by encapsulating related data and behavior into classes and abstracting away the internal implementation details. It allows components to be developed and modified independently, making the codebase more modular and flexible.

3. **Promotes Code Reusability**: Abstraction enables the creation of reusable components by defining abstract classes and interfaces. These abstractions can be implemented by multiple classes, providing a common contract and promoting code reuse.

4. **Facilitates Team Collaboration**: Abstraction provides a clear separation between the internal implementation and the external usage of classes or modules. This separation allows multiple developers to work collaboratively on different parts of a system, as long as they adhere to the defined abstractions.

5. **Simplifies Maintenance and Updates**: Abstraction helps in isolating changes and minimizing the impact of modifications. By exposing a well-defined interface or contract, changes to the internal implementation can be made without affecting the code that depends on the abstraction.

6. **Improves Testability**: Abstraction allows for easier testing by providing clear boundaries between components. It enables the creation of testable units and facilitates the use of mocking or stubbing techniques to isolate dependencies.

Overall, abstraction in Java promotes code organization, reusability, maintainability, and collaboration. It allows developers to focus on essential concepts, hide unnecessary details, and build modular, scalable, and flexible software systems.

**Q9. What is abstraction explained with an example?**

Abstraction is a key concept in object-oriented programming that involves representing essential features and behaviors while hiding unnecessary details. It allows the creation of abstract classes and interfaces that define common characteristics and behaviors, which can be implemented by specific classes. Here's an example to illustrate abstraction in Java:

```java
abstract class Animal {
    public abstract void makeSound();

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog is barking.
        dog.sleep(); // Output: Animal is sleeping.

        Cat cat = new Cat();
        cat.makeSound(); // Output: Cat is meowing.
        cat.sleep(); // Output: Animal is sleeping.
    }
}
```

In the above example, the `Animal` class is an abstract class that defines an abstract method `makeSound()` and a concrete method `sleep()`. The `makeSound()` method is left abstract because different animal subclasses will have different sound implementations. The `sleep()` method is implemented in the `Animal` class and inherited by the `Dog` and `Cat` classes.

The `Dog` class and `Cat` class extend the `Animal` class and provide their specific implementations for the `makeSound()` method. The `main()` method demonstrates the usage of abstraction by creating instances of `Dog` and `Cat` and invoking their respective `makeSound()` and `sleep()` methods.

By using abstraction, we define a common behavior (`makeSound()`) that all animals should have, but we leave the specific implementation to the subclasses. This allows for code reusability, modularity, and the ability to work with abstract concepts without worrying about the specific details of each implementation.

**Q10. What is the final class in Java?**

In Java, the `final` keyword can be used to modify classes, methods, and variables. When applied to a class, the `final` keyword indicates that the class cannot be subclassed, i.e., it cannot be extended by other classes. Such a class is called a "final class". Here's an example:

```java
final class FinalClass {
    // Class implementation
}
```

In the above example, the `FinalClass` is marked as `final`, which means it cannot be extended by any other class. Any attempt to subclass `FinalClass` will result in a compilation error.

The main reasons for declaring a class as `final` are to prevent the class from being overridden and to ensure that its implementation remains unchanged. Final classes are often used for utility classes, where the behavior and functionality should not be modified or extended.

It's important to note that declaring a class as `final` also implies that all its methods are implicitly `final`. However, variables within the class can still be modified unless explicitly marked as `final`.

In summary, a final class in Java is a class that cannot be subclassed, providing an assurance that its implementation remains unchanged and preventing any modifications or extensions.