// Practical20.java - Demonstrate abstract class and method overriding

// Abstract class Shape
abstract class Shape {
    protected String name;
    protected String color;
    
    // Constructor
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    // Abstract method to calculate area
    public abstract double area();
    
    // Concrete method to display shape info
    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Color: " + color);
        System.out.printf("Area: %.2f square units\n", area());
    }
}

// Triangle class
class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle(String color, double base, double height) {
        super("Triangle", color);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double area() {
        return 0.5 * base * height;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Base: " + base + " units");
        System.out.println("Height: " + height + " units");
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super("Rectangle", color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double area() {
        return length * width;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Length: " + length + " units");
        System.out.println("Width: " + width + " units");
    }
}

// Circle class
class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius + " units");
    }
}

public class Practical20 {
    // Method to process any shape
    public static void processShape(Shape shape) {
        System.out.println("\nProcessing shape:");
        shape.displayInfo();
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating Abstract Class with Shape Hierarchy:\n");
        
        // Create instances of different shapes
        Triangle triangle = new Triangle("Red", 6.0, 4.0);
        Rectangle rectangle = new Rectangle("Blue", 5.0, 3.0);
        Circle circle = new Circle("Green", 3.0);
        
        // Process each shape using polymorphism
        processShape(triangle);
        processShape(rectangle);
        processShape(circle);
        
        // Demonstrate array of shapes
        System.out.println("\nProcessing array of shapes:");
        Shape[] shapes = {triangle, rectangle, circle};
        
        for (Shape shape : shapes) {
            System.out.println("\nShape Details:");
            shape.displayInfo();
            System.out.println("Calculated area: " + String.format("%.2f", shape.area()));
        }
        
        // Demonstrate that we cannot instantiate abstract class
        // Following line would cause compilation error:
        // Shape shape = new Shape("Generic", "Yellow");
        
        // Calculate total area of all shapes
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        System.out.printf("\nTotal area of all shapes: %.2f square units\n", totalArea);
    }
}