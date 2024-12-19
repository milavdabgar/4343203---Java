// Practical08.java - Demonstrate use of 'this' keyword

public class Practical08 {
    private int number;
    private String text;
    
    // Constructor using 'this' to distinguish parameters from instance variables
    public Practical08(int number, String text) {
        this.number = number;
        this.text = text;
    }
    
    // Method using 'this' to call another method of current object
    public void display() {
        System.out.println("Number: " + this.number);
        System.out.println("Text: " + this.text);
        this.showMore();  // Using 'this' to call another method
    }
    
    // Method using 'this' to pass current object as parameter
    public void showMore() {
        System.out.println("Demonstrating method call using 'this'");
        this.processObject(this);  // Passing current object as parameter
    }
    
    // Method accepting object of same class as parameter
    public void processObject(Practical08 obj) {
        System.out.println("Processing object with number: " + obj.number);
    }
    
    // Method returning current object using 'this'
    public Practical08 updateNumber(int number) {
        this.number = number;
        return this;  // Method chaining by returning current object
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating the use of 'this' keyword:\n");
        
        // Creating object and demonstrating various uses of 'this'
        Practical08 obj = new Practical08(42, "Hello");
        
        System.out.println("Initial object state:");
        obj.display();
        
        System.out.println("\nDemonstrating method chaining using 'this':");
        obj.updateNumber(100).display();
        
        // Creating another object to show constructor usage of 'this'
        System.out.println("\nCreating another object:");
        Practical08 obj2 = new Practical08(99, "World");
        obj2.display();
    }
}