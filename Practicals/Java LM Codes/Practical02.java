// Practical02.java - Find maximum of three numbers using conditional operator

import java.util.Scanner;

public class Practical02 {
    // Method to find maximum using conditional operator
    public static int findMax(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program to Find Maximum of Three Numbers:\n");
        
        // 1. Using hardcoded values
        System.out.println("1. Testing with hardcoded values:");
        int x = 25, y = 45, z = 15;
        System.out.printf("Numbers are: %d, %d, %d%n", x, y, z);
        System.out.println("Maximum number is: " + findMax(x, y, z));
        System.out.println();
        
        // 2. Taking user input
        System.out.println("2. Testing with user input:");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        int max = findMax(num1, num2, num3);
        System.out.printf("Maximum number among %d, %d and %d is: %d%n", 
                         num1, num2, num3, max);
        
        // 3. Additional test cases
        System.out.println("\n3. Testing with special cases:");
        
        // When all numbers are same
        System.out.println("When all numbers are same:");
        System.out.println("Max of (5, 5, 5): " + findMax(5, 5, 5));
        
        // When two numbers are same
        System.out.println("When two numbers are same:");
        System.out.println("Max of (7, 7, 3): " + findMax(7, 7, 3));
        
        // With negative numbers
        System.out.println("With negative numbers:");
        System.out.println("Max of (-5, -2, -8): " + findMax(-5, -2, -8));
        
        scanner.close();
    }
}