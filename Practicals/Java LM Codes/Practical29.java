// Practical29.java - Demonstrate HashSet operations with colors

import java.util.HashSet;
import java.util.Iterator;

public class Practical29 {
    // Method to display set contents with iteration count
    private static void displaySet(HashSet<String> set, String message) {
        System.out.println(message);
        int count = 1;
        for (String color : set) {
            System.out.println(count + ". " + color);
            count++;
        }
        System.out.println("Set size: " + set.size() + "\n");
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating HashSet Operations with Colors:\n");
        
        // Create a HashSet to store colors
        HashSet<String> colors = new HashSet<>();
        
        // 1. Adding colors to the set
        System.out.println("1. Adding colors to HashSet:");
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        
        displaySet(colors, "Initial Set of Colors:");
        
        // 2. Demonstrate duplicate handling
        System.out.println("2. Attempting to add duplicate colors:");
        boolean addedRed = colors.add("Red");
        boolean addedOrange = colors.add("Orange");
        
        System.out.println("Added 'Red' again? " + addedRed);
        System.out.println("Added 'Orange'? " + addedOrange);
        displaySet(colors, "Set after attempting duplicates:");
        
        // 3. Different ways of iteration
        System.out.println("3. Different iteration methods:");
        
        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        
        // Using forEach method
        System.out.println("Using forEach method:");
        colors.forEach(color -> System.out.println(color));
        System.out.println();
        
        // 4. Searching and removing elements
        System.out.println("4. Search and remove operations:");
        System.out.println("Contains 'Blue'? " + colors.contains("Blue"));
        System.out.println("Contains 'Black'? " + colors.contains("Black"));
        
        // Remove a color
        boolean removed = colors.remove("Yellow");
        System.out.println("Removed 'Yellow'? " + removed);
        displaySet(colors, "Set after removing 'Yellow':");
        
        // 5. Create a new set for set operations
        HashSet<String> moreColors = new HashSet<>();
        moreColors.add("Pink");
        moreColors.add("Blue");  // Duplicate with first set
        moreColors.add("Brown");
        
        System.out.println("5. Set operations with new colors:");
        displaySet(moreColors, "New set of colors:");
        
        // Add all elements from moreColors to colors
        colors.addAll(moreColors);
        displaySet(colors, "After adding all new colors:");
        
        // 6. Clear the set
        System.out.println("6. Clearing the set:");
        colors.clear();
        System.out.println("Is set empty? " + colors.isEmpty());
        displaySet(colors, "Set after clearing:");
    }
}