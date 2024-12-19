// Practical23.java - Demonstrate user defined exception for divide by zero

// Custom Exception class
class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("Cannot divide by zero!");
    }
    
    public DivideByZeroException(String message) {
        super(message);
    }
}

// Calculator class with division method
class Calculator {
    // Method that throws our custom exception
    public static double divide(double numerator, double denominator) 
            throws DivideByZeroException {
        if (denominator == 0) {
            throw new DivideByZeroException(
                "Division by zero error! Numerator was: " + numerator);
        }
        return numerator / denominator;
    }
}

public class Practical23 {
    // Method to demonstrate division with exception handling
    public static void performDivision(double numerator, double denominator) {
        try {
            double result = Calculator.divide(numerator, denominator);
            System.out.printf("%.2f ÷ %.2f = %.2f\n", numerator, denominator, result);
        } catch (DivideByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating User Defined Exception:\n");
        
        // Test cases
        System.out.println("1. Normal division:");
        performDivision(10.0, 2.0);
        
        System.out.println("\n2. Division by zero:");
        performDivision(20.0, 0.0);
        
        System.out.println("\n3. Multiple divisions in a loop:");
        double[] numerators = {15.0, 25.0, 30.0};
        double[] denominators = {3.0, 0.0, 5.0};
        
        for (int i = 0; i < numerators.length; i++) {
            System.out.println("\nAttempting division " + (i + 1) + ":");
            performDivision(numerators[i], denominators[i]);
        }
        
        // Demonstrating exception handling with try-catch block
        System.out.println("\n4. Direct try-catch usage:");
        try {
            System.out.println("Attempting risky division...");
            double result = Calculator.divide(50.0, 0.0);
            System.out.println("Result of division: " + result); // This line won't be reached
        } catch (DivideByZeroException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        
        // Additional demonstration with successful division
        System.out.println("\n5. Another try-catch example with successful division:");
        try {
            System.out.println("Attempting safe division...");
            double result = Calculator.divide(50.0, 2.0);
            System.out.println("Result of division: " + result); // This line will be reached
        } catch (DivideByZeroException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        
        System.out.println("\n6. Program continues after exception handling");
        performDivision(100.0, 25.0);
    }
}