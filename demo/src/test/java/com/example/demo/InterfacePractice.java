package com.example.demo;

interface PaymentProcessor {
    void process(double amount);
}

class StripeProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println( "Processing €" + amount + " via Stripe.");
    }
}

class PaypalProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println( "Processing €" + amount + " via PayPal.");
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
    
    PaymentProcessor processor1 = new StripeProcessor();
    processor1.process(50.0);

    PaymentProcessor processor2 = new PaypalProcessor();
    processor2.process(75.50);

    }
}