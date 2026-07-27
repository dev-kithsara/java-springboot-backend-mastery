package com.example.demo;

public class ControlFlowPractice {
    public static void main(String[] args) {

        // ==========================================
        // STARTER LEVEL
        // ==========================================
        int number = -5;
        // TODO 1: Write an if / else if / else statement:
        // - If 'number' is greater than 0, print "Positive"
        // - Else if 'number' is less than 0, print "Negative"
        // - Else, print "Zero"
        if (number > 0) { System.out.println("Positive");}
        else if (number < 0 ) { System.out.println("Negative");}
        else {System.out.println("Zero");}
        


        // ==========================================
        // MEDIUM LEVEL
        // ==========================================
        int carSpeed = 75; // speed in km/h
        // TODO 2: Check carSpeed and print:
        // - If carSpeed is 50 or less: print "Safe Speed"
        // - Else if carSpeed is between 51 and 80: print "Warning: High Speed"
        // - Else (carSpeed > 80): print "Danger: Fine Issued!"
        if (carSpeed <= 50) { System.out.println("Safe Speed");}
        else if (carSpeed >=51 && carSpeed <= 80) { System.out.println("Warning: High Speed");}
        else  {System.out.println("Danger: Fine Issued!");}
        // ==========================================
        // CHALLENGE LEVEL
        // ==========================================
        double billAmount = 250.0;
        double finalBill = billAmount;
        
        // TODO 3: Calculate the final bill based on discounts:
        // - If billAmount is greater than 200, apply a 20% discount (finalBill = billAmount * 0.80)
        // - Else if billAmount is greater than 100, apply a 10% discount (finalBill = billAmount * 0.90)
        // - Else: No discount (finalBill remains unchanged)
        // (REMEMBER: Be careful with the order of your conditions!)
        if ( billAmount > 200) { finalBill = billAmount * 0.80;}
        else if ( billAmount > 100 ) { finalBill = billAmount * 0.90; }
        else { finalBill = billAmount; }

        // Print final bill result
        System.out.println("Final Bill after discount: $" + finalBill);
    }
}