**Q1.1. Write a program to show Interface Example in Java?**

Here's an example program that demonstrates the use of interfaces in Java:

```java
// Interface definition
interface Shape {
    void draw(); // Abstract method
    double getArea(); // Abstract method
}

// Implementation of the interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Implementation of the interface
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        // Create objects of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Use the interface reference to call methods
        Shape shape1 = circle;
        shape1.draw();
        System.out.println("Area: " + shape1.getArea());

        Shape shape2 = rectangle;
        shape2.draw();
        System.out.println("Area: " + shape2.getArea());
    }
}
```

In the above example, we define an interface called `Shape` with two abstract methods: `draw()` and `getArea()`. The `Circle` and `Rectangle` classes implement the `Shape` interface and provide their specific implementations for the methods.

In the `main()` method, we create objects of `Circle` and `Rectangle` and assign them to the interface reference variables `shape1` and `shape2`. This allows us to call the methods `draw()` and `getArea()` through the interface reference, without knowing the specific implementation details of the objects.

By using interfaces, we can achieve abstraction and define a common contract for different classes. This promotes code reusability, modularity, and flexibility in Java programs.

**Q2. Write a program with 2 concrete methods and 2 abstract methods in Java?**

Here's an example program that demonstrates the use of concrete and abstract methods in Java:

```java
// Abstract class with abstract and concrete methods
abstract class Animal {
    // Abstract methods
    public abstract void makeSound();
    public abstract void move();

    // Concrete methods
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Concrete class extending the abstract class
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }

    @Override
    public void move() {
        System.out.println("Dog is running");
    }
}

// Concrete class extending the abstract class
class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird is chirping");
    }

    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}

// Main class
public class AbstractExample {
    public static void main(String[] args) {
        // Create objects of Dog and Bird
        Dog dog = new Dog();
        Bird bird = new Bird();

        // Call the abstract and concrete methods
        dog.makeSound();
        dog.move();
        dog.eat();
        dog.sleep();

        bird.makeSound();
        bird.move();
        bird.eat();
        bird.sleep();
    }
}
```

In the above example, we have an abstract class `Animal` with two abstract methods `makeSound()` and `move()`. The abstract class also contains two concrete methods `eat()` and `sleep()`. The `Dog` and `Bird` classes extend the `Animal` class and provide their specific implementations for the abstract methods.

In the `main()` method, we create objects of `Dog` and `Bird` and call the abstract and concrete methods on these objects. The concrete methods `eat()` and `sleep()` are inherited from the `Animal` class, while the abstract methods `makeSound()` and `move()` are overridden in the derived classes.

Abstract classes allow us to define a common interface for a group of related classes and provide a partial implementation of the methods. The derived classes extend the abstract class and provide their specific implementations for the abstract methods.

**Q3. Write a program to show the use of functional interface in Java?**

```java
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;

        int result1 = operate(5, 3, add);
        System.out.println("Addition: " + result1);

        int result2 = operate(10, 5, subtract);
        System.out.println("Subtraction: " + result2);

        int result3 = operate(4, 6, multiply);
        System.out.println("Multiplication: " + result3);
    }

    public static int operate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}
```

In this example, we define a functional interface `MathOperation` with a single abstract method `operate()`. The `@FunctionalInterface` annotation is used to indicate that the interface is intended to be used as a functional interface.

We then create lambda expressions for three different operations: addition, subtraction, and multiplication. Each lambda expression takes two integers as parameters and performs the respective mathematical operation.

The `operate()` method takes two integers and a `MathOperation` functional interface as arguments. It calls the `operate()` method of the functional interface, passing the two integers as parameters.

In the `main()` method, we demonstrate the use of lambda expressions by performing addition, subtraction, and multiplication using the `operate()` method. We pass the appropriate lambda expression for the desired operation.

**Q4. What is an interface in Java?**

In Java, an interface is a reference type that defines a contract of behavior that a class must implement. It represents a collection of abstract methods, constant variables, and default methods. An interface can also extend other interfaces, providing a way to create a hierarchy of interfaces.

Key points about interfaces in Java:

- An interface is declared using the `interface` keyword.
- It cannot be instantiated directly. However, it can be implemented by classes using the `implements` keyword.
- An interface can contain abstract methods, default methods, static methods, and constant variables.
- All methods in an interface are implicitly public and abstract. They do not have method bodies.
- An interface can extend multiple interfaces using the `extends` keyword.
- Classes implementing an interface must provide implementations for all the abstract methods defined in the interface.

Example of an interface in Java:

```java
interface Printable {
    void print();
}

class Book implements Printable {
    @Override
    public void print() {
        System.out.println("Printing a book...");
    }
}

class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing a document...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Printable book = new Book();
        book.print();

        Printable document = new Document();
        document.print();
    }
}
```

In this example, we define an interface `Printable` with a single abstract method `print()`. We then create two classes `Book` and `Document` that implement the `Printable` interface. Each class provides its own implementation of the `print()` method.

In the `main()` method, we create objects of the `Book` and `Document` classes and assign them to variables of type `Printable`. We call the `print()` method on each object, which invokes the respective implementation of the method.

**Q5. What is the use of interface in Java?**

The use of interfaces in Java is to define a contract of behavior that a class must adhere to. Some key uses of interfaces are:

1. **Defining a Contract**: An interface defines a contract that a class must follow. It specifies a set of methods that the implementing class must provide. This allows for code modularity and promotes code reusability.

2. **Achieving Multiple Inheritance**: Java does not support multiple inheritance of classes, but it allows a class to implement multiple interfaces. This allows a class to inherit behaviors from multiple interfaces, enabling it to exhibit polymorphic behavior and fulfill different roles.

3. **Enforcing Design Patterns**: Interfaces are commonly used to enforce design patterns, such as the Strategy pattern or Observer pattern. By defining interfaces, you can ensure that classes adhere to a specific structure or behavior, making the code more maintainable and extensible.

4. **Promoting Loose Coupling**: Interfaces promote loose coupling between classes by defining a contract without specifying the implementation details. This allows for interchangeable implementations and enhances code flexibility and modularity.

5. **Creating Mock Objects for Testing**: Interfaces are often used to create mock objects for testing purposes. By providing a mock implementation of an interface, you can simulate different scenarios and

 test various behaviors without relying on the actual implementations.

Overall, interfaces play a crucial role in defining contracts, promoting code modularity and reusability, achieving multiple inheritance-like behavior, enforcing design patterns, and facilitating unit testing.

**Q6. What is the lambda expression of Java 8?**

In Java 8, lambda expressions introduce functional programming concepts to the language. A lambda expression is a concise way to represent an anonymous function—a function that does not have a name. It provides a way to pass behavior as an argument to a method or assign it to a variable.

The syntax of a lambda expression consists of:

- A parameter list: Enclosed in parentheses, specifying the input parameters (if any).
- An arrow token (`->`): Separating the parameter list from the body of the lambda expression.
- A function body: Representing the behavior of the lambda expression.

Lambda expressions can be used wherever functional interfaces are expected. A functional interface is an interface that contains only one abstract method. Java provides several built-in functional interfaces, such as `Predicate`, `Consumer`, `Supplier`, and `Function`, among others.

Example of a lambda expression:

```java
// Example 1: Lambda expression with no parameters
Runnable runnable = () -> {
    System.out.println("Hello, Lambda!");
};
runnable.run();

// Example 2: Lambda expression with parameters
MathOperation addition = (a, b) -> a + b;
int sum = addition.operate(5, 3);
System.out.println("Sum: " + sum);
```

In the first example, a lambda expression is used to define an anonymous `Runnable` implementation. The lambda expression does not have any parameters, and the function body simply prints a message.

In the second example, a lambda expression is used to define an anonymous implementation of the `MathOperation` functional interface. The lambda expression takes two integers as parameters and returns their sum.

Lambda expressions provide a concise and expressive way to represent behavior, making the code more readable and maintainable. They are widely used in functional programming, stream processing, and parallel programming in Java 8 and later versions.

**Q7. Can you pass lambda expressions to a method? When?**

Yes, lambda expressions can be passed as arguments to methods. This is possible when the method parameter type is a functional interface that matches the signature of the lambda expression.

Functional interfaces are interfaces that contain only one abstract method. Since lambda expressions represent implementations of functional interfaces, they can be used wherever a functional interface is expected.

Here's an example that demonstrates passing a lambda expression to a method:

```java
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

class Calculator {
    public static int performOperation(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int result = Calculator.performOperation(5, 3, (a, b) -> a + b);
        System.out.println("Result: " + result);
    }
}
```

In this example, we have a functional interface `MathOperation` with a single abstract method `operate()`. The `Calculator` class has a static method `performOperation()` that takes two integers and a `MathOperation` functional interface as arguments. It calls the `operate()` method of the functional interface, passing the two integers as parameters.

In the `main()` method, we pass a lambda expression `(a, b) -> a + b` to the `performOperation()` method. The lambda expression represents the addition operation, and the method executes the lambda expression, resulting in the sum of the two integers.

Passing lambda expressions to methods allows for the flexibility to provide different behaviors dynamically without the need for creating separate implementations or classes. It enhances code reusability and promotes the use of functional programming paradigms.

**Q8. What is the functional interface in Java 8?**

In Java 8, a functional interface is an interface that contains exactly one abstract method. It is also known as a Single Abstract Method (SAM) interface. Functional interfaces are a key concept in Java's functional programming paradigm and are used in conjunction with lambda expressions and method references.

The primary purpose of functional interfaces is to enable the use of lambda expressions to represent implementations of the abstract method. By having only one abstract method, a functional interface can be easily implemented using lambda expressions, providing a concise and expressive way to define behavior.

Java 8 introduced the `@FunctionalInterface` annotation to designate an interface as a functional interface. While the annotation is not mandatory, it is a good practice to use it for clarity and to ensure that the interface is intended to be used as a functional interface.

Functional interfaces can contain default methods and static methods, as long as there is only one abstract method. These additional methods do not affect the functional nature of the interface.

Some examples of functional interfaces in Java 8 are `Runnable`, `Comparator`, `Predicate`, `Consumer`, `Supplier`, and `Function`.

Here's an example of a functional interface:

```java


@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
```

In this example, the `MathOperation` interface is annotated with `@FunctionalInterface`. It contains a single abstract method `operate()`, which takes two integers as parameters and returns an integer. This interface can be used to represent different mathematical operations using lambda expressions.

Functional interfaces provide the foundation for functional programming in Java. They enable the use of lambda expressions, promote code modularity and reusability, and facilitate the development of clean and expressive code.

**Q9. What is the benefit of lambda expressions in Java 8?**

Lambda expressions in Java 8 provide several benefits, including:

1. **Concise Syntax**: Lambda expressions offer a more concise syntax for representing behavior compared to traditional anonymous inner classes. They allow you to express functionality using a compact and readable syntax.

2. **Improved Readability**: Lambda expressions improve code readability by reducing boilerplate code and focusing on the essential behavior. They make the code more expressive and easier to understand.

3. **Functional Programming**: Lambda expressions enable functional programming concepts in Java. They allow you to treat behavior as a first-class citizen, facilitating the use of functional interfaces, higher-order functions, and functional programming patterns.

4. **Enhanced API Design**: Lambda expressions enable the design of APIs that accept behavior as arguments, making the APIs more flexible and reusable. This leads to more modular and composable code.

5. **Parallel and Concurrent Programming**: Lambda expressions are well-suited for parallel and concurrent programming. They provide a concise way to express parallelizable tasks, enabling easier utilization of multicore processors and improved performance.

6. **Code Maintainability**: By promoting cleaner and more expressive code, lambda expressions improve code maintainability. They make it easier to update or change behavior without modifying existing code.

7. **Code Reusability**: Lambda expressions promote code reusability by allowing behavior to be defined and reused in multiple contexts. They facilitate the creation of generic algorithms and functions that can operate on different data types or objects.

Overall, lambda expressions enhance the expressive power of Java, promote functional programming paradigms, improve code readability and maintainability, and enable more flexible and reusable code design.

**Q10. Is it mandatory for a lambda expression to have parameters?**

No, it is not mandatory for a lambda expression to have parameters. The presence or absence of parameters depends on the functional interface being used.

If a functional interface represents a parameterless behavior, the corresponding lambda expression can also be written without any parameters.

Here's an example of a lambda expression with and without parameters:

```java
// Lambda expression without parameters
Runnable runnable = () -> {
    System.out.println("Hello, Lambda!");
};
runnable.run();

// Lambda expression with parameters
MathOperation addition = (a, b) -> a + b;
int sum = addition.operate(5, 3);
System.out.println("Sum: " + sum);
```

In the first example, the lambda expression `() -> { System.out.println("Hello, Lambda!"); }` does not have any parameters. It represents a parameterless behavior.

In the second example, the lambda expression `(a, b) -> a + b` has two parameters `a` and `b`. It represents the addition operation, where the lambda expression takes two integers as parameters and returns their sum.

The decision to include or exclude parameters in a lambda expression depends on the functional interface's method signature and the specific behavior being represented.