// Practical10.java - Demonstrate use of 'final' keyword

// Final class - cannot be inherited
final class FinalClass {
    public void display() {
        System.out.println("This class cannot be inherited");
    }
}

class Parent {
    // Final method - cannot be overridden
    final void showMessage() {
        System.out.println("This method cannot be overridden");
    }
}

class Child extends Parent {
    // This would cause error if uncommented:
    // void showMessage() { } // Cannot override final method
    
    void displayChild() {
        System.out.println("Child class calling parent's final method:");
        showMessage();
    }
}

public class Practical10 {
    // Final variable - must be initialized and cannot be changed
    private final int MAX_VALUE = 100;
    
    // Final reference variable
    private final StringBuilder builder = new StringBuilder();
    
    // Final static constant
    private static final double PI = 3.14159;
    
    // Blank final variable - must be initialized in constructor
    private final String message;
    
    // Constructor to initialize final variable
    public Practical10(String msg) {
        this.message = msg;  // Initializing blank final variable
    }
    
    public void demonstrateFinal() {
        // This would cause error:
        // MAX_VALUE = 200; // Cannot modify final variable
        
        // Can modify object state even though reference is final
        builder.append("Hello ");
        builder.append("World");
        
        System.out.println("Final variable MAX_VALUE: " + MAX_VALUE);
        System.out.println("Final StringBuilder content: " + builder.toString());
        System.out.println("Final static PI: " + PI);
        System.out.println("Final message: " + message);
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating final keyword usage:\n");
        
        // Demonstrating final variables
        Practical10 obj = new Practical10("This is a final message");
        obj.demonstrateFinal();
        
        // Demonstrating final class
        System.out.println("\nDemonstrating final class:");
        FinalClass finalObj = new FinalClass();
        finalObj.display();
        
        // Demonstrating final method
        System.out.println("\nDemonstrating final method:");
        Child child = new Child();
        child.displayChild();
        
        // Demonstrating final parameter in lambda expression
        System.out.println("\nDemonstrating final parameter in lambda:");
        Runnable run = () -> {
            final String param = "Hello";
            System.out.println("Parameter cannot be modified: " + param);
        };
        run.run();
        
        // Demonstrating final local variable
        final int number = 100;
        System.out.println("\nFinal local variable: " + number);
        // This would cause error:
        // number = 200; // Cannot modify final variable
    }
}