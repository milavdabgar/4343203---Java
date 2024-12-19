// Practical13.java - Demonstrate String class methods

public class Practical13 {
    // Method to demonstrate charAt()
    public static void demonstrateCharAt(String str) {
        System.out.println("\nDemonstrating charAt() method:");
        System.out.println("String: " + str);
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Character at index 4: " + str.charAt(4));
        System.out.println("Last character: " + str.charAt(str.length() - 1));
    }
    
    // Method to demonstrate contains()
    public static void demonstrateContains(String str) {
        System.out.println("\nDemonstrating contains() method:");
        System.out.println("String: " + str);
        System.out.println("Contains 'Java'? " + str.contains("Java"));
        System.out.println("Contains 'Python'? " + str.contains("Python"));
        System.out.println("Contains 'programming'? " + str.contains("programming"));
    }
    
    // Method to demonstrate format()
    public static void demonstrateFormat() {
        System.out.println("\nDemonstrating format() method:");
        String formatted = String.format("Name: %s, Age: %d, Height: %.2f", "John", 25, 5.9);
        System.out.println(formatted);
        
        // More format examples
        System.out.println(String.format("Binary: %b, Character: %c", true, 'A'));
        System.out.println(String.format("Hex: %x, Scientific: %e", 255, 123.456));
        System.out.println(String.format("Left justified: '%-10s'", "Hello"));
        System.out.println(String.format("Right justified: '%10s'", "Hello"));
    }
    
    // Method to demonstrate length()
    public static void demonstrateLength(String str) {
        System.out.println("\nDemonstrating length() method:");
        System.out.println("String: " + str);
        System.out.println("Length: " + str.length());
        
        // Additional length examples
        String empty = "";
        String withSpaces = "   Hello   ";
        System.out.println("Empty string length: " + empty.length());
        System.out.println("String with spaces length: " + withSpaces.length());
    }
    
    // Method to demonstrate split()
    public static void demonstrateSplit() {
        System.out.println("\nDemonstrating split() method:");
        
        // Split by space
        String sentence = "Java Programming is fun";
        System.out.println("Original string: " + sentence);
        System.out.println("Splitting by space:");
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word " + (i + 1) + ": " + words[i]);
        }
        
        // Split by comma
        String csvData = "John,25,New York,Engineer";
        System.out.println("\nSplitting CSV data:");
        String[] data = csvData.split(",");
        System.out.println("Name: " + data[0]);
        System.out.println("Age: " + data[1]);
        System.out.println("City: " + data[2]);
        System.out.println("Occupation: " + data[3]);
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating String Class Methods:");
        
        String testString = "Java Programming";
        
        // Demonstrate all methods
        demonstrateCharAt(testString);
        demonstrateContains(testString);
        demonstrateFormat();
        demonstrateLength(testString);
        demonstrateSplit();
    }
}