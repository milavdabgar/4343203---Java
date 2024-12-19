// Practical24.java - Banking Application with custom exception

// Custom Exception for insufficient funds
class InsufficientFundsException extends Exception {
    private double currentBalance;
    private double withdrawAmount;
    
    public InsufficientFundsException(double currentBalance, double withdrawAmount) {
        super(String.format("Not Sufficient Fund! Balance: $%.2f, Withdrawal Amount: $%.2f", 
              currentBalance, withdrawAmount));
        this.currentBalance = currentBalance;
        this.withdrawAmount = withdrawAmount;
    }
    
    public double getDeficit() {
        return withdrawAmount - currentBalance;
    }
}

// Bank Account class
class BankAccount {
    private double balance;
    private String accountNumber;
    
    public BankAccount(String accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: $%.2f\n", amount);
            displayBalance();
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(balance, amount);
        }
        
        balance -= amount;
        System.out.printf("Withdrawn: $%.2f\n", amount);
        displayBalance();
    }
    
    public void displayBalance() {
        System.out.printf("Current Balance: $%.2f\n", balance);
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
}

public class Practical24 {
    public static void main(String[] args) {
        System.out.println("Banking Application Demonstration:\n");
        
        // Create a bank account with initial deposit of $25000
        BankAccount account = new BankAccount("ACC001", 25000);
        System.out.println("Account created successfully!");
        account.displayBalance();
        
        try {
            // Performing transactions as per requirement
            System.out.println("\n1. Withdrawing $20000:");
            account.withdraw(20000);
            
            System.out.println("\n2. Withdrawing $4000:");
            account.withdraw(4000);
            
            System.out.println("\n3. Attempting to withdraw $2000:");
            account.withdraw(2000);
            
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
            System.out.printf("Deficit Amount: $%.2f\n", e.getDeficit());
        }
        
        // Additional demonstrations
        System.out.println("\nAdditional Operations:");
        
        try {
            // Deposit some money
            System.out.println("\n4. Depositing $1000:");
            account.deposit(1000);
            
            // Try withdrawal again
            System.out.println("\n5. Attempting to withdraw $1500:");
            account.withdraw(1500);
            
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
            System.out.printf("Deficit Amount: $%.2f\n", e.getDeficit());
        }
        
        // Final balance check
        System.out.println("\nFinal Account Status:");
        account.displayBalance();
    }
}