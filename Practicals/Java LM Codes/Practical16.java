// Practical16.java - Demonstrate hierarchical inheritance

// Parent class
class Employee {
    protected int id;
    protected String name;
    protected double baseSalary;
    
    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    public void work() {
        System.out.println(name + " is working");
    }
    
    public double calculateSalary() {
        return baseSalary;
    }
    
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + calculateSalary());
    }
}

// First child class
class Developer extends Employee {
    private String programmingLanguage;
    private double bonus;
    
    public Developer(int id, String name, double baseSalary, 
                    String programmingLanguage, double bonus) {
        super(id, name, baseSalary);
        this.programmingLanguage = programmingLanguage;
        this.bonus = bonus;
    }
    
    public void code() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }
    
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Developer");
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Bonus: $" + bonus);
    }
}

// Second child class
class Designer extends Employee {
    private String designTool;
    private int projectsCompleted;
    
    public Designer(int id, String name, double baseSalary, 
                   String designTool, int projectsCompleted) {
        super(id, name, baseSalary);
        this.designTool = designTool;
        this.projectsCompleted = projectsCompleted;
    }
    
    public void design() {
        System.out.println(name + " is designing using " + designTool);
    }
    
    @Override
    public double calculateSalary() {
        return baseSalary + (projectsCompleted * 100); // $100 bonus per project
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Designer");
        System.out.println("Design Tool: " + designTool);
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}

// Third child class
class Manager extends Employee {
    private int teamSize;
    private double managementBonus;
    
    public Manager(int id, String name, double baseSalary, 
                  int teamSize, double managementBonus) {
        super(id, name, baseSalary);
        this.teamSize = teamSize;
        this.managementBonus = managementBonus;
    }
    
    public void manage() {
        System.out.println(name + " is managing a team of " + teamSize + " people");
    }
    
    @Override
    public double calculateSalary() {
        return baseSalary + managementBonus + (teamSize * 100); // $100 per team member
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Manager");
        System.out.println("Team Size: " + teamSize);
        System.out.println("Management Bonus: $" + managementBonus);
    }
}

public class Practical16 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Hierarchical Inheritance:\n");
        
        // Creating objects of different employee types
        Developer dev = new Developer(101, "John", 70000, "Java", 5000);
        Designer designer = new Designer(102, "Emma", 65000, "Adobe XD", 5);
        Manager manager = new Manager(103, "Michael", 80000, 8, 10000);
        
        // Demonstrating Developer
        System.out.println("1. Developer Details:");
        dev.displayInfo();
        dev.work();  // Inherited method
        dev.code();  // Specific method
        
        // Demonstrating Designer
        System.out.println("\n2. Designer Details:");
        designer.displayInfo();
        designer.work();  // Inherited method
        designer.design();  // Specific method
        
        // Demonstrating Manager
        System.out.println("\n3. Manager Details:");
        manager.displayInfo();
        manager.work();  // Inherited method
        manager.manage();  // Specific method
        
        // Demonstrating polymorphism
        System.out.println("\n4. Demonstrating polymorphism:");
        Employee[] employees = {dev, designer, manager};
        for (Employee emp : employees) {
            System.out.println("\nEmployee Information:");
            emp.displayInfo();
        }
    }
}