package com.example.demo;

// ==========================================
// CLASS DEFINITION (Blueprint)
// ==========================================
class BankAccount {
    // Fields / Attributes
    String accountNumber;
    String accountHolder;
    double balance;

    // STARTER LEVEL
    // TODO 1: Write the Constructor for BankAccount
    // Parameters: String accountNumber, String accountHolder, double initialBalance
        // Assign incoming parameters to 'this.accountNumber', 'this.accountHolder', and 'this.balance'
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    // MEDIUM LEVEL
    // TODO 2: Write a method named 'deposit'
    // Return type: void | Parameter: double amount
    // Add 'amount' to 'this.balance'
    public void deposit(double amount) {
        this.balance +=amount;
    }


    // TODO 3: Write a method named 'withdraw'
    // Return type: boolean | Parameter: double amount
    // If amount <= balance, subtract amount from balance and return true
    // Otherwise, print "Insufficient funds for " + accountHolder and return false
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        else {
             System.out.println("Insufficient funds for " + accountHolder );
             return false;
        }
    }    


    // Helper method to display balance
    void displayAccountSummary() {
        System.out.println("Account [" + accountNumber + "] | Holder: " + accountHolder + " | Balance: €" + balance);
    }
}


// ==========================================
// MAIN CLASS (Program Execution)
// ==========================================
public class OopPractice {
    public static void main(String[] args) {

        // CHALLENGE LEVEL
        // TODO 4:
        // 1. Create Object 1 (acc1): "DE1001", "Kithsara", 500.0
        // 2. Create Object 2 (acc2): "DE1002", "Anna", 1000.0
        // 3. Deposit €150.0 into acc1
        // 4. Withdraw €200.0 from acc2
        
        BankAccount acc1 = new BankAccount("DE1001", "Kithsara", 500.0);
        BankAccount acc2 = new BankAccount("DE1002", "Anna", 1000.0);

        // Perform deposit & withdraw calls here:
        acc1.deposit(150.0 );
        acc2.withdraw(200.0);

        // Print summaries
        System.out.println("--- Updated Account Summaries ---");
        if (acc1 != null) acc1.displayAccountSummary();
        if (acc2 != null) acc2.displayAccountSummary();
    }
}