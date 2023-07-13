**Q1. What are the Conditional Operators in Java?**

In Java, the conditional operators are used to make decisions based on certain conditions. There are three conditional operators in Java:

1. **Ternary Operator (? : )**: It is the only ternary operator in Java and is used to evaluate a condition and return one of two expressions based on the result of the condition.

   Syntax: `condition ? expression1 : expression2`

   Example: `int result = (num > 0) ? num : -num;`

2. **Logical AND Operator (&&)**: It performs a logical AND operation between two boolean expressions and returns `true` if both expressions are `true`, otherwise returns `false`.

   Syntax: `expression1 && expression2`

   Example: `if (num > 0 && num < 10) { // do something }`

3. **Logical OR Operator (||)**: It performs a logical OR operation between two boolean expressions and returns `true` if at least one expression is `true`, otherwise returns `false`.

   Syntax: `expression1 || expression2`

   Example: `if (num == 0 || num == 10) { // do something }`

**Q2. What are the types of operators based on the number of operands?**

Operators can be classified into three categories based on the number of operands they require:

1. **Unary Operators**: These operators work with a single operand. Examples include unary plus (+), unary minus (-), logical NOT (!), and increment/decrement (++/--).

2. **Binary Operators**: These operators work with two operands. Examples include arithmetic operators (+, -, *, /), relational operators (<, >, <=, >=), logical operators (&&, ||), assignment operators (=, +=, -=, *=, /=), etc.

3. **Ternary Operator**: This is the only operator that requires three operands. It is represented as `condition ? expression1 : expression2` and is used for conditional operations.

**Q3. What is the use of Switch case in Java programming?**

The `switch` statement in Java is used to perform different actions based on different conditions. It allows a program to evaluate an expression and match its value against a list of cases. When a match is found, the corresponding block of code is executed.

The `switch` statement offers an alternative to using multiple `if-else` statements when dealing with multiple conditions. It provides a more concise and readable way to handle multiple possibilities.

**Q4. What are the conditional Statements and use of conditional statements in Java?**

Conditional statements in Java allow us to execute a specific block of code based on certain conditions. They help in controlling the flow of the program and making decisions. The two main types of conditional statements in Java are:

1. **if-else**: The `if-else` statement allows us to execute a block of code if a given condition is true, and an alternate block of code if the condition is false. It provides a way to branch the code based on the outcome of the condition.

2. **switch**: The `switch` statement provides a way to select one of many code blocks to be executed. It evaluates an expression and matches its value against a list of cases. When a match is found, the corresponding block of code is executed.

Conditional statements are essential for implementing decision-making logic in programs and enabling different behaviors based on specific conditions.

**Q5. What is the syntax of if else statement?**

The syntax of the `if-else` statement in Java is as follows:

```java
if (condition) {
    // code to be executed if the condition is true
} else {
    // code to be executed if the condition is false
}
```

The `if` statement is followed by a condition enclosed in parentheses. If the condition evaluates to `true`, the code block within the curly braces immediately following the `if` statement is executed. If the condition is `false`, the code block within the `else` section is executed (if present).

**Q6. How do you compare two strings in Java?**

In Java, there are multiple ways to compare two strings:

1. **Using the `equals()` method**: The `equals()` method compares the contents of two strings and returns `true` if they are equal, and `false` otherwise. It performs a case-sensitive comparison.

   Example: `String str1 = "Hello"; String str2 = "World"; boolean result = str1.equals(str2);`

2. **Using the `equalsIgnoreCase()` method**: This method is similar to `equals()`, but it performs a case-insensitive comparison. It returns `true` if the contents of the two strings are equal, ignoring the case, and `false` otherwise.

   Example: `String str1 = "Hello"; String str2 = "hello"; boolean result = str1.equalsIgnoreCase(str2);`

3. **Using the `compareTo()` method**: The `compareTo()` method compares two strings lexicographically. It returns a negative value if the first string is lexicographically less than the second string, a positive value if it is greater, and 0 if they are equal.

   Example: `String str1 = "Hello"; String str2 = "World"; int result = str1.compareTo(str2);`

   Note: The comparison is based

 on the Unicode value of each character in the strings.

**Q7. What is Mutable String in Java? Explain with an example**

In Java, the `String` class is immutable, which means that once a string object is created, its value cannot be changed. However, there is a mutable counterpart to the `String` class called `StringBuilder` (or `StringBuffer` for thread-safe operations).

A `StringBuilder` object can be used to create and manipulate mutable strings. It provides methods to append, insert, delete, and modify characters in the string. Unlike `String`, which creates a new object every time a modification is made, `StringBuilder` allows in-place modifications, reducing memory overhead.

Here's an example of using `StringBuilder`:

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
sb.insert(5, " Java");
sb.delete(11, 16);
String result = sb.toString();
System.out.println(result); // Output: Hello Java
```

In the above example, the `StringBuilder` object is created with the initial value "Hello". The `append()` method adds " World" to the string, `insert()` inserts " Java" at index 5, and `delete()` removes characters from index 11 to 15. Finally, the `toString()` method converts the `StringBuilder` object back to an immutable `String`.

**Q8. Write a program to sort a String Alphabetically**

Here's an example program in Java to sort a string alphabetically:

```java
import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String str = "programming";
        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);

        String sortedString = new String(charArray);
        System.out.println("Sorted string: " + sortedString);
    }
}
```

In the above program, we first convert the given string to a character array using the `toCharArray()` method. Then, we use the `sort()` method from the `Arrays` class to sort the character array in ascending order. Finally, we create a new string from the sorted character array using the `String` constructor and print the sorted string.

**Q9. Write a program to check if the letter 'e' is present in the word 'Umbrella'.**

Here's an example program in Java to check if the letter 'e' is present in the word 'Umbrella':

```java
public class LetterCheck {
    public static void main(String[] args) {
        String word = "Umbrella";
        boolean isPresent = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') {
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            System.out.println("The letter 'e' is present in the word.");
        } else {
            System.out.println("The letter 'e' is not present in the word.");
        }
    }
}
```

In the above program, we iterate through each character of the word using a `for` loop. Inside the loop, we check if the current character is equal to 'e'. If a match is found, we set the `isPresent` flag to `true` and exit the loop using the `break` statement. Finally, we check the value of the `isPresent` flag to determine if the letter 'e' is present or not in the word.

**Q10. Where exactly is the string constant pool located in the memory?**

In Java, the string constant pool is a part of the heap memory. More specifically, it is stored in the non-heap memory area known as the "PermGen" (Permanent Generation) space prior to Java 7 or the "Metaspace" from Java 8 onwards.

The string constant pool contains a pool of unique string literals created during the execution of a Java program. When a string literal is encountered, Java checks if it already exists in the string constant pool. If it does, a reference to the existing string object is returned. If not, a new string object is created in the pool and its reference is returned.

The location of the string constant pool in memory can vary based on the JVM implementation. However, it is typically stored in the heap memory along with other objects. The use of PermGen or Metaspace for storing the string constant pool depends on the JVM version and its memory management strategy.

It's important to note that with the introduction of the G1 Garbage Collector in Java 9, the PermGen space has been replaced by Metaspace, which is a native memory area.