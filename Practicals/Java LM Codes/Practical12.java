// Practical12.java - Demonstrate constructor overloading

public class Practical12 {
    // Instance variables
    private String name;
    private int age;
    private String city;
    private String occupation;
    
    // Default constructor
    public Practical12() {
        System.out.println("Default Constructor Called");
        this.name = "Unknown";
        this.age = 0;
        this.city = "Not Specified";
        this.occupation = "Not Specified";
    }
    
    // Constructor with name parameter
    public Practical12(String name) {
        System.out.println("Constructor with name parameter Called");
        this.name = name;
        this.age = 0;
        this.city = "Not Specified";
        this.occupation = "Not Specified";
    }
    
    // Constructor with name and age parameters
    public Practical12(String name, int age) {
        System.out.println("Constructor with name and age parameters Called");
        this.name = name;
        this.age = age;
        this.city = "Not Specified";
        this.occupation = "Not Specified";
    }
    
    // Constructor with all parameters
    public Practical12(String name, int age, String city, String occupation) {
        System.out.println("Constructor with all parameters Called");
        this.name = name;
        this.age = age;
        this.city = city;
        this.occupation = occupation;
    }
    
    // Constructor using another constructor (Copy constructor)
    public Practical12(Practical12 other) {
        System.out.println("Copy Constructor Called");
        this.name = other.name;
        this.age = other.age;
        this.city = other.city;
        this.occupation = other.occupation;
    }
    
    // Method to display person details
    public void displayDetails() {
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Occupation: " + occupation);
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating Constructor Overloading:\n");
        
        // Creating objects using different constructors
        System.out.println("1. Creating object with default constructor:");
        Practical12 person1 = new Practical12();
        person1.displayDetails();
        
        System.out.println("\n2. Creating object with name parameter:");
        Practical12 person2 = new Practical12("John");
        person2.displayDetails();
        
        System.out.println("\n3. Creating object with name and age parameters:");
        Practical12 person3 = new Practical12("Emma", 25);
        person3.displayDetails();
        
        System.out.println("\n4. Creating object with all parameters:");
        Practical12 person4 = new Practical12("Michael", 30, "New York", "Engineer");
        person4.displayDetails();
        
        System.out.println("\n5. Creating object using copy constructor:");
        Practical12 person5 = new Practical12(person4);
        person5.displayDetails();
    }
}