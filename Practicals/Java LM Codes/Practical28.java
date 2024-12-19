// Practical28.java - Demonstrate use of List (ArrayList and LinkedList)

import java.util.*;

public class Practical28 {
    // Method to display list contents
    public static void displayList(List<?> list, String listName) {
        System.out.println(listName + " contents:");
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println("\nSize: " + list.size());
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating List Interface Usage:\n");
        
        // Create ArrayList and add weekdays
        List<String> weekdays = new ArrayList<>();
        System.out.println("1. ArrayList Operations (Weekdays):");
        
        // Adding weekdays
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        
        displayList(weekdays, "Weekdays ArrayList");
        
        // Demonstrate ArrayList operations
        System.out.println("ArrayList Operations:");
        System.out.println("First day: " + weekdays.get(0));
        System.out.println("Last day: " + weekdays.get(weekdays.size() - 1));
        System.out.println("Contains 'Wednesday'? " + weekdays.contains("Wednesday"));
        System.out.println("Index of 'Friday': " + weekdays.indexOf("Friday"));
        
        // Create LinkedList and add months
        List<String> months = new LinkedList<>();
        System.out.println("\n2. LinkedList Operations (Months):");
        
        // Adding months
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        
        displayList(months, "Months LinkedList");
        
        // Demonstrate LinkedList specific operations
        LinkedList<String> monthsLinked = (LinkedList<String>) months;
        System.out.println("LinkedList Specific Operations:");
        System.out.println("First month: " + monthsLinked.getFirst());
        System.out.println("Last month: " + monthsLinked.getLast());
        
        // Add elements at specific positions
        monthsLinked.addFirst("December");  // Add at beginning
        monthsLinked.addLast("July");      // Add at end
        
        System.out.println("\nAfter adding elements:");
        displayList(months, "Updated Months LinkedList");
        
        // Demonstrate List interface common operations
        System.out.println("3. Common List Operations:");
        
        // Sorting
        Collections.sort(weekdays);
        System.out.println("Sorted weekdays:");
        displayList(weekdays, "Sorted Weekdays");
        
        Collections.sort(months);
        System.out.println("Sorted months:");
        displayList(months, "Sorted Months");
        
        // Removing elements
        weekdays.remove("Friday");
        months.remove("July");
        
        System.out.println("After removing elements:");
        System.out.println("Weekdays after removing Friday:");
        displayList(weekdays, "Modified Weekdays");
        System.out.println("Months after removing July:");
        displayList(months, "Modified Months");
        
        // Clear lists
        weekdays.clear();
        months.clear();
        
        System.out.println("4. After clearing lists:");
        displayList(weekdays, "Cleared Weekdays");
        displayList(months, "Cleared Months");
    }
}