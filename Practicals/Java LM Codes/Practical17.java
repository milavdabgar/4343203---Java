// Practical17.java - Demonstrate method overriding

// Parent class
class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    // Method to be overridden
    public void draw() {
        System.out.println("Drawing a shape");
    }
    
    public void getInfo() {
        System.out.println("This is a " + color + " shape");
    }
    
    public double calculateArea() {
        return 0.0;  // Default implementation
    }
}

// First child class
class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    // Override draw method
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
    
    @Override
    public void getInfo() {
        System.out.println("This is a " + color + " circle with radius " + radius);
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Second child class
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + " and width " + width);
    }
    
    @Override
    public void getInfo() {
        System.out.println("This is a " + color + " rectangle with length " + length + 
                         " and width " + width);
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Third child class
class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a triangle with base " + base + " and height " + height);
    }
    
    @Override
    public void getInfo() {
        System.out.println("This is a " + color + " triangle with base " + base + 
                         " and height " + height);
    }
    
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Practical17 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Method Overriding:\n");
        
        // Create objects of different shapes
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        Triangle triangle = new Triangle("Green", 3.0, 8.0);
        
        // Demonstrate method overriding for Circle
        System.out.println("1. Circle:");
        circle.draw();
        circle.getInfo();
        System.out.printf("Area: %.2f square units\n", circle.calculateArea());
        
        // Demonstrate method overriding for Rectangle
        System.out.println("\n2. Rectangle:");
        rectangle.draw();
        rectangle.getInfo();
        System.out.printf("Area: %.2f square units\n", rectangle.calculateArea());
        
        // Demonstrate method overriding for Triangle
        System.out.println("\n3. Triangle:");
        triangle.draw();
        triangle.getInfo();
        System.out.printf("Area: %.2f square units\n", triangle.calculateArea());
        
        // Demonstrate polymorphism with method overriding
        System.out.println("\n4. Demonstrating polymorphism:");
        Shape[] shapes = {circle, rectangle, triangle};
        for (Shape shape : shapes) {
            System.out.println("\nShape details:");
            shape.draw();       // Calls overridden method
            shape.getInfo();    // Calls overridden method
            System.out.printf("Area: %.2f square units\n", shape.calculateArea());
        }
    }
}