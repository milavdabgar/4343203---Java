// Practical18.java - Demonstrate toString() method overriding

class Car {
    private String name;
    private int topSpeed;
    private String color;
    private double price;
    
    // Constructor
    public Car(String name, int topSpeed, String color, double price) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.color = color;
        this.price = price;
    }
    
    // Overriding toString() method
    @Override
    public String toString() {
        return String.format("Car[name=%s, topSpeed=%d mph, color=%s, price=$%.2f]",
                           name, topSpeed, color, price);
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public int getTopSpeed() {
        return topSpeed;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getPrice() {
        return price;
    }
}

public class Practical18 {
    // Method to display car details in a formatted way
    public static void displayCarDetails(Car car, int carNumber) {
        System.out.println("Car " + carNumber + " Details:");
        System.out.println("Name: " + car.getName());
        System.out.println("Top Speed: " + car.getTopSpeed() + " mph");
        System.out.println("Color: " + car.getColor());
        System.out.printf("Price: $%.2f\n", car.getPrice());
        System.out.println("toString() output: " + car.toString());
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating toString() Method Overriding:\n");
        
        // Create 5 car instances
        Car car1 = new Car("Tesla Model S", 200, "Red", 89990.00);
        Car car2 = new Car("BMW M3", 180, "Blue", 69900.00);
        Car car3 = new Car("Toyota Supra", 155, "Yellow", 43540.00);
        Car car4 = new Car("Porsche 911", 182, "Black", 101200.00);
        Car car5 = new Car("Ford Mustang", 160, "White", 27205.00);
        
        // Store cars in an array
        Car[] cars = {car1, car2, car3, car4, car5};
        
        // Display details of each car
        for (int i = 0; i < cars.length; i++) {
            displayCarDetails(cars[i], i + 1);
        }
        
        // Demonstrate direct use of toString()
        System.out.println("Direct println() calls (implicitly uses toString()):");
        for (Car car : cars) {
            System.out.println(car);  // println automatically calls toString()
        }
        
        // Demonstrate toString() in different contexts
        System.out.println("\nDemonstrating toString() in different contexts:");
        
        // In string concatenation
        String description = "My car is: " + car1;
        System.out.println(description);
        
        // In StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Available car: ").append(car2);
        System.out.println(sb.toString());
        
        // In formatted string
        System.out.printf("Featured car: %s%n", car3);
    }
}