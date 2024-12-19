// File: Practical22.java
import shapes.Circle;
import shapes.Rectangle;
import util.Calculator;

public class Practical22 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Package Usage:\n");
        
        // Create objects of classes from shapes package
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        
        // Calculate and display circle measurements
        System.out.println("Circle Measurements:");
        System.out.println("Area: " + 
            Calculator.round(circle.getArea(), 2) + " square units");
        System.out.println("Perimeter: " + 
            Calculator.round(circle.getPerimeter(), 2) + " units");
        
        // Calculate and display rectangle measurements
        System.out.println("\nRectangle Measurements:");
        System.out.println("Area: " + 
            Calculator.round(rectangle.getArea(), 2) + " square units");
        System.out.println("Perimeter: " + 
            Calculator.round(rectangle.getPerimeter(), 2) + " units");
        
        // Demonstrate fully qualified names
        System.out.println("\nUsing fully qualified names:");
        shapes.Circle circle2 = new shapes.Circle(3.0);
        System.out.println("New circle area: " + 
            util.Calculator.round(circle2.getArea(), 2) + " square units");
    }
}