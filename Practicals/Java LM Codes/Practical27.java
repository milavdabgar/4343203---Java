// Practical27.java - Demonstrate read and write operations on a text file

import java.io.*;
import java.util.Scanner;

public class Practical27 {
    // Method to write content to a file
    public static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            
            bufferedWriter.write(content);
            System.out.println("Successfully wrote to the file.");
            
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file:");
            e.printStackTrace();
        }
    }
    
    // Method to append content to a file
    public static void appendToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            
            bufferedWriter.write(content);
            System.out.println("Successfully appended to the file.");
            
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file:");
            e.printStackTrace();
        }
    }
    
    // Method to read content from a file using BufferedReader
    public static void readFileUsingBufferedReader(String fileName) {
        try (FileReader reader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            
            System.out.println("\nReading file using BufferedReader:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file:");
            e.printStackTrace();
        }
    }
    
    // Method to read content from a file using Scanner
    public static void readFileUsingScanner(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            System.out.println("\nReading file using Scanner:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found:");
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating File Operations:\n");
        
        String fileName = "sample.txt";
        
        // Write initial content to file
        System.out.println("1. Writing initial content to file:");
        String initialContent = "Hello! This is line 1.\n" +
                              "This is line 2.\n" +
                              "This is line 3.\n";
        writeToFile(fileName, initialContent);
        
        // Read the file content using BufferedReader
        readFileUsingBufferedReader(fileName);
        
        // Append additional content
        System.out.println("\n2. Appending content to file:");
        String additionalContent = "This is line 4 (appended).\n" +
                                 "This is line 5 (appended).\n";
        appendToFile(fileName, additionalContent);
        
        // Read the file content using Scanner
        readFileUsingScanner(fileName);
        
        // Demonstrate File class operations
        File file = new File(fileName);
        System.out.println("\n3. File Information:");
        System.out.println("File exists: " + file.exists());
        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("File size: " + file.length() + " bytes");
        System.out.println("Can read: " + file.canRead());
        System.out.println("Can write: " + file.canWrite());
        
        // Clean up - Delete the file
        System.out.println("\n4. Cleaning up:");
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}