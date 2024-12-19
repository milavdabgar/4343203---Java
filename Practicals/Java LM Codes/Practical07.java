// Practical07.java - Rectangle class with constructor initialization

class Rectangle {
    private double height;
    private double width;
    
    // Default constructor
    public Rectangle() {
        this.height = 0.0;
        this.width = 0.0;
    }
    
    // Parameterized constructor
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    
    // Copy constructor
    public Rectangle(Rectangle other) {
        this.height = other.height;
        this.width = other.width;
    }
    
    // Getter methods
    public double getHeight() {
        return height;
    }
    
    public double getWidth() {
        return width;
    }
    
    // Setter methods
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    // Method to calculate area
    public double calculateArea() {
        return height * width;
    }
    
    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (height + width);
    }
    
    // Method to display rectangle details
    public void displayDetails() {
        System.out.println("Rectangle Details:");
        System.out.printf("Height: %.2f units%n", height);
        System.out.printf("Width: %.2f units%n", width);
        System.out.printf("Area: %.2f square units%n", calculateArea());
        System.out.printf("Perimeter: %.2f units%n", calculatePerimeter());
        System.out.println();
    }
}

public class Practical07 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Rectangle Class with Constructors:\n");
        
        // 1. Using default constructor
        System.out.println("1. Creating rectangle using default constructor:");
        Rectangle rect1 = new Rectangle();
        rect1.displayDetails();
        
        // 2. Using parameterized constructor
        System.out.println("2. Creating rectangle using parameterized constructor:");
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        rect2.displayDetails();
        
        // 3. Using copy constructor
        System.out.println("3. Creating rectangle using copy constructor:");
        Rectangle rect3 = new Rectangle(rect2);
        System.out.println("Copied rectangle details:");
        rect3.displayDetails();
        
        // 4. Demonstrating setter methods
        System.out.println("4. Using setter methods:");
        rect1.setHeight(4.0);
        rect1.setWidth(6.0);
        System.out.println("After setting new dimensions:");
        rect1.displayDetails();
        
        // 5. Demonstrating getter methods
        System.out.println("5. Using getter methods:");
        System.out.printf("Rectangle 2 height: %.2f units%n", rect2.getHeight());
        System.out.printf("Rectangle 2 width: %.2f units%n", rect2.getWidth());
        System.out.println();
        
        // 6. Array of rectangles
        System.out.println("6. Working with array of rectangles:");
        Rectangle[] rectangles = {
            new Rectangle(2.0, 3.0),
            new Rectangle(4.0, 4.0),
            new Rectangle(3.0, 5.0)
        };
        
        System.out.println("Details of all rectangles:");
        for (Rectangle rect : rectangles) {
            rect.displayDetails();
        }
        
        // 7. Find rectangle with largest area
        System.out.println("7. Finding rectangle with largest area:");
        Rectangle maxAreaRect = rectangles[0];
        for (Rectangle rect : rectangles) {
            if (rect.calculateArea() > maxAreaRect.calculateArea()) {
                maxAreaRect = rect;
            }
        }
        System.out.println("Rectangle with largest area:");
        maxAreaRect.displayDetails();
    }
}