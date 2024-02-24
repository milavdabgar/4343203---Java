# Java Introduction

## What is Java?

Java is a popular programming language, created in 1995.

It is owned by Oracle, and more than **3 billion** devices run Java.

It is used for:

- Mobile applications (specially Android apps)
- Desktop applications
- Web applications
- Web servers and application servers
- Games
- Database connection
- And much, much more!

------

## Why Use Java?

- Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
- It is one of the most popular programming languages in the world
- It has a large demand in the current job market
- It is easy to learn and simple to use
- It is open-source and free
- It is secure, fast and powerful
- It has huge community support (tens of millions of developers)
- Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs
- As Java is close to [C++](https://www.w3schools.com/cpp/default.asp) and [C#](https://www.w3schools.com/cs/default.asp), it makes it easy for programmers to switch to Java or vice versa

# Java Getting Started

## Java Install

Some PCs might have Java already installed.

To check if you have Java installed on a Windows PC, search in the start bar for Java or type the following in Command Prompt (cmd.exe):

C:\Users\*Your Name*>java -version

If Java is installed, you will see something like this (depending on version):

```
java version "11.0.1" 2018-10-16 LTSJava(TM) SE Runtime Environment 18.9 (build 11.0.1+13-LTS)Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.1+13-LTS, mixed mode)
```

If you do not have Java installed on your computer, you can download it for free at [oracle.com](https://www.oracle.com/technetwork/java/javase/overview/index.html).

**Note:** In this tutorial, we will write Java code in a text editor. However, it is possible to write Java in an Integrated Development Environment, such as IntelliJ IDEA, Netbeans or Eclipse, which are particularly useful when managing larger collections of Java files.

## Setup for Windows

To install Java on Windows:

1. Go to "System Properties" (Can be found on Control Panel > System and Security > System > Advanced System Settings)
2. Click on the "Environment variables" button under the "Advanced" tab
3. Then, select the "Path" variable in System variables and click on the "Edit" button
4. Click on the "New" button and add the path where Java is installed, followed by **\bin**. By default, Java is installed in C:\Program Files\Java\jdk-11.0.1 (If nothing else was specified when you installed it). In that case, You will have to add a new path with: **C:\Program Files\Java\jdk-11.0.1\bin**
   Then, click "OK", and save the settings
5. At last, open Command Prompt (cmd.exe) and type **java -version** to see if Java is running on your machine

## Java Quickstart

In Java, every application begins with a class name, and that class must match the filename.

Let's create our first Java file, called Main.java, which can be done in any text editor (like Notepad).

The file should contain a "Hello World" message, which is written with the following code:

Main.java

```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

Don't worry if you don't understand the code above - we will discuss it in detail in later chapters. For now, focus on **how** to run the code above.

Save the code in Notepad as "Main.java". Open Command Prompt (cmd.exe), navigate to the directory where you saved your file, and type "javac Main.java":

C:\Users\*Your Name*>javac Main.java

This will compile your code. If there are no errors in the code, the command prompt will take you to the next line. Now, type "java Main" to run the file:

C:\Users\*Your Name*>java Main

The output should read:

```
Hello World
```

**Congratulations!** You have written and executed your first Java program.

# Java Syntax

## Java Syntax

In the previous chapter, we created a Java file called `Main.java`, and we used the following code to print "Hello World" to the screen:

Main.java

```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

### Example explained

Every line of code that runs in Java must be inside a `class`. In our example, we named the class **Main**. A class should always start with an uppercase first letter.

**Note:** Java is case-sensitive: "MyClass" and "myclass" has different meaning.

The name of the java file **must match** the class name. When saving the file, save it using the class name and add ".java" to the end of the filename. To run the example above on your computer, make sure that Java is properly installed: Go to the [Get Started Chapter](https://www.w3schools.com/java/java_getstarted.asp) for how to install Java. The output should be:

```
Hello World
```

------

## The main Method

The `main()` method is required and you will see it in every Java program:

```java
public static void main(String[] args)
```

Any code inside the `main()` method will be executed. Don't worry about the keywords before and after main. You will get to know them bit by bit while reading this tutorial.

For now, just remember that every Java program has a `class` name which must match the filename, and that every program must contain the `main()` method.

------

## System.out.println()

Inside the `main()` method, we can use the `println()` method to print a line of text to the screen:

```java
public static void main(String[] args) {
  System.out.println("Hello World");
}
```

**Note:** The curly braces `{}` marks the beginning and the end of a block of code.

`System` is a built-in Java class that contains useful members, such as `out`, which is short for "output". The `println()` method, short for "print line", is used to print a value to the screen (or a file).

Don't worry too much about `System`, `out` and `println()`. Just know that you need them together to print stuff to the screen.

You should also note that each code statement must end with a semicolon (`;`).

# Java Output / Print

## Print Text

You learned from the previous chapter that you can use the `println()` method to output values or print text in Java:

### Example

```java
System.out.println("Hello World!");
```

You can add as many `println()` methods as you want. Note that it will add a new line for each method:

### Example

```java
System.out.println("Hello World!");
System.out.println("I am learning Java.");
System.out.println("It is awesome!");
```

## Double Quotes

When you are working with text, it must be wrapped inside double quotations marks `""`.

If you forget the double quotes, an error occurs:

### Example

```java
System.out.println("This sentence will work!");
System.out.println(This sentence will produce an error);
```

## The Print() Method

There is also a `print()` method, which is similar to `println()`.

The only difference is that it does not insert a new line at the end of the output:

### Example

```java
System.out.print("Hello World! ");
System.out.print("I will print on the same line.");
```

Note that we add an extra space (after "Hello World!" in the example above), for better readability.

In this tutorial, we will only use `println()` as it makes it easier to read the output of code.

# Java Output Numbers

## Print Numbers

You can also use the `println()` method to print numbers.

However, unlike text, we don't put numbers inside double quotes:

### Example

## Print Numbers

You can also use the `println()` method to print numbers.

However, unlike text, we don't put numbers inside double quotes:

### Example

```java
System.out.println(3);
System.out.println(358);
System.out.println(50000);
```

You can also perform mathematical calculations inside the `println()` method:

### Example

```java
System.out.println(3 + 3);
```

### Example

```java
System.out.println(2 * 5);
```

# Java Comments

## Java Comments

Comments can be used to explain Java code, and to make it more readable. It can also be used to prevent execution when testing alternative code.

------

## Single-line Comments

Single-line comments start with two forward slashes (`//`).

Any text between `//` and the end of the line is ignored by Java (will not be executed).

This example uses a single-line comment before a line of code:

### Example

```java
// This is a comment
System.out.println("Hello World");
```

This example uses a single-line comment at the end of a line of code:

### Example

```java
System.out.println("Hello World"); // This is a comment
```

## Java Multi-line Comments

Multi-line comments start with `/*` and ends with `*/`.

Any text between `/*` and `*/` will be ignored by Java.

This example uses a multi-line comment (a comment block) to explain the code:

### Example

```java
/* The code below will print the words Hello World
to the screen, and it is amazing */
System.out.println("Hello World");
```

#### Single or multi-line comments?

It is up to you which you want to use. Normally, we use `//` for short comments, and `/* */` for longer.

# Java Variables

## Java Variables

Variables are containers for storing data values.

In Java, there are different **types** of variables, for example:

- `String` - stores text, such as "Hello". String values are surrounded by double quotes
- `int` - stores integers (whole numbers), without decimals, such as 123 or -123
- `float` - stores floating point numbers, with decimals, such as 19.99 or -19.99
- `char` - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
- `boolean` - stores values with two states: true or false

## Declaring (Creating) Variables

To create a variable, you must specify the type and assign it a value:

### Syntax

```java
type variableName = value;
```

Where *type* is one of Java's types (such as `int` or `String`), and *variableName* is the name of the variable (such as **x** or **name**). The **equal sign** is used to assign values to the variable.

To create a variable that should store text, look at the following example:

### Example

Create a variable called **name** of type `String` and assign it the value "**John**":

```java
String name = "John";
System.out.println(name);
```

To create a variable that should store a number, look at the following example:

### Example

Create a variable called **myNum** of type `int` and assign it the value **15**:

```java
int myNum = 15;
System.out.println(myNum);
```

You can also declare a variable without assigning the value, and assign the value later:

### Example

```java
int myNum;
myNum = 15;
System.out.println(myNum);
```

Note that if you assign a new value to an existing variable, it will overwrite the previous value:

### Example

Change the value of `myNum` from `15` to `20`:

```java
int myNum = 15;
myNum = 20;  // myNum is now 20
System.out.println(myNum);
```

## Final Variables

If you don't want others (or yourself) to overwrite existing values, use the `final` keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):

### Example

```java
final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable
```

## Other Types

A demonstration of how to declare variables of other types:

### Example

```java
int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
```