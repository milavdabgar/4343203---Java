// Practical09.java - Demonstrate use of 'static' keyword

public class Practical09 {
    // Static variable
    private static int instanceCount = 0;
    
    // Non-static variables
    private int id;
    private String name;
    
    // Static constant
    private static final String COLLEGE_NAME = "My College";
    
    // Static block - executed when class is loaded
    static {
        System.out.println("Static block executed - Class loading...");
        System.out.println("College Name: " + COLLEGE_NAME);
    }
    
    // Constructor
    public Practical09(String name) {
        this.id = ++instanceCount;
        this.name = name;
    }
    
    // Static method
    public static int getInstanceCount() {
        return instanceCount;
    }
    
    // Static method to display college info
    public static void displayCollegeInfo() {
        System.out.println("College Name: " + COLLEGE_NAME);
        System.out.println("Total Students: " + getInstanceCount());
    }
    
    // Non-static method
    public void displayStudentInfo() {
        System.out.println("Student ID: " + this.id);
        System.out.println("Student Name: " + this.name);
        System.out.println("College: " + COLLEGE_NAME);  // Static variable accessed in non-static method
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating static keyword usage:\n");
        
        // Accessing static method before creating any object
        System.out.println("Initial instance count: " + Practical09.getInstanceCount());
        
        // Creating objects and demonstrating static variable
        System.out.println("\nCreating student objects:");
        Practical09 student1 = new Practical09("John");
        Practical09 student2 = new Practical09("Emma");
        Practical09 student3 = new Practical09("Michael");
        
        // Displaying individual student information
        System.out.println("\nStudent Information:");
        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
        System.out.println();
        student3.displayStudentInfo();
        
        // Displaying college information using static method
        System.out.println("\nCollege Information:");
        Practical09.displayCollegeInfo();
        
        // Demonstrating that static variable is shared
        System.out.println("\nFinal instance count: " + Practical09.getInstanceCount());
    }
}