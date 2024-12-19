// Practical25.java - Demonstrate thread creation and execution

// First thread class
class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread1");
                // Sleep for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread1 interrupted");
        }
    }
}

// Second thread class
class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread2");
                // Sleep for 2000 milliseconds (2 seconds)
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread2 interrupted");
        }
    }
}

public class Practical25 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Thread Creation and Execution:\n");
        
        // Create thread objects
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        // Set thread names
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        
        // Display thread information before starting
        System.out.println("Thread States Before Starting:");
        System.out.println(t1.getName() + " State: " + t1.getState());
        System.out.println(t2.getName() + " State: " + t2.getState());
        
        System.out.println("\nStarting threads...");
        
        // Start both threads
        t1.start();
        t2.start();
        
        // Display thread information after starting
        System.out.println("\nThread States After Starting:");
        System.out.println(t1.getName() + " State: " + t1.getState());
        System.out.println(t2.getName() + " State: " + t2.getState());
        
        // Wait for both threads to complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        // Display final thread states
        System.out.println("\nThread States After Completion:");
        System.out.println(t1.getName() + " State: " + t1.getState());
        System.out.println(t2.getName() + " State: " + t2.getState());
        
        System.out.println("\nMain thread ending");
    }
}