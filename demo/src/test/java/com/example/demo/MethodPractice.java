package com.example.demo;

public class MethodPractice {

    public static void main(String[] args) {

        // ==========================================
        // STARTER LEVEL
        // ==========================================
        // TODO 1: Call 'printWelcome' method with your name
        printWelcome("Kithsara");


        // ==========================================
        // MEDIUM LEVEL
        // ==========================================
        // TODO 2: Call 'calculateDiscount' with original price 200.0 and 15.0% discount
        // Store the returned value in 'finalPrice' and print it
        double finalPrice = calculateDiscount(200.0, 15.0);
        System.out.println("Final Discounted Price: €" + finalPrice);
        

        // ==========================================
        // CHALLENGE LEVEL
        // ==========================================
        // TODO 3: Call 'isEligibleForPromotion' with 4 years of experience and "EXCELLENT" rating.
        // Store the returned boolean in 'canPromote' and print it
        boolean canPromote = isEligibleForPromotion(4, "EXCELLENT");
        System.out.println("Is Eligible for Promotion? " + canPromote);
    }


    // ==========================================
    // METHOD DEFINITIONS (Fill in your code below)
    // ==========================================

    // TODO 1 METHOD:
    // Return type: void
    // Parameter: String userName
    public static void printWelcome(String userName) {
        System.out.println( "Welcome to Backend Engineering, " + userName + "!");
        
    }


    // TODO 2 METHOD:
    // Return type: double
    // Parameters: double originalPrice, double discountPercent
    public static double calculateDiscount(double originalPrice, double discountPercent) {
        return originalPrice - (originalPrice * (discountPercent / 100.0));
    }


    // TODO 3 METHOD:
    // Return type: boolean
    // Parameters: int years, String rating
    public static boolean isEligibleForPromotion(int years, String rating) {
    return years >= 3 && 
           (rating.equals("EXCELLENT") || rating.equals("OUTSTANDING"));
}
}