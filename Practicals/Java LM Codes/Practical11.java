// Practical11.java - Demonstrate method overloading with Shape class

public class Practical11 {
    // Class to demonstrate method overloading
    public class Shape {
        // Method to calculate area of circle
        public float area(float radius) {
            return (float) (Math.PI * radius * radius);
        }
        
        // Overloaded method to calculate area of rectangle
        public float area(float length, float width) {
            return length * width;
        }
        
        // Additional overloaded methods to show more variations
        public float area(int radius) {
            // Overloaded method with different parameter type
            return (float) (Math.PI * radius * radius);
        }
        
        public double area(double radius) {
            // Overloaded method with different return type
            return Math.PI * radius * radius;
        }
        
        public float area(float base, float height, String shape) {
            // Overloaded method for triangle if shape is "triangle"
            if (shape.equalsIgnoreCase("triangle")) {
                return 0.5f * base * height;
            }
            return 0; // Return 0 for invalid shape
        }
    }
    
    public static void main(String[] args) {
        Practical11 practical = new Practical11();
        Shape shape = practical.new Shape();
        
        // Test values
        float radius = 5.0f;
        float length = 6.0f;
        float width = 4.0f;
        float base = 8.0f;
        float height = 3.0f;
        
        System.out.println("Demonstrating Method Overloading:\n");
        
        // Calculate and display area of circle using float parameter
        System.out.println("Area of Circle (float radius = " + radius + "):");
        System.out.printf("%.2f square units\n\n", shape.area(radius));
        
        // Calculate and display area of rectangle
        System.out.println("Area of Rectangle (length = " + length + ", width = " + width + "):");
        System.out.printf("%.2f square units\n\n", shape.area(length, width));
        
        // Calculate and display area of circle using int parameter
        System.out.println("Area of Circle (int radius = 5):");
        System.out.printf("%.2f square units\n\n", shape.area(5));
        
        // Calculate and display area of circle using double parameter
        System.out.println("Area of Circle (double radius = 5.0):");
        System.out.printf("%.2f square units\n\n", shape.area(5.0));
        
        // Calculate and display area of triangle
        System.out.println("Area of Triangle (base = " + base + ", height = " + height + "):");
        System.out.printf("%.2f square units\n\n", shape.area(base, height, "triangle"));
        
        // Demonstrate method selection based on parameter type
        System.out.println("Demonstrating automatic method selection based on parameter type:");
        System.out.println("Calling area(5.0f) - selects float version: " + shape.area(5.0f));
        System.out.println("Calling area(5) - selects int version: " + shape.area(5));
        System.out.println("Calling area(5.0) - selects double version: " + shape.area(5.0));
    }
}