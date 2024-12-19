// Practical26.java - Demonstrate threads printing even and odd numbers

class NumberPrinter {
    private int currentNumber = 1;
    private final int maxNumber = 200;
    private boolean isEvenTurn = false;
    
    // Method for printing even numbers
    synchronized void printEven() {
        while (currentNumber <= maxNumber) {
            try {
                // Wait if it's not even number's turn
                while (!isEvenTurn && currentNumber <= maxNumber) {
                    wait();
                }
                
                if (currentNumber <= maxNumber) {
                    System.out.printf("Even Thread: %d%n", currentNumber);
                    currentNumber++;
                    isEvenTurn = false;
                    notify();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    // Method for printing odd numbers
    synchronized void printOdd() {
        while (currentNumber <= maxNumber) {
            try {
                // Wait if it's not odd number's turn
                while (isEvenTurn && currentNumber <= maxNumber) {
                    wait();
                }
                
                if (currentNumber <= maxNumber) {
                    System.out.printf("Odd Thread: %d%n", currentNumber);
                    currentNumber++;
                    isEvenTurn = true;
                    notify();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Thread class for printing even numbers
class EvenPrinter extends Thread {
    private NumberPrinter printer;
    
    public EvenPrinter(NumberPrinter printer) {
        this.printer = printer;
    }
    
    @Override
    public void run() {
        printer.printEven();
    }
}

// Thread class for printing odd numbers
class OddPrinter extends Thread {
    private NumberPrinter printer;
    
    public OddPrinter(NumberPrinter printer) {
        this.printer = printer;
    }
    
    @Override
    public void run() {
        printer.printOdd();
    }
}

public class Practical26 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Even-Odd Number Printing Using Threads:\n");
        
        // Create shared number printer object
        NumberPrinter printer = new NumberPrinter();
        
        // Create even and odd printer threads
        Thread evenThread = new EvenPrinter(printer);
        Thread oddThread = new OddPrinter(printer);
        
        // Set thread names
        evenThread.setName("EvenThread");
        oddThread.setName("OddThread");
        
        // Start both threads
        System.out.println("Starting threads to print numbers from 1 to 200...\n");
        oddThread.start();
        evenThread.start();
        
        // Wait for both threads to complete
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("\nBoth threads completed execution");
    }
}