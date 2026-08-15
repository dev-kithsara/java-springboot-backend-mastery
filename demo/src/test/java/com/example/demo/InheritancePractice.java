package com.example.demo;

// ==========================================
// PARENT CLASS (Superclass)
// ==========================================
class PaymentMethod {
    protected double amount; // 'protected' allows direct access in child classes!

    // Constructor
    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    // Parent Method
    public void processPayment() {
        System.out.println("Processing generic payment of €" + amount);
    }
}


// ==========================================
// CHILD CLASS 1: CreditCardPayment
// ==========================================
// STARTER LEVEL
// TODO 1: Make 'CreditCardPayment' inherit from 'PaymentMethod' using 'extends'
class CreditCardPayment extends PaymentMethod {
    private String cardNumber;

    // TODO 2: Write Constructor for CreditCardPayment
    // Parameters: double amount, String cardNumber
    // Call super(amount) to pass amount to PaymentMethod parent constructor!
    // Set this.cardNumber = cardNumber
    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    // TODO 3: Override 'processPayment()'
    // Print: "Processing Credit Card (" + cardNumber + ") for amount: €" + amount
    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card (" + cardNumber + ") for amount: €" + amount);
    }
}


// ==========================================
// CHILD CLASS 2: PayPalPayment
// ==========================================
// MEDIUM LEVEL
// TODO 4: Create 'PayPalPayment' class extending 'PaymentMethod'
// 1. Add private field: String email
// 2. Write Constructor: PayPalPayment(double amount, String email) -> use super(amount)
// 3. Override 'processPayment()':
//    Print: "Processing PayPal payment for " + email + " for amount: €" + amount
class PayPalPayment extends PaymentMethod {
    // Write field, constructor, and overridden processPayment() here
    private String email;
    
    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment for " + email + " for amount: €" + amount);
    }
}


// ==========================================
// MAIN CLASS (Testing Polymorphism)
// ==========================================
public class InheritancePractice {
    public static void main(String[] args) {

        // CHALLENGE LEVEL (Dynamic Method Dispatch)
        // 1. Create a CreditCardPayment object: €150.0, "1234-5678-9012-3456"
        // 2. Create a PayPalPayment object: €89.99, "kithsara@example.com"
        // Store both inside PaymentMethod reference variables (Polymorphism!)

        PaymentMethod cardPayment = new CreditCardPayment(150.0, "1234-5678-9012-3456");
        PaymentMethod paypalPayment = new PayPalPayment(89.99, "kithsara@example.com");

        // Trigger processPayment() on both - JVM will dynamically dispatch to correct child methods!
        System.out.println("--- Executing Payment Processing Engine ---");
        cardPayment.processPayment();
        paypalPayment.processPayment();
    }
}


