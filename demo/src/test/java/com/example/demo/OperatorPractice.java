package com.example.demo;

public class OperatorPractice {
    public static void main(String[] args) {

        // ==========================================
        // STARTER LEVEL
        // ==========================================
        int number = 15;
        // TODO 1: Use the modulus operator (%) to check if 'number' is even.
        // Store the result in a boolean variable named 'isEven'.
        // (Hint: An even number divided by 2 leaves a remainder of 0: number % 2 == 0)
        boolean isEven = number % 2 == 0; //My answer


        // ==========================================
        // MEDIUM LEVEL
        // ==========================================
        int candidateAge = 25;
        int yearsOfExperience = 3;
        // TODO 2: Write a condition to check if candidateAge is 21 or older AND yearsOfExperience is at least 2.
        // Store the result in a boolean variable named 'isQualified'.
        boolean isQualified = (candidateAge >= 21) && (yearsOfExperience >= 2) ; // My answer


        // ==========================================
        // CHALLENGE LEVEL
        // ==========================================
        int scoredPoints = 42;
        int totalPoints = 50;
        
        // TODO 3: The line below currently evaluates to 0.0 because of integer division (42 / 50 = 0)!
        // double percentage = scoredPoints / totalPoints * 100;
        // Fix this line so that 'percentage' correctly equals 84.0!
        // (Hint: Convert at least one operand to a double, e.g., (double) scoredPoints)
        double percentage = (double) scoredPoints / totalPoints * 100; // My answer


        // ==========================================
        // PRINT RESULTS (Do not modify these)
        // ==========================================
        System.out.println("Is " + number + " even? " + isEven);
        System.out.println("Is Candidate Qualified? " + isQualified);
        System.out.println("Percentage Score: " + percentage + "%");
    }
}