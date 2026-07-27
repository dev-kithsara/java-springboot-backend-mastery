package com.example.demo;

public class LoopPractice {
    public static void main(String[] args) {

        // ==========================================
        // STARTER LEVEL (For Loop)
        // ==========================================
        // TODO 1: Write a 'for' loop that prints numbers from 1 to 5:
        // Output should be: 1 2 3 4 5 (or on separate lines)
        for (int i=1; i<= 5; i++) {
            System.out.println(i);
        }


        // ==========================================
        // MEDIUM LEVEL (While Loop Countdown)
        // ==========================================
        int countdown = 5;
        // TODO 2: Write a 'while' loop that prints the value of 'countdown' and then decreases it by 1.
        // Loop while 'countdown' is greater than 0.
        // AFTER the loop finishes, print "🚀 Blast Off!"
        while (countdown>0) {
            System.out.println(countdown );
            countdown --;   
        }        
        System.out.println("🚀 Blast Off!");

        // ==========================================
        // CHALLENGE LEVEL (Loop + If Condition + Accumulator)
        // ==========================================
        int sumOfEvens = 0;
        // TODO 3: Write a 'for' loop from 1 to 10 (inclusive).
        // Inside the loop, check if the number is even (i % 2 == 0).
        // If it is even, add it to 'sumOfEvens' (sumOfEvens += i).
        for (int i=1; i<=10; i++){
            if (i % 2 == 0) {
                sumOfEvens +=i; 
            }
        }        


        // Print sum result (Expected output: 2 + 4 + 6 + 8 + 10 = 30)
        System.out.println("Sum of even numbers (1 to 10): " + sumOfEvens);
    }
}