// Practical05.java - Generate first n prime numbers

import java.util.Scanner;

public class Practical05 {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Method to generate first n prime numbers
    public static void generatePrimes(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        System.out.println("First " + n + " prime numbers are:");
        int count = 0;
        int number = 2;
        
        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number);
                count++;
                
                // Add formatting
                if (count < n) {
                    System.out.print(", ");
                }
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
        System.out.println();
    }
    
    // Method to show prime checking process
    public static void demonstratePrimeCheck(int number) {
        System.out.printf("\nChecking if %d is prime:%n", number);
        if (number < 2) {
            System.out.println(number + " is not prime (less than 2)");
            return;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            System.out.printf("Checking divisibility by %d: ", i);
            if (number % i == 0) {
                System.out.printf("%d is divisible by %d, so it's not prime%n", number, i);
                return;
            }
            System.out.println("Not divisible");
        }
        System.out.println(number + " is prime");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program to Generate First N Prime Numbers:\n");
        
        // 1. Using hardcoded value
        System.out.println("1. Testing with hardcoded value (n=10):");
        generatePrimes(10);
        
        // 2. Demonstrate prime checking process
        System.out.println("\n2. Demonstrating prime checking process:");
        int[] testNumbers = {7, 12, 23, 35};
        for (int num : testNumbers) {
            demonstratePrimeCheck(num);
        }
        
        // 3. Taking user input
        System.out.println("\n3. Testing with user input:");
        System.out.print("Enter how many prime numbers you want to generate: ");
        int n = scanner.nextInt();
        generatePrimes(n);
        
        // 4. Handle special cases
        System.out.println("\n4. Testing special cases:");
        System.out.println("Generating 0 prime numbers:");
        generatePrimes(0);
        
        System.out.println("\nGenerating 1 prime number:");
        generatePrimes(1);
        
        scanner.close();
    }
}