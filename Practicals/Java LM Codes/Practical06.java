// Practical06.java - Create Student class and demonstrate object creation

class Student {
    private String enrollmentNo;
    private String name;
    
    // Constructor
    public Student(String enrollmentNo, String name) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
    }
    
    // Getter methods
    public String getEnrollmentNo() {
        return enrollmentNo;
    }
    
    public String getName() {
        return name;
    }
    
    // Setter methods
    public void setEnrollmentNo(String enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Name: " + name);
        System.out.println();
    }
}

public class Practical06 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Student Class and Objects:\n");
        
        // 1. Creating three student objects
        System.out.println("1. Creating and displaying three students:");
        Student student1 = new Student("A101", "John Smith");
        Student student2 = new Student("A102", "Emma Watson");
        Student student3 = new Student("A103", "Michael Johnson");
        
        // Display student information
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        
        // 2. Demonstrating getter methods
        System.out.println("2. Using getter methods:");
        System.out.println("Student 1:");
        System.out.println("Enrollment No: " + student1.getEnrollmentNo());
        System.out.println("Name: " + student1.getName());
        System.out.println();
        
        // 3. Demonstrating setter methods
        System.out.println("3. Using setter methods to update student details:");
        System.out.println("Updating student2's information:");
        student2.setName("Emma Thompson");
        System.out.println("After update:");
        student2.displayDetails();
        
        // 4. Creating array of students
        System.out.println("4. Working with array of students:");
        Student[] students = {
            new Student("B101", "Alice Brown"),
            new Student("B102", "Bob Wilson"),
            new Student("B103", "Carol White")
        };
        
        System.out.println("Displaying all students in array:");
        for (Student student : students) {
            student.displayDetails();
        }
    }
}