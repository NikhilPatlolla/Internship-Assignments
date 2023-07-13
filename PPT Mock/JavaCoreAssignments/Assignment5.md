**Q1. What is Exception in Java?**

In Java, an exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. It represents an abnormal condition or error that can occur at runtime. Exceptions provide a mechanism to handle runtime errors and recover from them gracefully.

In Java, exceptions are represented by classes that extend the `java.lang.Exception` class or one of its subclasses. These exception classes form a hierarchy, with the root of the hierarchy being the `java.lang.Throwable` class. Exceptions are thrown and caught using the `try-catch` mechanism, allowing for the detection and handling of exceptional conditions.

When an exception occurs, the normal flow of the program is interrupted, and the control is transferred to a special block of code called the exception handler. The exception handler contains code that handles the exception, such as logging the error, displaying an error message, or taking appropriate actions to recover from the error.

**Q2. What is Exception Handling?**

Exception handling is the mechanism in Java that deals with runtime errors or exceptional conditions that may occur during the execution of a program. It allows the program to detect, handle, and recover from these exceptions, ensuring that the program doesn't abruptly terminate and providing a way to gracefully handle error scenarios.

Exception handling involves the following key components:

- `try`: The `try` block contains the code that may potentially throw an exception. It is followed by one or more `catch` blocks or a `finally` block.

- `catch`: The `catch` block is used to catch and handle specific types of exceptions. It contains the code that should be executed when a particular exception occurs. Multiple `catch` blocks can be used to handle different types of exceptions.

- `finally`: The `finally` block is used to specify code that should be executed regardless of whether an exception occurred or not. It is typically used to release resources or perform cleanup operations.

- `throw`: The `throw` keyword is used to explicitly throw an exception. It is typically used when a specific error condition is detected, and the program wants to indicate that condition to the calling code.

- `throws`: The `throws` keyword is used in a method declaration to specify that the method may throw certain types of exceptions. It is used to delegate the responsibility of handling exceptions to the calling code.

Exception handling allows for the separation of error-handling code from the normal program flow, improving code readability, maintainability, and robustness. It provides a way to gracefully handle errors, prevent program crashes, and recover from exceptional conditions.

**Q3. What is the difference between Checked and Unchecked Exceptions and Error?**

In Java, exceptions are classified into three categories: checked exceptions, unchecked exceptions, and errors. The main differences between these categories are as follows:

1. **Checked Exceptions**: Checked exceptions are exceptions that are checked at compile-time. These exceptions are subclasses of `java.lang.Exception` (excluding subclasses of `RuntimeException` and `Error`). Checked exceptions must be declared in the method signature using the `throws` keyword or caught using a `try-catch` block. Examples of checked exceptions include `IOException`, `SQLException`, and `ClassNotFoundException`. Checked exceptions represent recoverable conditions that a well-written application should anticipate and handle.

2. **Unchecked Exceptions**: Unchecked exceptions, also known as runtime exceptions, are exceptions that are not checked at compile-time. These exceptions are subclasses of `java.lang.RuntimeException`. Unchecked exceptions do not need to be declared in the method signature or caught explicitly. They can occur at runtime and are usually the result of programming errors or exceptional conditions that are difficult to recover from. Examples of unchecked exceptions include `NullPointerException`, `ArrayIndexOutOfBoundsException`, and `IllegalArgumentException`.

3. **Errors**: Errors are exceptional conditions that are not usually recoverable by the application. They represent serious problems that can occur at runtime, such as system failures, out of memory errors, or stack overflow errors. Errors are subclasses of `java.lang.Error` and are typically not caught or handled by the application code. Examples of errors include `OutOfMemoryError`, `StackOverflowError`, and `NoClassDefFoundError`.

The key difference between checked and unchecked exceptions is that checked exceptions must be either declared or caught, while unchecked exceptions do not have this requirement. Errors, on the other hand, represent severe and usually unrecoverable conditions that are not typically handled by the application.

**Q4. What are the differences between throw and throws in Java?**

In Java, `throw` and `throws` are keywords used in exception handling, but they serve different purposes:

- `throw` is used to explicitly throw an exception from a method or block of code. It is followed by an instance of an exception class or a subclass of `java.lang.Throwable`. When `throw` is encountered, the normal program flow is immediately terminated, and the control is transferred to the nearest enclosing `try-catch` block or the caller of the method. The `throw` statement allows you to indicate that a specific error condition has occurred and provide information about the exception.

- `throws` is used in the method declaration to indicate that the method may throw one or more types of exceptions. It is followed by a comma-separated list of exception classes. When a method declares that it throws an exception, it is essentially delegating the responsibility of handling that exception to the caller of the method. The caller can choose to catch the exception using a `try-catch` block or declare that it throws the exception further.

In summary, `throw` is used to explicitly throw an exception, while `throws` is used in the method declaration to indicate that the method may throw one or more exceptions. `throw` is used within a block of code to signal an exceptional condition, whereas `throws` is used in method signatures to specify the exceptions that can be thrown by the method.

**Q5. What is multithreading in Java? Mention its advantages.**

Multithreading in Java refers to the concurrent execution of multiple threads within a single program. A

 thread is a lightweight sub-process that can execute independently and concurrently with other threads. Multithreading allows a program to perform multiple tasks simultaneously, thereby achieving better efficiency and responsiveness.

Advantages of multithreading in Java include:

1. **Improved Performance**: Multithreading can improve the performance of a program by utilizing the available resources more efficiently. By executing multiple threads concurrently, the CPU and other system resources can be fully utilized, leading to faster and more efficient execution.

2. **Concurrency**: Multithreading enables concurrent execution of tasks. This is particularly useful in scenarios where multiple tasks need to be performed simultaneously or in parallel, such as handling user requests, processing data streams, or performing background tasks while the main program continues execution.

3. **Responsiveness**: Multithreading allows a program to be more responsive by preventing long-running tasks from blocking the user interface or other critical operations. By executing time-consuming tasks in separate threads, the main thread can remain responsive and continue to handle user interactions.

4. **Modularity and Maintainability**: Multithreading promotes modularity and maintainability by enabling the separation of different tasks into individual threads. Each thread can focus on a specific task, making the code easier to understand, modify, and maintain.

5. **Asynchronous Programming**: Multithreading enables asynchronous programming, where tasks can be executed concurrently and independently without blocking the main thread. This is particularly useful for handling I/O operations, network requests, and other tasks that involve waiting for external resources.

6. **Resource Sharing**: Multithreading allows multiple threads to share resources such as memory, files, and network connections. Proper synchronization mechanisms can be used to ensure thread safety and prevent conflicts or data corruption.

Overall, multithreading in Java provides opportunities for improved performance, responsiveness, concurrency, and modularity. It allows developers to take full advantage of modern hardware and enables the development of efficient and scalable applications.

**Q6. Write a program to create and call a custom exception.**

Here's an example of how to create and call a custom exception in Java:

```java
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyException("This is a custom exception");
        } catch (MyException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
```

In this example, we define a custom exception `MyException` by extending the `Exception` class. The `MyException` class has a constructor that takes a message as a parameter and passes it to the `Exception` class using the `super()` constructor.

In the `main()` method, we deliberately throw a `MyException` object using the `throw` keyword. The exception is caught in a `catch` block that specifically catches `MyException`. Inside the `catch` block, we print the message associated with the exception using the `getMessage()` method.

When this program is executed, it throws the custom exception `MyException` and catches it, printing the associated message "This is a custom exception".

**Q7. How can you handle exceptions in Java?**

Exceptions can be handled in Java using the `try-catch` block. The `try-catch` block allows you to catch and handle exceptions that may occur during the execution of a block of code.

The general syntax of the `try-catch` block is as follows:

```java
try {
    // Code that may throw an exception
} catch (ExceptionType1 exception1) {
    // Handle exception1
} catch (ExceptionType2 exception2) {
    // Handle exception2
} finally {
    // Code to be executed regardless of whether an exception occurred or not
}
```

Inside the `try` block, you write the code that may potentially throw an exception. If an exception occurs within the `try` block, the control is transferred to the corresponding `catch` block that matches the type of the exception. You can have multiple `catch` blocks to handle different types of exceptions.

The `finally` block is optional and is used to specify code that should be executed regardless of whether an exception occurred or not. It is typically used to release resources or perform cleanup operations.

Here's an example to illustrate exception handling in Java:

```java
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
```

In this example, the `divide()` method performs division between two numbers. In the `main()` method, we call the `divide()` method with arguments `10` and `0`, which will cause an `ArithmeticException` to be thrown.

 The exception is caught in the corresponding `catch` block, and an error message is printed. Finally, the `finally` block is executed regardless of the exception.

**Q8. What is Thread in Java?**

In Java, a thread is a lightweight unit of execution within a process. It represents a sequential flow of control within a program. A Java program can have multiple threads running concurrently, each executing a separate part of the program.

Threads allow for concurrent execution and can perform tasks independently and concurrently. They enable the program to execute multiple operations simultaneously, making efficient use of system resources and improving overall performance.

In Java, threads are implemented using the `java.lang.Thread` class. To create and start a new thread, you can either extend the `Thread` class and override its `run()` method, or implement the `Runnable` interface and provide the implementation for the `run()` method. The `run()` method contains the code that will be executed by the thread.

Here's an example of creating and starting a thread by extending the `Thread` class:

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
```

In this example, we create a class `MyThread` that extends the `Thread` class and overrides the `run()` method. Inside the `run()` method, we print a message indicating that the thread is running.

In the `main()` method, we create an instance of `MyThread` and start it by calling the `start()` method. The `start()` method internally calls the `run()` method, allowing the thread to execute its code.

When this program is executed, it creates and starts a new thread, which prints the message "Thread is running".

**Q9. What are the two ways of implementing thread in Java?**

In Java, there are two main ways to implement threads:

1. **Extending the `Thread` class**: You can create a subclass of the `Thread` class and override its `run()` method to define the code that will be executed by the thread. This approach requires you to define a new class for each thread you want to create. Here's an example:

```java
class MyThread extends Thread {
    public void run() {
        // Code to be executed by the thread
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
```

2. **Implementing the `Runnable` interface**: You can implement the `Runnable` interface and provide the implementation for its `run()` method. This approach allows you to separate the thread's code from the thread class itself, promoting better code organization and reusability. Here's an example:

```java
class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed by the thread
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
```

In this approach, you create a class `MyRunnable` that implements the `Runnable` interface and provides the implementation for the `run()` method. In the `main()` method, you create an instance of `MyRunnable` and pass it to the `Thread` constructor. Then, you start the thread by calling the `start()` method.

Both approaches allow you to create and run threads in Java, but implementing the `Runnable` interface is generally preferred as it offers more flexibility and allows for better separation of concerns.

**Q10. What do you mean by garbage collection?**

Garbage collection in Java is the process of automatically reclaiming the memory occupied by objects that are no longer in use. It is a mechanism provided by the Java Virtual Machine (JVM) to manage memory and deallocate objects that are no longer referenced by the program.

In Java, objects are created dynamically using the `new` keyword. Once an object is created, it occupies memory space in the heap. However, as the program executes, objects may become unreachable and no longer needed. If these objects are not explicitly deallocated, they can accumulate in memory and consume resources unnecessarily.

Garbage collection automates the process of reclaiming memory from unused objects. The JVM's garbage collector periodically identifies and marks objects that are no longer reachable or referenced by the program. It then releases the memory occupied by these objects, making it available for future allocations.

The key advantages of garbage collection are:

1. **Automatic Memory Management**: Garbage collection relieves the programmer from manually deallocating objects, reducing the risk of memory leaks and other memory-related errors. It automatically manages memory allocation and deallocation, making memory management less error-prone and more efficient.

2. **Improved Developer Productivity**: Garbage collection eliminates the need for manual memory management, allowing developers to focus on writing application logic rather than managing memory. It simplifies memory-related tasks and reduces the complexity of memory management code.

3. **Dynamic Memory Allocation**: Garbage collection enables dynamic memory allocation, allowing objects to be created and deallocated at

 runtime as needed. This flexibility improves the scalability and efficiency of Java applications.

4. **Prevention of Dangling Pointers**: Garbage collection prevents the occurrence of dangling pointers, which are pointers that reference memory locations that have been deallocated. By automatically deallocating objects, the garbage collector ensures that no references exist to inaccessible memory.

5. **Memory Optimization**: Garbage collection optimizes memory usage by reclaiming memory from unused objects. It allows the JVM to reuse memory and minimize memory fragmentation, resulting in more efficient memory utilization.

It's important to note that the garbage collector's operation is transparent to the programmer. The JVM manages the garbage collection process based on various algorithms and strategies, such as mark-and-sweep, generational collection, and concurrent garbage collection. The specific behavior and configuration of the garbage collector can be controlled through JVM options and parameters.