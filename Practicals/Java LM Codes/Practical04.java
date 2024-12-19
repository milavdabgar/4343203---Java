// Practical04.java - Add two 3x3 matrices

import java.util.Scanner;

public class Practical04 {
    // Method to input matrix elements
    public static void inputMatrix(int[][] matrix, Scanner scanner, String matrixName) {
        System.out.println("Enter elements for " + matrixName + " (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Enter element [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
    }
    
    // Method to display matrix
    public static void displayMatrix(int[][] matrix, String matrixName) {
        System.out.println(matrixName + ":");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program to Add Two 3x3 Matrices:\n");
        
        // 1. Using hardcoded matrices
        System.out.println("1. Testing with hardcoded matrices:");
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        displayMatrix(matrix1, "First Matrix");
        displayMatrix(matrix2, "Second Matrix");
        
        int[][] result1 = addMatrices(matrix1, matrix2);
        displayMatrix(result1, "Result Matrix (Hardcoded)");
        
        // 2. Taking user input
        System.out.println("2. Testing with user input:");
        int[][] userMatrix1 = new int[3][3];
        int[][] userMatrix2 = new int[3][3];
        
        inputMatrix(userMatrix1, scanner, "First Matrix");
        inputMatrix(userMatrix2, scanner, "Second Matrix");
        
        System.out.println("Entered matrices:");
        displayMatrix(userMatrix1, "First Matrix");
        displayMatrix(userMatrix2, "Second Matrix");
        
        int[][] result2 = addMatrices(userMatrix1, userMatrix2);
        displayMatrix(result2, "Result Matrix (User Input)");
        
        // 3. Special case demonstration
        System.out.println("3. Special case - Adding zero matrix:");
        int[][] zeroMatrix = new int[3][3];  // All elements are 0 by default
        
        displayMatrix(matrix1, "Original Matrix");
        displayMatrix(zeroMatrix, "Zero Matrix");
        
        int[][] result3 = addMatrices(matrix1, zeroMatrix);
        displayMatrix(result3, "Result Matrix (Adding Zero Matrix)");
        
        scanner.close();
    }
}