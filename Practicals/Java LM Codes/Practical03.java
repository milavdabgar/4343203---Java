// Practical03.java - Reverse digits of a number using while loop

import java.util.Scanner;

public class Practical03 {
    // Method to reverse digits of a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        boolean isNegative = num < 0;
        num = Math.abs(num);
        
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        return isNegative ? -reversed : reversed;
    }
    
    // Method to display the reversal process
    public static void showReversalProcess(int num) {
        System.out.println("\nReversal Process:");
        int temp = Math.abs(num);
        System.out.print("Digits extracted: ");
        
        // Store digits in array for proper display order
        int[] digits = new int[10];  // Assuming number won't exceed 10 digits
        int count = 0;
        
        while (temp > 0) {
            digits[count++] = temp % 10;
            temp /= 10;
        }
        
        // Display digits in order of extraction
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program to Reverse Digits of a Number:\n");
        
        // 1. Using hardcoded values
        System.out.println("1. Testing with hardcoded values:");
        int[] testNumbers = {12345, -9876, 1000, 7};
        
        for (int num : testNumbers) {
            System.out.println("\nOriginal number: " + num);
            showReversalProcess(num);
            System.out.println("Reversed number: " + reverseNumber(num));
        }
        
        // 2. Taking user input
        System.out.println("\n2. Testing with user input:");
        System.out.print("Enter a number to reverse: ");
        int userNum = scanner.nextInt();
        
        System.out.println("Original number: " + userNum);
        showReversalProcess(userNum);
        System.out.println("Reversed number: " + reverseNumber(userNum));
        
        // 3. Special cases demonstration
        System.out.println("\n3. Special cases:");
        
        // Number ending with zeros
        int numWithZeros = 12000;
        System.out.println("\nNumber ending with zeros: " + numWithZeros);
        showReversalProcess(numWithZeros);
        System.out.println("Reversed number: " + reverseNumber(numWithZeros));
        
        // Single digit number
        int singleDigit = 5;
        System.out.println("\nSingle digit number: " + singleDigit);
        showReversalProcess(singleDigit);
        System.out.println("Reversed number: " + reverseNumber(singleDigit));
        
        scanner.close();
    }
}