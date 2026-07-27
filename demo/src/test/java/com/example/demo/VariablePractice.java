package com.example.demo; // Keep this package line at the top

public class VariablePractice {
    public static void main(String[] args) {

        // ==========================================
        // STARTER LEVEL
        // ==========================================
        // TODO 1: Declare an integer variable named 'age' and set it to 28
         int age = 28;        

        // TODO 2: Declare a double variable named 'hourlyRate' and set it to 15.50
         double hourlyRate = 15.50;

        // TODO 3: Declare a boolean variable named 'hasJob' and set it to true
         boolean hasJob = true;


        // ==========================================
        // MEDIUM LEVEL
        // ==========================================
        // TODO 4: Calculate total earnings for an 8-hour workday.
        // Multiply 'hourlyRate' by 8 and store the result in a new double variable named 'totalEarnings'
         double totalEarnings = hourlyRate * 8;
        


        // ==========================================
        // CHALLENGE LEVEL
        // ==========================================
        // TODO 5: Fix the two broken lines below so they compile and run correctly:
        // int itemsCount = "10";
        // double productPrice = '29.99';
         int itemsCount = 10;
        double productPrice = 29.99;

        // ==========================================
        // PRINT RESULTS (Do not modify these)
        // ==========================================
        System.out.println("Age: " + age);
        System.out.println("Has Job: " + hasJob);
        System.out.println("Total Earnings: €" + totalEarnings);
        System.out.println("Items Count: " + itemsCount);
        System.out.println("Product Price: €" + productPrice);
    }
}