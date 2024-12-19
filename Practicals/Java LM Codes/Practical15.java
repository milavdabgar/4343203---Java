// Practical15.java - Demonstrate multilevel inheritance

// Grandparent class
class Vehicle {
    protected String brand;
    protected String model;
    
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    public void start() {
        System.out.println("Vehicle is starting...");
    }
    
    public void stop() {
        System.out.println("Vehicle is stopping...");
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

// Parent class inheriting from Vehicle
class Car extends Vehicle {
    private int numDoors;
    private String fuelType;
    
    public Car(String brand, String model, int numDoors, String fuelType) {
        super(brand, model);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }
    
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }
    
    public void brake() {
        System.out.println("Car is braking...");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Child class inheriting from Car
class ElectricCar extends Car {
    private int batteryCapacity;
    private int range;
    
    public ElectricCar(String brand, String model, int numDoors, 
                      int batteryCapacity, int range) {
        super(brand, model, numDoors, "Electric");
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }
    
    public void charge() {
        System.out.println("Electric car is charging...");
    }
    
    public void displayBatteryStatus() {
        System.out.println("Battery Status: 75%");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Range: " + range + " km");
    }
}

public class Practical15 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Multilevel Inheritance:\n");
        
        // Create instances of all three classes
        System.out.println("1. Creating Vehicle object (Grandparent class):");
        Vehicle vehicle = new Vehicle("Generic", "Basic");
        vehicle.displayInfo();
        vehicle.start();
        vehicle.stop();
        
        System.out.println("\n2. Creating Car object (Parent class):");
        Car car = new Car("Toyota", "Camry", 4, "Petrol");
        car.displayInfo();
        car.start();  // Inherited from Vehicle
        car.accelerate();  // Car's own method
        car.brake();  // Car's own method
        car.stop();  // Inherited from Vehicle
        
        System.out.println("\n3. Creating ElectricCar object (Child class):");
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 4, 75, 350);
        electricCar.displayInfo();
        electricCar.start();  // Inherited from Vehicle
        electricCar.accelerate();  // Inherited from Car
        electricCar.charge();  // ElectricCar's own method
        electricCar.displayBatteryStatus();  // ElectricCar's own method
        electricCar.stop();  // Inherited from Vehicle
        
        // Demonstrating polymorphism
        System.out.println("\n4. Demonstrating polymorphism:");
        Vehicle polymorphicCar = new ElectricCar("Tesla", "Model S", 4, 100, 400);
        System.out.println("Calling methods on ElectricCar through Vehicle reference:");
        polymorphicCar.displayInfo();  // Will call ElectricCar's version
        polymorphicCar.start();
        polymorphicCar.stop();
    }
}