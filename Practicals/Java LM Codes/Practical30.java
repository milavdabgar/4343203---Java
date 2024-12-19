// Practical30.java - Demonstrate HashMap with Student Data

import java.util.HashMap;
import java.util.Map;

public class Practical30 {
    // Method to display student data
    private static void displayStudents(HashMap<String, String> students, String message) {
        System.out.println(message);
        if (students.isEmpty()) {
            System.out.println("No students in the map.");
        } else {
            for (Map.Entry<String, String> entry : students.entrySet()) {
                System.out.printf("Enrollment No: %s, Name: %s%n", 
                    entry.getKey(), entry.getValue());
            }
        }
        System.out.println("Total students: " + students.size() + "\n");
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating HashMap Operations with Student Data:\n");
        
        // Create HashMap to store student data
        HashMap<String, String> students = new HashMap<>();
        
        // 1. Adding students to the map
        System.out.println("1. Adding students to HashMap:");
        students.put("A101", "John Smith");
        students.put("A102", "Emma Watson");
        students.put("A103", "Michael Johnson");
        students.put("A104", "Sarah Wilson");
        students.put("A105", "David Brown");
        
        displayStudents(students, "Initial Student List:");
        
        // 2. Accessing specific student
        System.out.println("2. Accessing student data:");
        String enrollmentNo = "A103";
        System.out.println("Student with enrollment no " + enrollmentNo + ": " 
            + students.get(enrollmentNo));
        
        // Try accessing non-existent student
        System.out.println("Student with enrollment no A106: " 
            + students.get("A106"));
        System.out.println();
        
        // 3. Updating student data
        System.out.println("3. Updating student data:");
        students.put("A101", "John Smith Jr.");  // Update existing entry
        System.out.println("Updated A101's name");
        displayStudents(students, "After updating:");
        
        // 4. Checking existence
        System.out.println("4. Checking existence:");
        System.out.println("Contains enrollment no A102? " 
            + students.containsKey("A102"));
        System.out.println("Contains student Emma Watson? " 
            + students.containsValue("Emma Watson"));
        System.out.println();
        
        // 5. Different ways to iterate
        System.out.println("5. Different ways to iterate through the map:");
        
        // Using entrySet
        System.out.println("Using entrySet:");
        for (Map.Entry<String, String> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();
        
        // Using keySet
        System.out.println("Using keySet:");
        for (String key : students.keySet()) {
            System.out.println("Enrollment No: " + key);
        }
        System.out.println();
        
        // Using values
        System.out.println("Using values:");
        for (String value : students.values()) {
            System.out.println("Student Name: " + value);
        }
        System.out.println();
        
        // 6. Removing a student
        System.out.println("6. Removing student:");
        String removedStudent = students.remove("A104");
        System.out.println("Removed student: " + removedStudent);
        displayStudents(students, "After removing A104:");
        
        // 7. Using getOrDefault
        System.out.println("7. Using getOrDefault:");
        System.out.println("Student A105: " + 
            students.getOrDefault("A105", "Not Found"));
        System.out.println("Student A106: " + 
            students.getOrDefault("A106", "Not Found"));
        System.out.println();
        
        // 8. Clear the map
        System.out.println("8. Clearing the map:");
        students.clear();
        System.out.println("Is map empty? " + students.isEmpty());
        displayStudents(students, "After clearing:");
    }
}