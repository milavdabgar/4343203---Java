// Practical01.java - Basic Java program demonstrating output methods

public class Practical01 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Different Output Methods in Java:\n");
        
        // 1. Using println() - prints and moves to next line
        System.out.println("1. Using println():");
        System.out.println("Hello, World!");
        System.out.println("This is a new line");
        System.out.println();
        
        // 2. Using print() - prints without moving to next line
        System.out.println("2. Using print():");
        System.out.print("Hello ");
        System.out.print("World ");
        System.out.print("without line breaks");
        System.out.println("\n");
        
        // 3. Using printf() - formatted output
        System.out.println("3. Using printf():");
        String name = "Student";
        int age = 20;
        double height = 5.9;
        System.out.printf("Name: %s, Age: %d, Height: %.1f feet%n", name, age, height);
        System.out.println();
        
        // 4. Demonstrating escape sequences
        System.out.println("4. Using Escape Sequences:");
        System.out.println("Using tab:\tAfter tab");
        System.out.println("Using new line:\nAfter new line");
        System.out.println("Using single quote: \'Hello\'");
        System.out.println("Using double quote: \"World\"");
        System.out.println("Using backslash: \\");
    }
}