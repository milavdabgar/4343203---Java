// Practical19.java - Demonstrate multiple inheritance using interfaces

// First interface
interface Printer {
    void print();
    void checkInk();
}

// Second interface
interface Scanner {
    void scan();
    void checkScanQuality();
}

// Third interface
interface Fax {
    void fax(String destination);
    void checkFaxLine();
}

// Class implementing multiple interfaces
class AllInOnePrinter implements Printer, Scanner, Fax {
    private String modelName;
    private boolean inkAvailable;
    private boolean scannerWorking;
    private boolean faxLineConnected;
    
    public AllInOnePrinter(String modelName) {
        this.modelName = modelName;
        this.inkAvailable = true;
        this.scannerWorking = true;
        this.faxLineConnected = true;
    }
    
    // Implementing Printer interface methods
    @Override
    public void print() {
        System.out.println(modelName + " is printing a document");
    }
    
    @Override
    public void checkInk() {
        System.out.println("Ink status: " + (inkAvailable ? "Available" : "Low"));
    }
    
    // Implementing Scanner interface methods
    @Override
    public void scan() {
        System.out.println(modelName + " is scanning a document");
    }
    
    @Override
    public void checkScanQuality() {
        System.out.println("Scanner status: " + 
            (scannerWorking ? "Working properly" : "Needs maintenance"));
    }
    
    // Implementing Fax interface methods
    @Override
    public void fax(String destination) {
        System.out.println(modelName + " is faxing to " + destination);
    }
    
    @Override
    public void checkFaxLine() {
        System.out.println("Fax line status: " + 
            (faxLineConnected ? "Connected" : "Disconnected"));
    }
    
    // Additional method specific to AllInOnePrinter
    public void displayStatus() {
        System.out.println("\nDevice Status for " + modelName + ":");
        checkInk();
        checkScanQuality();
        checkFaxLine();
    }
}

// Class implementing only Printer and Scanner interfaces
class BasicPrinter implements Printer, Scanner {
    private String modelName;
    
    public BasicPrinter(String modelName) {
        this.modelName = modelName;
    }
    
    @Override
    public void print() {
        System.out.println(modelName + " is printing a document");
    }
    
    @Override
    public void checkInk() {
        System.out.println("Checking ink levels for " + modelName);
    }
    
    @Override
    public void scan() {
        System.out.println(modelName + " is scanning a document");
    }
    
    @Override
    public void checkScanQuality() {
        System.out.println("Checking scan quality for " + modelName);
    }
}

public class Practical19 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Multiple Inheritance Using Interfaces:\n");
        
        // Create an AllInOnePrinter object
        AllInOnePrinter allInOne = new AllInOnePrinter("HP OfficeJet Pro");
        
        // Create a BasicPrinter object
        BasicPrinter basicPrinter = new BasicPrinter("Canon ImageCLASS");
        
        // Demonstrate AllInOnePrinter functionality
        System.out.println("1. Testing AllInOnePrinter:");
        allInOne.print();
        allInOne.scan();
        allInOne.fax("123-456-7890");
        allInOne.displayStatus();
        
        // Demonstrate BasicPrinter functionality
        System.out.println("\n2. Testing BasicPrinter:");
        basicPrinter.print();
        basicPrinter.scan();
        basicPrinter.checkInk();
        basicPrinter.checkScanQuality();
        
        // Demonstrate polymorphism using interfaces
        System.out.println("\n3. Demonstrating polymorphism using interfaces:");
        
        // Using Printer interface
        System.out.println("\nTesting through Printer interface:");
        Printer printer = allInOne;
        printer.print();
        printer.checkInk();
        
        // Using Scanner interface
        System.out.println("\nTesting through Scanner interface:");
        Scanner scanner = allInOne;
        scanner.scan();
        scanner.checkScanQuality();
        
        // Using Fax interface
        System.out.println("\nTesting through Fax interface:");
        Fax fax = allInOne;
        fax.fax("987-654-3210");
        fax.checkFaxLine();
    }
}