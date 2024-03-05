---
title: "Java Revision Notes"
author: Milav Dabgar
geometry: "left=2.5cm,right=2.5cm,top=2cm,bottom=2cm"
header-includes:
  - \title{Java Revision Notes}
  - \author{Milav Dabgar}
  - \usepackage{fancyhdr}
  - \pagestyle{fancy}
  - \fancyhf{}
  - \renewcommand{\sectionmark}[1]{\markboth{#1}{}}
  - \renewcommand{\footrulewidth}{0.4pt}
  - \lhead[L]{\small\textbf{\leftmark}}
  - \rhead{\small\textbf{\thepage}}
  - \lfoot{\small\textbf{\thetitle}} 
  - \rfoot{\small\textbf{\theauthor}}
  - \makeatletter
  - \let\thetitle\@title
  - \let\theauthor\@author
  - \makeatother
  - \usepackage{listings}
  - \lstset{breaklines=true, postbreak=\mbox{\textcolor{red}{$\hookrightarrow$}\space}}
---

[TOC]
- [1. Unit 1: Introduction to Java Programming Language](#1-unit-1-introduction-to-java-programming-language)
  - [1.1. Java Overview](#11-java-overview)
  - [1.2. Brief History \& Evolution of Java](#12-brief-history--evolution-of-java)
  - [1.3. Java Features](#13-java-features)
  - [1.4. Java Applications](#14-java-applications)
  - [1.5. Java Environment Setup \& Basic Java Syntax](#15-java-environment-setup--basic-java-syntax)
  - [1.6. Java Components](#16-java-components)
  - [1.7. Setting up Java Development Environment](#17-setting-up-java-development-environment)
  - [1.8. Structure of a Java Program](#18-structure-of-a-java-program)
  - [1.9. Compilation and Execution of Java Program](#19-compilation-and-execution-of-java-program)
  - [1.10. Importance of Bytecode \& Garbage Collection](#110-importance-of-bytecode--garbage-collection)
  - [1.11. Data Types, Identifiers, Constants, and Variables](#111-data-types-identifiers-constants-and-variables)
  - [1.12. Primitive Data Types](#112-primitive-data-types)
  - [1.13. Type Conversion and Casting](#113-type-conversion-and-casting)
  - [1.14. Identifiers and Naming Conventions](#114-identifiers-and-naming-conventions)
  - [1.15. Variable Declaration and Initialization](#115-variable-declaration-and-initialization)
  - [1.16. Scope of Variables](#116-scope-of-variables)
  - [1.17. Declaring Constants (Final Keyword)](#117-declaring-constants-final-keyword)
  - [1.18. Arrays](#118-arrays)
  - [1.19. One-dimensional Arrays](#119-one-dimensional-arrays)
  - [1.20. Multidimensional Arrays (Two-dimensional)](#120-multidimensional-arrays-two-dimensional)
  - [1.21. Operators](#121-operators)
  - [1.22. Arithmetic Operators (+, -, \*, /, %)](#122-arithmetic-operators------)
  - [1.23. Relational Operators (\>, \<, \>=, \<=, ==, !=)](#123-relational-operators------)
  - [1.24. Logical Operators (\&\&, ||, !)](#124-logical-operators---)
  - [1.25. Bitwise Operators](#125-bitwise-operators)
  - [1.26. Assignment Operators (=, +=, -=, etc.)](#126-assignment-operators-----etc)
  - [1.27. Increment/Decrement Operators (++ ,--)](#127-incrementdecrement-operators----)
  - [1.28. Conditional (Ternary) Operator(?:)](#128-conditional-ternary-operator)
  - [1.29. Operator Precedence](#129-operator-precedence)
  - [1.30. Control Flow Statements](#130-control-flow-statements)
  - [1.31. Selection Statements (if, if-else, switch-case)](#131-selection-statements-if-if-else-switch-case)
  - [1.32. Looping Statements (for, while, do-while)](#132-looping-statements-for-while-do-while)
  - [1.33. Jump Statements (break, continue, return)](#133-jump-statements-break-continue-return)
- [2. Unit 2: Object-Oriented Programming](#2-unit-2-object-oriented-programming)
  - [2.1. Procedure-Oriented vs. Object-Oriented Programming](#21-procedure-oriented-vs-object-oriented-programming)
  - [2.2. Characteristics](#22-characteristics)
  - [2.3. Differences](#23-differences)
  - [2.4. OOP Concepts](#24-oop-concepts)
  - [2.5. Classes and Objects](#25-classes-and-objects)
  - [2.6. Encapsulation](#26-encapsulation)
  - [2.7. Abstraction](#27-abstraction)
  - [2.8. Inheritance](#28-inheritance)
  - [2.9. Polymorphism](#29-polymorphism)
  - [2.10. Classes and Objects](#210-classes-and-objects)
  - [2.11. Defining Classes](#211-defining-classes)
  - [2.12. Attributes and Methods](#212-attributes-and-methods)
  - [2.13. Creating Objects](#213-creating-objects)
  - [2.14. Access Modifiers](#214-access-modifiers)
  - [2.15. Methods](#215-methods)
  - [2.16. Method Signatures](#216-method-signatures)
  - [2.17. Passing Arguments](#217-passing-arguments)
  - [2.18. Returning Values](#218-returning-values)
  - [2.19. `static` Keyword](#219-static-keyword)
  - [2.20. Constructors](#220-constructors)
  - [2.21. Types of Constructors](#221-types-of-constructors)
  - [2.22. Default Constructors](#222-default-constructors)
  - [2.23. Parameterized Constructors](#223-parameterized-constructors)
  - [2.24. Copy Constructors, Passing Object as a Parameter](#224-copy-constructors-passing-object-as-a-parameter)
  - [2.25. Constructor Overloading](#225-constructor-overloading)
  - [2.26. Strings](#226-strings)
  - [2.27. `String` Class](#227-string-class)
  - [2.28. Common `String` Methods](#228-common-string-methods)
  - [2.29. User Input (Scanner Class)](#229-user-input-scanner-class)
  - [2.30. Using `Scanner` Class for User Input](#230-using-scanner-class-for-user-input)
  - [2.31. Command-line Arguments](#231-command-line-arguments)
- [3. Unit 3: Inheritance, Packages, and Interfaces](#3-unit-3-inheritance-packages-and-interfaces)
  - [3.1. Inheritance](#31-inheritance)
  - [3.2. Basics of Inheritance](#32-basics-of-inheritance)
  - [3.3. Types of Inheritance](#33-types-of-inheritance)
  - [3.4. `extends` Keyword](#34-extends-keyword)
  - [3.5. `super` Keyword](#35-super-keyword)
  - [3.6. Polymorphism: Method Overloading, Overriding \& Dynamic Dispatch](#36-polymorphism-method-overloading-overriding--dynamic-dispatch)
  - [3.7. Polymorphism](#37-polymorphism)
  - [3.8. Method Overloading](#38-method-overloading)
  - [3.9. Method Overriding](#39-method-overriding)
  - [3.10. Overriding Object Class Methods](#310-overriding-object-class-methods)
  - [3.11. Method Dynamic Dispatch](#311-method-dynamic-dispatch)
  - [3.12. Interfaces](#312-interfaces)
  - [3.13. Defining and Implementing Interfaces](#313-defining-and-implementing-interfaces)
  - [3.14. Defining Interfaces](#314-defining-interfaces)
  - [3.15. Implementing Interfaces](#315-implementing-interfaces)
  - [3.16. Multiple Inheritance Using Interfaces](#316-multiple-inheritance-using-interfaces)
  - [3.17. Abstract Class \& Final Class](#317-abstract-class--final-class)
  - [3.18. Abstract Class](#318-abstract-class)
  - [3.19. Abstract Class Syntax](#319-abstract-class-syntax)
  - [3.20. Abstract Methods](#320-abstract-methods)
  - [3.21. Differences from Interfaces](#321-differences-from-interfaces)
  - [3.22. Final Class](#322-final-class)
  - [3.23. Final Class Syntax](#323-final-class-syntax)
  - [3.24. Final Method](#324-final-method)
  - [3.25. Packages in Java](#325-packages-in-java)
  - [3.26. Creating Packages](#326-creating-packages)
  - [3.27. Importing Packages](#327-importing-packages)
  - [3.28. Access Rules: Access Control Within Packages](#328-access-rules-access-control-within-packages)
  - [3.29. Example: Access Control](#329-example-access-control)
- [4. Unit 4: Exception Handling and Multithreading](#4-unit-4-exception-handling-and-multithreading)
  - [4.1. Exception Handling in Java](#41-exception-handling-in-java)
  - [4.2. Errors vs. Exceptions](#42-errors-vs-exceptions)
  - [4.3. `try-catch-finally` Blocks](#43-try-catch-finally-blocks)
  - [4.4. Common Built-in Exceptions](#44-common-built-in-exceptions)
  - [4.5. Throwing Exceptions](#45-throwing-exceptions)
  - [4.6. Creating Custom Exceptions](#46-creating-custom-exceptions)
  - [4.7. Benefits of Exception Handling](#47-benefits-of-exception-handling)
  - [4.8. Multithreading in Java](#48-multithreading-in-java)
  - [4.9. Concepts of Threads and Processes](#49-concepts-of-threads-and-processes)
  - [4.10. Multithreading Benefits](#410-multithreading-benefits)
  - [4.11. Creating Threads](#411-creating-threads)
  - [4.12. Thread Lifecycle](#412-thread-lifecycle)
  - [4.13. Thread Priority](#413-thread-priority)
  - [4.14. Thread Exception Handling](#414-thread-exception-handling)
  - [4.15. Synchronization](#415-synchronization)
- [5. Unit 5: File Handling and Collections Framework](#5-unit-5-file-handling-and-collections-framework)
  - [5.1. File Handling in Java](#51-file-handling-in-java)
  - [5.2. Streams and Stream Classes](#52-streams-and-stream-classes)
  - [5.3. `FileInputStream` and `FileOutputStream`](#53-fileinputstream-and-fileoutputstream)
  - [5.4. Creation, Reading, and Writing Files](#54-creation-reading-and-writing-files)
  - [5.5. File Creation](#55-file-creation)
  - [5.6. Writing to a File](#56-writing-to-a-file)
  - [5.7. Reading from a File](#57-reading-from-a-file)
  - [5.8. Closing Streams](#58-closing-streams)
  - [5.9. Collections Framework in Java](#59-collections-framework-in-java)
  - [5.10. Overview and Hierarchy](#510-overview-and-hierarchy)
  - [5.11. `ArrayList`](#511-arraylist)
  - [5.12. `LinkedList`](#512-linkedlist)
  - [5.13. `HashMap`](#513-hashmap)
  - [5.14. `HashSet`](#514-hashset)
  - [5.15. The For-Each Loop](#515-the-for-each-loop)


# 1. Unit 1: Introduction to Java Programming Language

## 1.1. Java Overview

Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It was originally developed by James Gosling at Sun Microsystems (which is now a subsidiary of Oracle Corporation) and released in 1995 as a core component of Sun Microsystems' Java platform.

## 1.2. Brief History & Evolution of Java

- **Inception (1991):** Sun Microsystems initiated the Java project under James Gosling, aiming for embedded devices. Java was originally called "Oak".
- **Public Debut (1995):** Java was unveiled, focusing on web applets and its "Write Once, Run Anywhere" (WORA) philosophy.
- **Growth & Refinement:**  Subsequent releases (Java 2 and beyond) introduced major platforms (J2SE, J2EE, J2ME), significant language improvements, and vast libraries.
- **Oracle Acquisition (2010):** Oracle took ownership, driving Java's evolution.
- **Modern Era:** Java remains a powerhouse, adapting to cloud computing, big data, and modern development paradigms.

## 1.3. Java Features

- **Platform Independent**: Java code is compiled into bytecode, which can run on any device equipped with a JVM, enabling the famous principle of "write once, run anywhere" (WORA).

- **Object-Oriented**: Java strictly follows the object-oriented programming model, including concepts like inheritance, encapsulation, polymorphism, and abstraction.

- **Robust and Secure**: Java offers strong memory management, exception handling, and type-checking mechanisms. Its security features include the sandbox environment of the JVM.

- **Multithreaded**: Java supports multithreaded programming, allowing developers to build applications that can perform multiple tasks simultaneously.

- **Rich API**: Java provides a comprehensive standard library (API) that includes tools for networking, I/O, data structures, concurrency, and more.

- **High Performance**: While the early versions were criticized for performance, Java has significantly improved with the introduction of Just-In-Time (JIT) compilation and various optimization techniques.

## 1.4. Java Applications

- **Desktop Applications**: Java is used to develop cross-platform desktop applications. Swing and JavaFX are notable APIs for creating rich graphical user interfaces.
- **Web Applications**: Java is widely used in web development, with technologies such as Servlets, JSPs (JavaServer Pages), and frameworks like Spring and Hibernate facilitating the development of robust web applications.
- **Mobile Applications**: Java was the official language for Android app development until the introduction of Kotlin as an alternative. It remains widely used for Android development.
- **Enterprise Applications**: Java EE (Enterprise Edition) provides APIs and runtime environments for developing and running large-scale, multi-tiered, scalable, and secure network applications.
- **Big Data:** Tools within the Java ecosystem (like Hadoop, Spark) are widely used for processing vast datasets.
- **Embedded Systems:** Java finds use in certain embedded systems and IoT (Internet of Things) devices.
- **Scientific Applications:** Popular for computation, modeling, and simulation.

Java's versatility, robustness, and widespread adoption have cemented its place as a cornerstone of modern software development, covering a wide array of computing platforms from embedded devices to enterprise servers and supercomputers.

## 1.5. Java Environment Setup & Basic Java Syntax

## 1.6. Java Components

- **JVM (Java Virtual Machine)**: JVM is an abstract computing machine that enables Java bytecode to be executed on different platforms. It interprets the bytecode into machine-specific instructions.

- **JRE (Java Runtime Environment)**: A subset of the JDK, focused on running Java programs. JRE includes JVM along with libraries and other components required to run Java applications but does not include development tools.

- **JDK (Java Development Kit)**: The essential package for developing Java applications. JDK is a full-featured software development kit that includes JRE, compilers, debuggers, and other tools necessary for developing Java applications.

## 1.7. Setting up Java Development Environment

To set up a Java development environment:

1. **Download JDK**: Visit the official Oracle website or adopt openJDK distributions and download the JDK appropriate for your operating system.

2. **Install JDK**: Follow the installation instructions provided by Oracle or the respective distribution. This usually involves running an installer program.

3. **Set up Environment Variables**: Set the `JAVA_HOME` environment variable to point to the JDK installation directory and add the JDK's `bin` directory to the `PATH` environment variable.

4. **Verify Installation**: Open a command prompt or terminal and type `java -version` and `javac -version` to verify that Java and the Java compiler are installed correctly.

## 1.8. Structure of a Java Program

A basic Java program consists of:

```java
public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Output 
    }
}
```

- **Class Declaration**: Every Java program begins with a class declaration. The class name should match the filename. 

- **Main Method**: The main method is the entry point of a Java program. It has the following syntax:

  - 'Public' means the class/method is accessible from anywhere.
  - 'static' allows the JVM to call this method without creating an object of the class.
  - 'void' means the method doesn't return a value.
  - 'main' is a special method name.

  ```java
  public static void main(String[] args) {
      // Program logic goes here
  }
  ```

- **Output in Java**: Output in Java is typically achieved using the `System.out.println()` method:

  ```java
  System.out.println("Hello, World!");
  ```

- **Comments**: Java supports single-line (`//`) and multi-line (`/* */`) comments for documenting code.

## 1.9. Compilation and Execution of Java Program

To compile and execute a Java program:

1. **Write Code**: Create a Java source file with the `.java` extension containing the Java code.

2. **Compile Code**: Open a terminal or command prompt, navigate to the directory containing the Java file, and use the `javac` command to compile the code:

   ```
   javac YourProgram.java
   ```

3. **Execute Program**: After successfully compiling, use the `java` command followed by the name of the class containing the main method (without the `.class` extension) to execute the program:

   ```
   java YourProgram
   ```

## 1.10. Importance of Bytecode & Garbage Collection

- **Bytecode**: Java source code is compiled into bytecode, which is a platform-independent intermediate representation. This bytecode can be executed on any device with a JVM, enabling Java's "write once, run anywhere" capability.

- **Garbage Collection**: Java employs automatic memory management through garbage collection. It automatically deallocates memory occupied by objects that are no longer in use, preventing memory leaks and simplifying memory management for developers. Garbage collection helps ensure memory efficiency and program stability in Java applications.

## 1.11. Data Types, Identifiers, Constants, and Variables

## 1.12. Primitive Data Types

These are the fundamental building blocks provided by Java.

- Numeric:
  - Integer Types:
    - `byte` (8 bits)
    - `short` (16 bits)
    - `int` (32 bits)
    - `long` (64 bits)
  - Floating-Point Types:
    - `float` (32-bit single precision)
    - `double` (64-bit double precision)
- Character:
  - `char`  (16-bit Unicode character)
- Boolean:
  - `boolean`  (true or false)

## 1.13. Type Conversion and Casting

- **Implicit Conversion (Widening)**: Java automatically converts smaller data types to larger ones to prevent loss of data. For example, `int` can be implicitly converted to `long`.
  
- **Explicit Conversion (Narrowing)**: When converting larger data types to smaller ones, explicit casting is required to avoid loss of data. For example: `int myInt = (int) 3.14;`

## 1.14. Identifiers and Naming Conventions

- **Identifiers**: Identifiers are names given to classes, methods, variables, etc., in Java. They must start with a letter, underscore (_), or dollar sign ($), followed by letters, digits, underscores, or dollar signs.
  
- **Naming Rules**:
  - Can start with letters, underscores ( `_` ), or a dollar sign ( `$` ).
  
  - Subsequent characters can be letters, underscores, digits, or the dollar sign.
  - Case-sensitive (`myVariable` is different from `MyVariable`).
  - Cannot be reserved keywords (e.g., `if`, `class`, `while`).
  
-  **Naming Conventions**:
  - Class names should start with an uppercase letter and follow CamelCase (e.g., `MyClass`).
  - Variable and method names should start with a lowercase letter and follow camelCase (e.g., `myVariable`, `myMethod`).
  - Constants should be all uppercase with underscores separating words (e.g., `MAX_SIZE`).

## 1.15. Variable Declaration and Initialization

- **Variable Declaration**: Variables are declared with a data type followed by a name:
  
  ```java
  int myVariable;
  ```

- **Variable Initialization**: Variables can be initialized at the time of declaration or later in the code:
  
  ```java
  int myVariable = 10; // Initialization at declaration
  myVariable = 20;     // Later initialization
  ```

## 1.16. Scope of Variables

- **Instance Variables**: Variables declared within a class but outside any method are instance variables. They exist as long as the object they belong to exists.
  
- **Local Variables**: Variables declared within a method or block have local scope. They exist only within the method or block where they are declared.
  
- **Class Variables (Static Variables)**: Variables declared with the `static` keyword within a class are class variables. They are shared among all instances of the class.

## 1.17. Declaring Constants (Final Keyword)

- **Declaration:** Constants in Java are declared using the `final` keyword.
  
  ```java
  final double PI = 3.14159;
  ```

- **Immutable:** The value of a constant cannot be changed once initialized.

- By convention, constant names are written in uppercase letters with underscores separating words.

## 1.18. Arrays

**Definition:** 

An array is a data structure that stores a fixed-size collection of elements of the same data type. Each element is accessed by its index (position) within the array.

## 1.19. One-dimensional Arrays

- **Declaration**: To declare a one-dimensional array, specify the type of elements followed by square brackets []:
  
  ```java
  int[] numbers;
  ```

- **Initialization**: Arrays can be initialized using the `new` keyword followed by the type and the number of elements, or directly with values enclosed in curly braces {}:
  
  ```java
  int[] numbers = new int[5]; // Initializing with size
  int[] numbers = {1, 2, 3, 4, 5}; // Initializing with values
  ```

- **Accessing Elements**: Elements of an array are accessed using the index (starting from 0):
  
  ```java
  int[] numbers = {1, 2, 3, 4, 5};
  int firstElement = numbers[0]; // Accessing first element
  ```

- **Key points**

  - Array indices start at 0 and go up to the length of the array minus 1.

  - Trying to access an element outside the array bounds will result in an `ArrayIndexOutOfBoundsException`.

## 1.20. Multidimensional Arrays (Two-dimensional)

- **Declaration**: To declare a two-dimensional array, specify the type of elements followed by two sets of square brackets [][]:
  
  ```java
  int[][] matrix;
  ```

- **Initialization**: Two-dimensional arrays can be initialized similarly to one-dimensional arrays, with each row enclosed in curly braces {}:
  
  ```java
  int[][] matrix = new int[3][3]; // Instantiation with size
  int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Initializing with values
  ```

- **Accessing Elements**: Elements of a two-dimensional array are accessed using row and column indices:
  
  ```java
  int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
  int element = matrix[1][2]; // Accessing element at row 1, column 2 (value: 6)
  ```

- **Iterating Through a Two-dimensional Array**: Nested loops are commonly used to iterate through all elements of a two-dimensional array:
  
  ```java
  for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
          // Accessing each element using matrix[i][j]
          System.out.println(matrix[i][j]);
      }
  }
  ```

**Things to remember**

- Multidimensional arrays can have more than two dimensions.
- Rows and columns in a multidimensional array can have different lengths.
- Two-dimensional arrays can represent matrices, tables, grids, etc., and are useful for storing and processing structured data in Java.

## 1.21. Operators

## 1.22. Arithmetic Operators (+, -, *, /, %)

Arithmetic operators are used to perform mathematical operations.

- **Example**:

  ```java
  int a = 10;
  int b = 3;
  int sum = a + b;        // Addition
  int difference = a - b; // Subtraction
  int product = a * b;    // Multiplication
  int quotient = a / b;   // Division
  int remainder = a % b;  // Modulus (remainder)
  ```

## 1.23. Relational Operators (>, <, >=, <=, ==, !=)

Relational operators are used to establish relationships between two values.

- **Example**:

  ```java
  int a = 10;
  int b = 5;
  boolean greater = a > b;
  boolean lesserOrEqual = a <= b;
  boolean isEqual = a == b;
  boolean notEqual = a != b;
  ```

## 1.24. Logical Operators (&&, ||, !)

Logical operators are used to perform logical operations on boolean values.

- **Example**:

  ```java
  boolean x = true;
  boolean y = false;
  boolean result1 = x && y; // Logical AND
  boolean result2 = x || y; // Logical OR
  boolean result3 = !x;     // Logical NOT (negation)
  ```

## 1.25. Bitwise Operators

Bitwise operators perform bitwise operations on integer operands.

- **Example**:

  ```java
  int a = 5;  // Binary: 101
  int b = 3;  // Binary: 011
  int bitwiseAnd = a & b;       // Bitwise AND
  int bitwiseOr = a | b;        // Bitwise OR
  int bitwiseXor = a ^ b;       // Bitwise XOR
  int bitwiseComplement = ~a;   // Bitwise complement
  int leftShift = a << 1;       // Left shift
  int rightShift = a >> 1;      // Right shift
  ```

## 1.26. Assignment Operators (=, +=, -=, etc.)

Assignment operators are used to assign values to variables.

- **Example**:

  ```java
  int a = 10;
  a += 5; // Equivalent to a = a + 5;
  ```

## 1.27. Increment/Decrement Operators (++ ,--)

Increment and decrement operators are used to increase or decrease the value of a variable by 1.

- **Example**:

  ```java
  int a = 5;
  a++; // Increment a by 1
  int b = 10;
  b--; // Decrement b by 1
  ```

## 1.28. Conditional (Ternary) Operator(?:)

The conditional operator is a ternary operator that evaluates a boolean expression and returns one of two values depending on whether the expression is true or false.

- **Example**:

  ```java
  int a = 10;
  int b = 5;
  int max = (a > b) ? a : b; // max will be assigned the value of a if a is greater than b, otherwise b
  ```

These operators are fundamental in Java for performing various operations and making decisions based on conditions.

## 1.29. Operator Precedence

Java follows a specific order for evaluating expressions with multiple operators (similar to mathematical order of operations). You can find a detailed precedence table online.

**Examples**

```java
int x = 5 + 3 * 2;  // x will be 11 (Multiplication first)
boolean isGreater = 10 >= 5; // isGreater will be true 
int y = 10;
y++; // Postfix increment, y is now 11
++y; // Prefix increment, y is now 12 
int result = (2 > 3) ? 10 : 20; // result will be 20
```

## 1.30. Control Flow Statements

Control flow statements in Java are used to control the flow of execution in a program based on certain conditions or loops.

## 1.31. Selection Statements (if, if-else, switch-case)

- **if Statement**: Executes a block of code if a specified condition is true.

  ```java
  //Syntax
  if (condition) {
      // code to be executed if condition is true
  }
  ```

  ```java
  //Example
  int x = 10;
  if (x > 5) {
      System.out.println("x is greater than 5");
  }
  ```

- **if-else Statement**: Executes one block of code if the specified condition is true and another block of code if it's false.

  ```java
  //Syntax
  if (condition) {
      // code to be executed if condition is true
  } else {
      // code to be executed if condition is false
  }
  ```

  ```java
  //Example
  int x = 10;
  if (x > 5) {
      System.out.println("x is greater than 5");
  } else {
      System.out.println("x is less than or equal to 5");
  }
  ```

- **if-else-if Ladder:** Checks multiple conditions sequentially.

  ```java
  //Syntax
  if (condition1) {
      // ...
  } else if (condition2) {
      // ...
  } else {
      // ...
  }
  ```
  
- **switch-case Statement**: Evaluates an expression and executes code blocks based on matching cases.

  ```java
  //Syntax
  switch (expression) {
      case value1:
          // code to be executed if expression matches value1
          break;
      case value2:
          // code to be executed if expression matches value2
          break;
      // ... more cases
      default:
          // code to be executed if no cases match
  }
  ```

  ```java
  //Example
  int day = 3;
  switch (day) {
      case 1:
          System.out.println("Sunday");
          break;
      case 2:
          System.out.println("Monday");
          break;
      // Other cases...
      default:
          System.out.println("Invalid day");
  }
  ```

## 1.32. Looping Statements (for, while, do-while)

- **for Loop**: Executes a block of code a specified number of times.

  ```java
  //Syntax
  for (initialization; condition; increment/decrement) {
      // code to be repeated 
  }
  ```

  ```java
  //Example
  for (int i = 0; i < 5; i++) {
      System.out.println("Iteration: " + i);
  }
  ```

- **while Loop**: Executes a block of code repeatedly as long as a specified condition is true.

  ```java
  //Syntax
  while (condition) {
      // code to be repeated 
  }
  ```

  ```java
  //Example
  int i = 0;
  while (i < 5) {
      System.out.println("Iteration: " + i);
      i++;
  }
  ```

- **do-while Loop**: Similar to the while loop, but the block of code is executed at least once before the condition is checked.

  ```java
  //Syntax
  do {
      // code to be repeated at least once
  } while (condition); 
  ```
  
  ```java
  //Example
  int i = 0;
  do {
      System.out.println("Iteration: " + i);
      i++;
  } while (i < 5);
  ```

## 1.33. Jump Statements (break, continue, return)

- **break Statement**: Terminates the loop or switch statement and transfers control to the statement immediately following the loop or switch.

  ```java
  for (int i = 0; i < 5; i++) {
      if (i == 3) {
          break; // Terminates the loop when i equals 3
      }
      System.out.println("Iteration: " + i);
  }
  ```

- **continue Statement**: Skips the current iteration of a loop and proceeds with the next iteration.

  ```java
  for (int i = 0; i < 5; i++) {
      if (i == 3) {
          continue; // Skips iteration when i equals 3
      }
      System.out.println("Iteration: " + i);
  }
  ```

- **return Statement**: Exits the current method and returns a value (if applicable) to the caller.

  ```java
  public int add(int a, int b) {
      return a + b; // Returns the sum of a and b
  }
  ```

These control flow statements provide essential mechanisms for directing the flow of execution in Java programs, allowing developers to implement conditional logic and repetitive tasks efficiently.

# 2. Unit 2: Object-Oriented Programming

## 2.1. Procedure-Oriented vs. Object-Oriented Programming

## 2.2. Characteristics

**Procedure-Oriented Programming (POP)**:

1. **Focus**: POP focuses on functions or procedures that operate on data.
2. **Data and Functions**: Data and functions are separate entities.
3. **Global Data**: Relies heavily on global data, which can lead to data integrity issues.
4. **Procedural Abstraction**: Emphasizes procedural abstraction, breaking down a problem into a sequence of steps.
5. **Top-Down Approach**: Follows a top-down approach, where the problem is broken down into smaller sub-problems.
6. **Examples:** C, FORTRAN, Pascal, BASIC

**Object-Oriented Programming (OOP)**:

1. **Focus**: OOP focuses on objects that encapsulate data and behavior.
2. **Data Encapsulation**: Data and functions are encapsulated within objects, promoting data hiding and encapsulation.
3. **Class and Object**: Relies on classes and objects to model real-world entities and interactions.
4. **Inheritance and Polymorphism**: Supports inheritance and polymorphism, enabling code reuse and flexibility.
5. **Bottom-Up Approach**: Often follows a bottom-up approach, where objects are identified and modeled to represent real-world entities.
6. **Examples:** Java, Python, C++, C#

## 2.3. Differences

| Characteristic    | Procedure-Oriented                            | Object-Oriented                                              |
| ----------------- | --------------------------------------------- | ------------------------------------------------------------ |
| Focus             | Functions or procedures                       | Objects (data + behavior)                                    |
| Program Structure | Top-down approach, functions within a program | Bottom-up approach, objects as building blocks               |
| Data              | Global or passed between functions            | Encapsulated within objects, accessed mainly via methods     |
| Security          | Less secure – data more exposed               | Improved security through data hiding and access control     |
| Modularity        | Code can be less modular                      | High modularity due to objects                               |
| Reusability       | Less reusable                                 | Code reusability enhanced through inheritance and classes    |
| Design Complexity | Suitable for smaller programs                 | Preferred for large, complex systems due to better modeling of real-world systems |

In summary, while POP emphasizes procedures and functions, OOP revolves around objects and their interactions, offering better encapsulation, code reusability, and maintainability for complex software systems. The choice between them often depends on the nature and scale of the project, as well as the preferences of the development team.

## 2.4. OOP Concepts

Object-Oriented Programming (OOP) is a programming paradigm that revolves around the concept of objects, which encapsulate data and behavior. OOP provides several key concepts to facilitate modular and organized software design.

## 2.5. Classes and Objects

- **Class**: A class is a blueprint for creating objects. It defines the properties (attributes) and behaviors (methods) that objects of the class will have.
  
  ```java
  public class Car {
      String color;
      int speed;
      
      void accelerate() {
          // Method to increase speed
      }
      
      void brake() {
          // Method to decrease speed
      }
  }
  ```

- **Object**: An object is an instance of a class. It represents a real-world entity and encapsulates both data (attributes) and behavior (methods).

  ```java
  Car myCar = new Car();
  myCar.color = "Red";
  myCar.speed = 60;
  myCar.accelerate();
  ```

## 2.6. Encapsulation

- **Bundling:** Combining data (attributes) and code (methods) that operates on that data within a single unit (class).
- **Protection:**  Controlling the visibility of data members using access modifiers (public, private, protected) to protect data integrity and hide implementation details.

**Example**: 

The attributes of a `BankAccount` object are encapsulated within the class, accessible and modifiable mainly through its methods.

```java
public class BankAccount {
    private double balance;
    
    public void deposit(double amount) {
        // Method to deposit money
    }
    
    public void withdraw(double amount) {
        // Method to withdraw money
    }
}
```

## 2.7. Abstraction

Abstraction refers to the process of hiding the implementation details of a class and showing only the essential features to the outside world. It focuses on what an object does rather than how it does it.

- **Simplification:** Focusing on essential characteristics and hiding complex details. Exposing only the necessary interface.
- **Levels of Abstraction:** Can be achieved through classes, abstract classes, and interfaces.

**Example**:

```java
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        // Method to draw a circle
    }
}

class Rectangle implements Shape {
    public void draw() {
        // Method to draw a rectangle
    }
}
```

## 2.8. Inheritance

Inheritance is a mechanism in which a new class (derived class or subclass) inherits properties and behaviors from an existing class (base class or superclass). It promotes code reuse and establishes a hierarchical relationship between classes.

- **Hierarchy:**  Creating new classes (subclasses) that inherit properties and behaviors of existing classes (superclasses)
- **Code Reusability:** Subclasses can reuse code from the superclass.
- **Extensibility:** Subclasses can add their own unique properties and behaviors.

**Example**:

```java
class Animal {
    void eat() {
        // Method to eat
    }
}

class Dog extends Animal {
    void bark() {
        // Method to bark
    }
}
```

## 2.9. Polymorphism

Polymorphism allows objects to be treated as instances of their superclass or as instances of their subclass. It enables flexibility and dynamic behavior in the program.

- **"Many Forms":** The ability of an object to take on different forms or behaviors depending on the situation.
- **Method Overloading:** Multiple methods in a class with the same name but different parameters.
- **Method Overriding:** A subclass provides a specific implementation of a method inherited from its superclass.

**Example**:

```java
class Animal {
    void makeSound() {
        // Method to make a generic animal sound
    }
}

class Dog extends Animal {
    void makeSound() {
        // Method to make a dog sound
    }
}

class Cat extends Animal {
    void makeSound() {
        // Method to make a cat sound
    }
}
```

These OOP concepts form the foundation of object-oriented design and programming. They enable developers to create modular, maintainable, and scalable software systems by modeling real-world entities and interactions in a structured and organized manner.

## 2.10. Classes and Objects

## 2.11. Defining Classes

In Java, a class is a blueprint for creating objects. It defines the structure and behavior of objects of that type.

**Syntax**

```java
public class MyClass {
    // Class body
}
```

**Example**

```java
public class Car { // 'public' allows access from anywhere
    // Fields (member variables) define attributes 
    private String model;  // 'private' limits access to within the class
    private int year;
    private String color;

    // Constructor: Special method to initialize an object
    public Car(String model, int year, String color) { 
        this.model = model; // 'this' refers to the current object
        this.year = year;
        this.color = color;
    }

    // Methods define behaviors
    public void startEngine() {
        System.out.println("Engine Starting...");
    }

    public void brake() {
        System.out.println("Braking..."); 
    }

    // Getters and setters (accessors and mutators) for controlled access 
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    } 

    // ... more getters and setters
}
```

## 2.12. Attributes and Methods

- **Attributes**: Attributes are variables that define the state of objects. They represent the data associated with objects of the class.

  ```java
  public class Car {
      String color;
      int speed;
  }
  ```

- **Methods**: Methods are functions that define the behavior of objects. They represent the actions that objects of the class can perform.

  ```java
  public class Car {
      void accelerate() {
          // Method to increase speed
      }
      
      void brake() {
          // Method to decrease speed
      }
  }
  ```

## 2.13. Creating Objects

Objects are instances of classes. They are created using the `new` keyword followed by the class constructor.

```java
MyClass obj = new MyClass();
```

- **this Keyword**: Inside a method or constructor, `this` refers to the current object. It is used to differentiate between instance variables and local variables with the same name.

```java
public class Person {
    String name;
    
    public void setName(String name) {
        this.name = name; // Assigning the parameter value to the instance variable
    }
}
```

## 2.14. Access Modifiers

Access modifiers control the visibility of classes, attributes, methods, and constructors.

- **public**: Accessible from anywhere.
- **protected**: Accessible within the same package and subclasses (even if they are in different packages).
- **private**: Accessible only within the same class.
- **default (no modifier)**: Accessible within the same package.

| Modifier                  | Access Within                                           |
| ------------------------- | ------------------------------------------------------- |
| **public**                | Class, Package, Other Packages                          |
| **protected**             | Class, Package, Subclasses (even in different packages) |
| **private**               | Class only                                              |
| **default (no modifier)** | Class, Package                                          |

```java
public class MyClass {
    public int publicAttribute;
    protected int protectedAttribute;
    private int privateAttribute;
    int defaultAttribute;
    
    public void publicMethod() {
        // Code
    }
    
    protected void protectedMethod() {
        // Code
    }
    
    private void privateMethod() {
        // Code
    }
    
    void defaultMethod() {
        // Code
    }
}
```

These access modifiers help in encapsulating and controlling the access to the members of a class, ensuring data hiding and security in Java programs.

## 2.15. Methods

## 2.16. Method Signatures

A method signature consists of the method name and the parameter list (type and order of parameters). The return type may also be considered part of the method signature, but it's not required for method overloading.

The unique identifier of a method. It consists of:

- **Name:**  What the method is called.
- **Parameter List:** The types and order of arguments the method accepts.
- **Return Type:** The type of value returned by the method (`void` if it doesn't return anything).

```java
public void methodName(int parameter1, String parameter2) {
    // Method body
}
```

## 2.17. Passing Arguments

- **Passing by Value**: Primitive data types are passed by value, meaning a copy of the value is passed to the method. Changes to the parameter inside the method do not affect the original value.

  ```java
  public void modifyValue(int x) {
      x = x + 1; // Changes made to x are local to this method
  }
  ```

- **Passing by Reference**: Objects are passed by reference, meaning the reference to the object is passed to the method. Changes to the object's state inside the method affect the original object.

  ```java
  public void modifyObjectValue(MyObject obj) {
      obj.setValue(10); // Changes made to the object's state affect the original object
  }
  ```

## 2.18. Returning Values

Methods can return values using the `return` statement.

- The `return` statement exits the method and sends a value back to where the method was called.
- The return type in the method signature must match the data type of the value being returned.
- Methods with a `void` return type don't return anything.

```java
public int add(int a, int b) {
    return a + b;
}
```

## 2.19. `static` Keyword

The `static` keyword is used to create class-level variables and methods. These belong to the class rather than to individual objects of the class. They can be accessed without creating an instance of the class.

- **Class-level Methods:** Methods declared `static` don't require an instance of the class to be called. They belong to the class itself. Use Cases:

  - Utility methods not tied to a specific object.
  - The `main` method  is `static` since it's your program's entry point.

- **Accessing Members:** `static` methods can only directly access other `static` members and cannot use the `this` keyword (since they don't operate on an object).

  **Example:**

  ```java
  public class MathUtils {
      public static double findCircumference(double radius) {
          return 2 * Math.PI * radius;
      }
  }
  ```


- **Static Variables**:

  ```java
  public class MyClass {
      static int count;
  }
  ```

- **Static Methods**:

  ```java
  public class MyClass {
      static void printMessage() {
          System.out.println("Hello, world!");
      }
  }
  ```

Static methods can be accessed using the class name:

```java
MyClass.printMessage();
```

Static variables and methods are shared among all instances of the class and can be accessed directly from the class itself.

These concepts help in organizing code, improving code reusability, and managing resources effectively in Java programs.

## 2.20. Constructors

- Special methods used to initialize the member variables of an object when it's created.
- Have the same name as the class.
- Do not have a return type, not even `void`.

## 2.21. Types of Constructors

## 2.22. Default Constructors

- If you don't define a constructor, Java provides a no-argument default constructor.
- It typically initializes members to their default values (e.g., 0 for numbers, null for objects).

## 2.23. Parameterized Constructors

Parameterized constructors allow initialization of object attributes with specific values passed as arguments during object creation. Used to provide flexibility when creating objects.

```java
public class Student {
    private String name;
    private int rollNumber;

    // Parameterized constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}
```

## 2.24. Copy Constructors, Passing Object as a Parameter

A copy constructor creates a new object by copying the attributes of an existing object. It takes an object of the same class as a parameter.

```java
public class Student {
    // ... (fields and other constructors)

    // Copy constructor
    public Student(Student otherStudent) {
        this.name = otherStudent.name;
        this.rollNumber = otherStudent.rollNumber;
    }
}
```

## 2.25. Constructor Overloading

Constructor overloading allows a class to have multiple constructors with different parameter lists. Java differentiates between constructors based on the number and types of parameters.

```java
public class MyClass {
    int value;
    
    // Non Parameterized constructor
    public MyClass() {
        value = 0;
    }
    
    // Parameterized constructor
    public MyClass(int v) {
        value = v;
    }
    
    // Overloaded constructor
    public MyClass(int v1, int v2) {
        value = v1 + v2;
    }
}
```

In the example above, `MyClass` has three constructors: a default constructor, a parameterized constructor with one parameter, and an overloaded constructor with two parameters.

Constructors are essential for initializing objects and setting up their initial state. They provide flexibility in object creation and initialization in Java.

## 2.26. Strings

## 2.27. `String` Class

- In Java, strings are treated as objects of the `String` class. This class provides numerous methods for manipulating and working with strings.
- **Immutability:**  It's important to remember that `String` objects in Java are immutable. Once a String is created, its contents cannot be changed.

```java
String str = "Hello, World!";
```

## 2.28. Common `String` Methods

- **charAt(int index)**: Returns the character at the specified index.

  ```java
  char ch = str.charAt(0); // Returns 'H'
  ```

- **contains(CharSequence s)**: Checks if the string contains the specified sequence of characters.

  ```java
  boolean contains = str.contains("World"); // Returns true
  ```

- **format(String format, Object... args)**: Returns a formatted string using the specified format string and arguments.

  ```java
  String formattedString = String.format("Hello, %s!", "John"); // Returns "Hello, John!"
  ```

- **length()**: Returns the length of the string.

  ```java
  int length = str.length(); // Returns 13
  ```

- **split(String regex)**: Splits the string into an array of substrings based on the specified regular expression.

  ```java
  String[] parts = str.split(", "); // Splits the string into parts separated by ", "
  ```

- **substring(int beginIndex)**: Returns a substring starting from the specified index.

  ```java
  String substring = str.substring(7); // Returns "World!"
  ```

- **substring(int beginIndex, int endIndex)**: Returns a substring from the specified begin index (inclusive) to the specified end index (exclusive).

  ```java
  String substring = str.substring(7, 12); // Returns "World"
  ```

- **toLowerCase()**: Converts all characters in the string to lowercase.

  ```java
  String lowercase = str.toLowerCase(); // Returns "hello, world!"
  ```

- **toUpperCase()**: Converts all characters in the string to uppercase.

  ```java
  String uppercase = str.toUpperCase(); // Returns "HELLO, WORLD!"
  ```

- **trim()**: Removes leading and trailing whitespace from the string.

  ```java
  String trimmed = "  Hello, World!  ".trim(); // Returns "Hello, World!"
  ```

These are some of the commonly used methods provided by the `String` class in Java for manipulating and working with strings. They enable various operations such as substring extraction, case conversion, searching, and splitting.

**Additional points**

- **String Concatenation:** You can use the `+` operator to join strings together.
- **String Comparison:**
  - Use `.equals()` for content comparison.
  - `==` in the case of strings compares object references, not always the content.
- **StringBuilder:** For frequent modifications, look into the `StringBuilder` class, which is mutable and may be more efficient.

## 2.29. User Input (Scanner Class)

In Java, the `Scanner` class is commonly used to read user input from the console. It provides various methods to read different types of input, such as integers, floating-point numbers, and strings.

## 2.30. Using `Scanner` Class for User Input

1. **Import `Scanner` class**: First, import the `Scanner` class from the `java.util` package.

   ```java
   import java.util.Scanner;
   ```

2. **Create a Scanner object**: Create an instance of the `Scanner` class to read input.

   ```java
   Scanner scanner = new Scanner(System.in);
   ```

3. **Read input**: Use the `Scanner` object's methods to read input from the console.

   ```java
   System.out.println("Enter your name: ");
   String name = scanner.nextLine(); // Read a line of text
   ```

   ```java
   System.out.println("Enter your age: ");
   int age = scanner.nextInt(); // Read an integer
   ```

4. **Close the Scanner**: It's good practice to close the `Scanner` object after reading input to release system resources.

   ```java
   scanner.close();
   ```

## 2.31. Command-line Arguments

Java programs can also accept command-line arguments, which are passed to the `main` method when the program is executed from the command line.

Command-line arguments can be accessed from the `args` array within the `main` method. Each element of the array corresponds to a command-line argument passed to the program.

- Arguments passed to your program when it's started from the command line.
- Accessed in the `String[] args` parameter of the `main` method.

**Example**

```java
public class CommandLineDemo {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("The first argument is: " + args[0]);
            System.out.println("There were " + args.length + " arguments passed.");
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}
```

**Run this from the command line like:**

```java
java CommandLineDemo hello world 
```

Command-line arguments are useful for passing information to a Java program when it is executed, such as configuration settings or file paths. They can be accessed and processed as needed within the program.

# 3. Unit 3: Inheritance, Packages, and Interfaces

## 3.1. Inheritance

Inheritance is a key concept in object-oriented programming (OOP) that allows a class to inherit properties and behavior from another class. It promotes code reuse and establishes a hierarchical relationship between classes.

## 3.2. Basics of Inheritance

- **Base Class (Superclass)**: The class whose properties and behavior are inherited by another class is called the base class or superclass.

- **Derived Class (Subclass)**: The class that inherits properties and behavior from another class is called the derived class or subclass.

- **Syntax**: In Java, inheritance is achieved using the `extends` keyword.

  ```java
  // Base class
  class Vehicle {
      // Properties and methods
  }
  
  // Derived class inheriting from Vehicle
  class Car extends Vehicle {
      // Additional properties and methods
  }
  ```

## 3.3. Types of Inheritance

1. **Single Inheritance:** A subclass inherits from only one superclass.

   ```java
   class Animal { ... } 
   class Dog extends Animal { ... } 
   ```

2. **Multiple Inheritance (Not directly supported in Java):** A subclass inheriting from multiple superclasses. Java avoids this using interfaces (we'll cover interfaces later).

3. **Multilevel Inheritance:** A subclass inherits from a class that is itself a subclass.

   ```java
   class Animal { ... }
   class Dog extends Animal { ... }
   class GoldenRetriever extends Dog { ... }
   ```

4. **Hierarchical Inheritance:**  Multiple subclasses inherit from a single superclass.

   ```java
   class Vehicle { ... } 
   class Car extends Vehicle { ... }
   class Truck extends Vehicle { ... }
   ```

5. **Hybrid Inheritance:**  A combination of multiple inheritance types. This can get complex, and Java doesn't directly support all variations.

## 3.4. `extends` Keyword

The `extends` keyword is used to establish an inheritance relationship between classes in Java.

```java
class Subclass extends Superclass {
    // Subclass definition
}
```

## 3.5. `super` Keyword

The `super` keyword is used to refer to the superclass or call superclass constructors and methods from the subclass.

- **Referring to Superclass Members**: Use `super` to access superclass members (fields and methods) from the subclass.

  ```java
  class Subclass extends Superclass {
      void display() {
          super.display(); // Call superclass method
          // Additional subclass code
      }
  }
  ```

- **Calling Superclass Constructor**: Use `super()` to call the superclass constructor from the subclass constructor.

  ```java
  class Subclass extends Superclass {
      Subclass() {
          super(); // Call superclass constructor
          // Subclass constructor code
      }
  }
  ```

In summary, inheritance allows classes to inherit properties and behavior from other classes, promoting code reuse and establishing a hierarchical relationship between classes. Java supports various types of inheritance, and the `extends` and `super` keywords are used to implement and work with inheritance in Java programs.

## 3.6. Polymorphism: Method Overloading, Overriding & Dynamic Dispatch

## 3.7. Polymorphism

The word "polymorphism" means "many forms." In Java, it refers to the ability of objects to behave differently depending on their specific type, enabling us to write more flexible and reusable code.

## 3.8. Method Overloading

Method overloading allows a class to have multiple methods with the same name but different parameter lists. The methods must have different parameter types or a different number of parameters.

- **Definition:** Having multiple methods with the same name within the same class, but with different parameter lists (different number of parameters or different parameter types).
- **Resolution at Compile Time:** The compiler determines at compile time which version of the method to call based on the arguments provided.

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}
```

## 3.9. Method Overriding

Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. The method signature (name and parameters) must be the same.

- **Definition:** A subclass redefines a method it inherits from a superclass. The subclass provides its own specific implementation of the inherited method.
- **Resolution at Runtime:** The JVM determines at runtime which version to call (subclass or superclass) based on the type of the object. This is the essence of dynamic dispatch.
- **Use of `@Override` Annotation:** Marking overridden methods with `@Override` helps avoid errors.

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
```

## 3.10. Overriding Object Class Methods

Java provides a set of methods in the `Object` class that can be overridden in subclasses to provide custom behavior. Commonly overridden methods include:

- **equals(Object obj)**: Compares two objects for equality.
- **toString()**: Returns a string representation of the object.
- **finalize()**: Called by the garbage collector before reclaiming the object's memory.
- **hashCode()**: Returns a hash code value for the object.

```java
class Student {
    int id;
    String name;
    
    // Overriding equals method
    @Override
    public boolean equals(Object obj) {
        // Custom equality check logic
    }
    
    // Overriding toString method
    @Override
    public String toString() {
        return "Student[id=" + id + ", name=" + name + "]";
    }
}
```

## 3.11. Method Dynamic Dispatch

Method dynamic dispatch (or dynamic method dispatch) is the process by which the correct version of a method is invoked at runtime, based on the actual type of the object.

```java
Animal animal = new Dog();
animal.makeSound(); // Dynamic dispatch invokes Dog's makeSound() method
```

In the example above, even though the reference `animal` is of type `Animal`, the `makeSound()` method of the `Dog` class is invoked because `animal` is referring to a `Dog` object. This allows for polymorphic behavior, where the same method call can exhibit different behavior depending on the actual type of the object at runtime.

Polymorphism, achieved through method overloading, overriding, and dynamic dispatch, allows for flexible and reusable code by enabling objects of different types to be treated uniformly.

## 3.12. Interfaces

## 3.13. Defining and Implementing Interfaces

- An interface is like a contract. It defines a set of methods that a class must implement, ensuring certain behaviors are guaranteed by the class.
- **Abstract:** Interfaces cannot be instantiated directly. They are used to achieve abstraction and provide a way to achieve multiple inheritance in Java through interface implementation.
- **Methods without Bodies:** Methods in an interface are by default abstract (without a body).
- **`implements` Keyword:** Classes implement interfaces using the `implements` keyword.
- **Benefits of Interfaces**
  - **Polymorphism:** You can treat objects of different classes that implement the same interface uniformly.
  - **Multiple Inheritance (via Interfaces):** A class can implement multiple interfaces, overcoming Java's restriction on direct multiple inheritance of classes.
  - **Abstraction:** Interfaces help to enforce a separation between interface (what an object can do) and implementation (how it does it).
  - **Loose Coupling:** Using interfaces helps to reduce dependencies between classes, making your code more flexible and maintainable.

## 3.14. Defining Interfaces

An interface is declared using the `interface` keyword followed by the interface name and a list of method signatures (without method bodies).

```java
interface Shape {
    double area();
    double perimeter();
}
```

## 3.15. Implementing Interfaces

To implement an interface, a class uses the `implements` keyword followed by the interface name. The class must provide implementations for all the methods declared in the interface.

```java
class Circle implements Shape {
    double radius;

    // Implementing area method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Implementing perimeter method
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
```

## 3.16. Multiple Inheritance Using Interfaces

Java supports multiple inheritance through interfaces, as a class can implement multiple interfaces. This allows a class to inherit from multiple sources, providing flexibility in code design.

```java
interface Drawable {
    void draw();
}

interface Colorable {
    void setColor(String color);
}

class Rectangle implements Drawable, Colorable {
    // Implementing draw method
    @Override
    public void draw() {
        // Draw rectangle
    }

    // Implementing setColor method
    @Override
    public void setColor(String color) {
        // Set rectangle color
    }
}
```

In the example above, the `Rectangle` class implements both the `Drawable` and `Colorable` interfaces, allowing it to provide implementations for methods defined in both interfaces.

Interfaces provide a way to achieve abstraction, decoupling the definition of methods from their implementation. They also enable code reuse and multiple inheritance, making Java programs more flexible and maintainable.

## 3.17. Abstract Class & Final Class

## 3.18. Abstract Class

An abstract class in Java is a class that cannot be instantiated directly and may contain abstract methods, which are declared but not implemented in the abstract class itself. Abstract classes are used to define a common interface for a group of subclasses while allowing subclasses to provide specific implementations for abstract methods.

## 3.19. Abstract Class Syntax

An abstract class is declared using the `abstract` keyword. It can contain both abstract and non-abstract methods.

- **`abstract` Keyword:** Abstract classes are declared using the `abstract` keyword.
- **Abstract Methods:** Can contain abstract methods (methods declared without a body, ending with a semicolon). Subclasses **must** implement these methods.
- **Concrete Methods:** Can also have regular methods with implementations.

```java
abstract class Shape {
    abstract double area(); // Abstract method
    double perimeter() {    // Non-abstract method
        return 0;
    }
}
```

## 3.20. Abstract Methods

An abstract method is declared using the `abstract` keyword and does not have an implementation in the abstract class. Subclasses must provide implementations for all abstract methods.

**Example**

```java
abstract class Vehicle { 
    private String model;
    
    public Vehicle(String model) {
        this.model = model;
    }

    // Abstract method
    public abstract void startEngine(); 

    // Concrete method 
    public void accelerate() {
        System.out.println("Accelerating...");
    }
}
```

## 3.21. Differences from Interfaces

| Feature              | Interface                                 | Abstract Class                                       |
| -------------------- | ----------------------------------------- | ---------------------------------------------------- |
| Instantiation        | Cannot be instantiated directly           | Cannot be instantiated directly                      |
| Method Declaration   | Only abstract method declarations         | Can have abstract methods AND concrete methods       |
| Implementation       | Provides no default implementation        | Can provide default implementations for some methods |
| Multiple Inheritance | A class can implement multiple interfaces | A class can extend only one abstract class           |

**When to Use an Abstract Class**

- Common functionality across subclasses, but not all methods make sense at the base level.
- Default implementations exist for some behaviors.
- You want to enforce a certain structure on your class hierarchy.

## 3.22. Final Class

- **Definition:** A class declared `final` cannot have any subclasses. It's like the end of an inheritance chain.
- Use Cases:
  - Prevent unwanted inheritance.
  - Classes with immutable characteristics (like `String`).
  - Classes with security-sensitive functionality.

Final classes are typically used when a class should not be extended or when all its methods are already implemented and should not be overridden.

## 3.23. Final Class Syntax

A final class is declared using the `final` keyword.

```java
final class FinalClass {
    // Class definition
}
```

## 3.24. Final Method

In addition to final classes, individual methods can also be marked as final. A final method cannot be overridden by subclasses.

```java
class Parent {
    final void display() {
        // Method implementation
    }
}

class Child extends Parent {
    // This will cause a compile-time error
    void display() {
        // Method implementation
    }
}
```

**Summary**

- Abstract classes provide a way to define a common interface for a group of subclasses and allow for both abstract and non-abstract methods.
- Final classes cannot be subclassed, and final methods cannot be overridden.
- Abstract classes are used when a class should not be instantiated directly, while final classes are used when a class should not be extended.
- You cannot have a class that is both `abstract` and `final`. They represent opposite concepts in terms of inheritance.

## 3.25. Packages in Java

Packages in Java are used to group related classes, interfaces, and sub-packages, making the code easier to manage and modularize. They help avoid naming conflicts and can also control access to classes and class members (methods and fields) due to their access levels.

They provide:

- **Organization:** Help manage large projects by avoiding naming conflicts.
- **Access Control:** Control the visibility of classes and members.
- **Namespace:** Create a unique namespace for your classes and interfaces.

## 3.26. Creating Packages

To create a package, you use the `package` keyword at the top of your Java source file. Each file can only declare one package, and all types (classes, interfaces, enums) declared in the file will belong to that package.

**Package Declaration:** At the top of your `.java` files, use the `package` keyword followed by the package name.

```java
// File: MyPackageClass.java
package com.example.mypackage; 

public class MyPackageClass {
    // Class contents
}
```

**Directory Structure:** Your project directory structure must reflect the package structure. The `com.example.mypackage` package would map to directories: `<project-folder>/com/example/mypackage`

## 3.27. Importing Packages

You can use types from other packages by importing them. The `import` statement is used for this purpose and can be placed after the package declaration and before class declarations in a Java file.

- **Importing a Single Class**: Imports a specific class from a package.

```java
import java.util.ArrayList;
```

- **Importing an Entire Package**: Uses the asterisk (*) as a wildcard character to import all classes from the specified package.

```java
import java.util.*;
```

**Built-in Packages**

- Java comes with a rich set of built-in packages in the Java API. Examples:
  - `java.lang` (String, Math, System, etc.)
  - `java.util`  (List, ArrayList, Scanner, etc.)
  - `java.io`   (File, InputStream, etc.)

## 3.28. Access Rules: Access Control Within Packages

Java uses access modifiers to control access levels for classes, constructors, methods, and variables. The access levels impact how members can be accessed from within their own package and from other packages.

| Access Modifier         | Access Within                                           |
| ----------------------- | ------------------------------------------------------- |
| `public`                | Class, Package, Other Packages                          |
| `protected`             | Class, Package, Subclasses (even in different packages) |
| `default` (no modifier) | Class, Package                                          |
| `private`               | Class only                                              |

- **`public`**: The member is accessible from any other class or package.
- **`protected`**: The member is accessible within its own package and by subclasses (including those in other packages).
- **`default` (no modifier)**: The member is accessible only within its own package. If no access modifier is specified, the default access level is applied.
- **`private`**: The member is accessible only within its own class.

## 3.29. Example: Access Control

```java
package packageOne;

public class ClassOne {
    public void publicMethod() {} // Accessible from any class
    protected void protectedMethod() {} // Accessible within package and subclasses
    void defaultMethod() {} // Accessible only within packageOne
    private void privateMethod() {} // Accessible only within ClassOne
}
```

If another class in a different package tries to access these methods, only `publicMethod()` and, under certain conditions, `protectedMethod()` (from a subclass) would be accessible.

Packages and access modifiers together provide a robust mechanism for encapsulating and organizing code, ensuring that internal implementations are well-protected and that the public interface of classes is clearly defined.

# 4. Unit 4: Exception Handling and Multithreading

## 4.1. Exception Handling in Java

Exception handling in Java is a powerful mechanism that handles runtime errors to maintain normal application flow. An exception is an event that disrupts the normal flow of the program's instructions.

## 4.2. Errors vs. Exceptions

- **Errors**: Indicate serious problems that a reasonable application should not try to catch. Most errors are abnormal conditions. Examples include `OutOfMemoryError` and `StackOverflowError`.
- **Exceptions**: Are conditions that a reasonable application might want to catch. Exceptions are divided into two categories: checked exceptions (those that must be caught or declared to be thrown) and unchecked exceptions (those that don't need to be explicitly caught or declared thrown).

## 4.3. `try-catch-finally` Blocks

- **try block**: Contains code that might throw an exception.
- **catch block**: Catches and handles the exception thrown by the try block.
- **finally block**: Executes after the try/catch block has completed. The finally block will execute whether or not an exception is caught or thrown. It's typically used for cleanup code.

```java
// Syntax
try {
    // Code that may throw an exception
} catch (ExceptionType name) {
    // Code to handle the exception
} finally {
    // Code to be executed after try block ends
}
```

```java
// Example
try {
    int result = 10 / 0; // Might throw an ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Error: Cannot divide by zero");
} finally {
    System.out.println("This code always executes.");
}
```

## 4.4. Common Built-in Exceptions

- `ArithmeticException`: Thrown for issues like division by zero.
- `NullPointerException`: Attempting to access or modify a null object reference.
- `ArrayIndexOutOfBoundsException`: Accessing an array with an illegal index.
- `ClassCastException`: Attempting to cast an object to a subclass of which it is not an instance.
- `NumberFormatException`: Attempting to convert a string to a numeric type but the string doesn't have an appropriate format.
- `IOException`: Signals problems during input/output operations.
- `IllegalArgumentException`:  When a method passes an invalid argument.

## 4.5. Throwing Exceptions

- **throw keyword**: Used within a method to throw an exception. Either the method must handle the exception using a try-catch block, or it must be declared to throw the exception using the `throws` keyword in the method signature.
- **throws keyword**: Indicates that a method may throw one or more exceptions. The calling method must handle these exceptions.
```java
public void myMethod() throws MyException {
    throw new MyException("Something went wrong");
}
```

## 4.6. Creating Custom Exceptions

You can create custom exceptions by extending the `Exception` class (for checked exceptions) or the `RuntimeException` class (for unchecked exceptions).

```java
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}
```

Custom exceptions allow you to create specific error types for your application, improving readability and maintainability.

## 4.7. Benefits of Exception Handling

- **Separation of Error-handling Code:** Improves readability and maintainability.
- **Graceful Recovery:** Allows your program to recover from errors instead of crashing.
- **Propagation:** Exceptions can bubble up the call stack if not handled locally.

## 4.8. Multithreading in Java

Multithreading in Java allows concurrent execution of multiple threads within a single process, enabling better utilization of CPU resources and improved application responsiveness. Here's an overview of key concepts and features:

## 4.9. Concepts of Threads and Processes

- **Process**: A process is an executing instance of a program that has its own memory space, resources, and state.
- **Thread**: A thread is the smallest unit of execution within a process. Threads share the same memory space and resources within a process.

## 4.10. Multithreading Benefits

- **Responsiveness:** UI remains responsive even during long-running tasks.
- **Resource Utilization:** Maximize CPU usage by allowing multiple threads to run concurrently.
- **Simplification:** Can break down complex tasks into smaller, independently running threads.

## 4.11. Creating Threads

In Java, threads can be created by either extending the `Thread` class or implementing the `Runnable` interface.

- **Extending Thread class**:

  ```java
  class MyThread extends Thread {
      public void run() {
          // Code to be executed in a separate thread
      }
  }
  
  // Creating and starting the thread
  MyThread thread = new MyThread();
  thread.start();
  ```

- **Implementing Runnable interface**:

  ```java
  class MyRunnable implements Runnable {
      public void run() {
          // Code to be executed in a separate thread
      }
  }
  
  // Creating a thread using the runnable object
  Thread thread = new Thread(new MyRunnable());
  thread.start();
  ```

## 4.12. Thread Lifecycle

The lifecycle of a thread in Java consists of several states:

- **New**: The thread is in the new state before it is started.
- **Runnable**: The thread is in the runnable state when it's ready to run, but the scheduler has not selected it to be the running thread.
- **Running**: The thread is in the running state when the processor is actively executing its code.
- **Blocked/Waiting**: The thread is in the blocked/waiting state when it's waiting for a resource or another thread to perform a task.
- **Terminated**: The thread is in the terminated state when it has completed its execution.

## 4.13. Thread Priority

Thread priority is used by the scheduler to determine the order of thread execution.

- Range from 1 (lowest) to 10 (highest), default is 5, where higher values indicate higher priority.
- `thread.setPriority()`, `thread.getPriority()`
- The OS scheduler uses priorities as suggestions, the behavior might be OS-dependent.

```java
thread.setPriority(Thread.MAX_PRIORITY); // Set highest priority
thread.setPriority(Thread.MIN_PRIORITY); // Set lowest priority
```

## 4.14. Thread Exception Handling

Exception handling in threads is similar to exception handling in other Java programs. 

- **Uncaught Exceptions:** If an exception isn't caught within a thread's `run` method, it terminates the thread.
- **UncaughtExceptionHandler:** Set a default handler per thread (`thread.setUncaughtExceptionHandler()`) or for all threads (`Thread.setDefaultUncaughtExceptionHandler()`) to log or handle these exceptions.
- You can catch exceptions within the `run()` method or propagate them to the caller using `throws` clause.

```java
class MyThread extends Thread {
    public void run() {
        try {
            // Code that may throw an exception
        } catch (Exception e) {
            // Handle the exception
        }
    }
}
```

## 4.15. Synchronization

Synchronization in Java is used to control access to shared resources by multiple threads. It prevents concurrent access to shared resources, avoiding data corruption and inconsistency.

- **Critical Sections:** Code blocks that should be executed by only one thread at a time.
- **`synchronized` keyword:**  Use on methods or blocks to acquire a lock (monitor) on the object.
- **`wait()`, `notify()`, `notifyAll()`:** For more advanced thread coordination inside synchronized blocks.

- **Synchronized methods**:

  ```java
  public synchronized void synchronizedMethod() {
      // Synchronized method body
  }
  ```

- **Synchronized blocks**:

  ```java
  synchronized (obj) {
      // Synchronized block
  }
  ```

**Summary**

Multithreading in Java allows concurrent execution of multiple threads within a single process. It enables better utilization of CPU resources, improves application responsiveness, and supports concurrent programming paradigms. Understanding thread concepts, lifecycle, synchronization, and exception handling is crucial for building robust multithreaded applications.

# 5. Unit 5: File Handling and Collections Framework

## 5.1. File Handling in Java

File handling in Java involves reading from and writing to files. This can be achieved using streams and various stream classes provided by the `java.io` package.

## 5.2. Streams and Stream Classes

- **Stream**: A sequence of data elements made available over time. In Java, streams are used to perform input and output operations.
- Types:
  - **Byte Streams:** Handle raw binary data (files, network).
  - **Character Streams:**  Handle character-based data (text files).
- **Stream Classes**: Java provides a variety of stream classes for handling input and output operations. These include byte streams (`InputStream`, `OutputStream`) and character streams (`Reader`, `Writer`).

## 5.3. `FileInputStream` and `FileOutputStream`

- **`FileInputStream`**: Used for reading data from a file as a stream of bytes.
- **`FileOutputStream`**: Used for writing data to a file as a stream of bytes.

```java
// Example of using FileInputStream to read from a file
try (FileInputStream fis = new FileInputStream("input.txt")) {
    int data;
    while ((data = fis.read()) != -1) {
        // Process the data
    }
} catch (IOException e) {
    e.printStackTrace();
}

// Example of using FileOutputStream to write to a file
try (FileOutputStream fos = new FileOutputStream("output.txt")) {
    String data = "Hello, world!";
    fos.write(data.getBytes());
} catch (IOException e) {
    e.printStackTrace();
}
```

## 5.4. Creation, Reading, and Writing Files

## 5.5. File Creation

You can create a new file using the `File` class.

```java
File file = new File("newfile.txt");
boolean created = file.createNewFile();
```

```java
import java.io.File;  
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("myNewFile.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

## 5.6. Writing to a File

You can use file output streams (`FileOutputStream`, `FileWriter`) to write to a file.

```java
try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
    writer.write("Hello, world!");
} catch (IOException e) {
    e.printStackTrace();
}
```

```java
import java.io.FileOutputStream; 
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try (FileOutputStream outputStream = new FileOutputStream("myNewFile.txt")) {
            String text = "Hello, this is some text for the file.";
            byte[] data = text.getBytes();
            outputStream.write(data); 
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

## 5.7. Reading from a File

 You can use file input streams (`FileInputStream`, `FileReader`) to read from a file.

```java
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("myNewFile.txt")) {
            int data;
            while ((data = inputStream.read()) != -1) { // Read byte by byte
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

## 5.8. Closing Streams

It's important to close streams after using them to release system resources.

```java
try (FileInputStream fis = new FileInputStream("input.txt")) {
    // Code to read from the input stream
} catch (IOException e) {
    e.printStackTrace();
} // Stream will be closed automatically after the try block
```

**Summary**

File handling in Java involves reading from and writing to files using streams and stream classes. `FileInputStream` and `FileOutputStream` are used for byte-level file handling, while `FileReader` and `FileWriter` are used for character-level file handling. It's essential to properly handle exceptions and close streams after using them to avoid resource leaks.

**Important Considerations**

- **Closing Streams:** Always close streams using `close()` or try-with-resources to release resources.
- **Character Encoding:** Be mindful of character encoding when dealing with text files (e.g., UTF-8).
- **Other File Operations:** Java provides classes for deleting, renaming, and getting file metadata.
- **Buffered Streams:** For performance optimization, use `BufferedInputStream` and `BufferedOutputStream` to wrap file streams.

## 5.9. Collections Framework in Java

The Collections Framework in Java provides a unified architecture for representing and manipulating collections of objects. It includes interfaces, implementations, and algorithms for working with collections efficiently.

## 5.10. Overview and Hierarchy

The Collections Framework includes several key interfaces and classes organized in a hierarchy:

- **Foundation:** The `java.util` package contains the core classes and interfaces.
- **Interfaces**: `Collection`, `List`, `Set`, `Map`, etc.
- **Classes**: `ArrayList`, `LinkedList`, `HashSet`, `HashMap`, etc.
- **Hierarchy**:
  - `Collection`: Root interface – represents a group of objects.
    - `List`: Ordered collection with duplicates allowed (e.g., `ArrayList`, `LinkedList`)
    - `Set`: Unordered collection with no duplicates (e.g., `HashSet`)
  - `Map`: Key-value pairs (e.g., `HashMap`)

```
Collection
    |
+---List 
|       |-- ArrayList
|       |-- LinkedList
| 
+---Set
|       |-- HashSet    
|   
+---Map
        |-- HashMap  
```

## 5.11. `ArrayList`

- Implements the `List` interface.
- Resizable-array implementation of the `List` interface.
- Provides dynamic resizing, fast random access, and fast iteration.
- Efficient for accessing elements by index, but less efficient for insertion and deletion in the middle of the list.

```java
ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
list.add("C++");
```

## 5.12. `LinkedList`

- Implements the `List` interface.
- Doubly-linked list implementation of the `List` interface.
- Provides fast insertion and deletion operations at both ends of the list.
- Less efficient for random access compared to `ArrayList`.

```java
LinkedList<Integer> list = new LinkedList<>();
list.add(1);
list.add(2);
list.add(3);
```

## 5.13. `HashMap`

- Implements the `Map` interface.
- Hash table-based implementation of the `Map` interface.
- Stores key-value pairs.
- Provides constant-time performance for the basic operations (get and put) on average.

```java
HashMap<String, Integer> map = new HashMap<>();
map.put("Java", 1);
map.put("Python", 2);
map.put("C++", 3);
```

## 5.14. `HashSet`

- Implements the `Set` interface.
- Hash table-based implementation of the `Set` interface.
- Stores unique elements, does not allow duplicates.
- Provides constant-time performance for the basic operations (add, remove, contains) on average.

```java
HashSet<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");
set.add("Orange");
```

## 5.15. The For-Each Loop

The for-each loop, also known as the enhanced for loop, provides a simple way to iterate over collections and arrays in Java.

```java
ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
list.add("C++");

for (String language : list) {
    System.out.println(language);
}
```

The for-each loop iterates over each element in the collection sequentially, without the need for explicit indexing or iterators.

The Collections Framework in Java provides a powerful and efficient way to work with collections of objects. Understanding its interfaces and implementations, such as `ArrayList`, `LinkedList`, `HashMap`, and `HashSet`, along with the for-each loop, is essential for effective Java programming.