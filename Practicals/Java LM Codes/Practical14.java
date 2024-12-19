// Practical14.java - Demonstrate single inheritance

// Parent class
class Animal {
    protected String name;
    protected int age;
    
    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Methods
    public void eat() {
        System.out.println(name + " is eating.");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    private String breed;
    
    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);  // Call parent constructor
        this.breed = breed;
    }
    
    // Additional methods specific to Dog
    public void bark() {
        System.out.println(name + " is barking!");
    }
    
    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
    
    // Override parent method
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent method
        System.out.println("Breed: " + breed);
    }
}

public class Practical14 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Single Inheritance:\n");
        
        // Create instances of parent and child classes
        System.out.println("1. Creating Animal object (Parent class):");
        Animal animal = new Animal("Generic Animal", 5);
        animal.displayInfo();
        animal.eat();
        animal.sleep();
        
        System.out.println("\n2. Creating Dog object (Child class):");
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        
        // Accessing inherited methods
        System.out.println("\nAccessing inherited methods:");
        dog.displayInfo();
        dog.eat();
        dog.sleep();
        
        // Accessing Dog-specific methods
        System.out.println("\nAccessing Dog-specific methods:");
        dog.bark();
        dog.fetch();
        
        // Demonstrating polymorphism
        System.out.println("\n3. Demonstrating polymorphism:");
        Animal animalDog = new Dog("Max", 2, "German Shepherd");
        System.out.println("Calling methods on Dog object through Animal reference:");
        animalDog.displayInfo();
        animalDog.eat();
        animalDog.sleep();
        // Note: Can't call bark() or fetch() through Animal reference
    }
}