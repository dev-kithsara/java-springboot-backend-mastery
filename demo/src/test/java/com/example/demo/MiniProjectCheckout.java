package com.example.demo;

public class MiniProjectCheckout {
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   BERLIN E-COMMERCE CHECKOUT SYSTEM      ");
        System.out.println("==========================================");

        // --- STEP 1: ITEM PRICES & LOOP ---
        double subtotal = 0.0;
        // TODO 1: Create an array or loop through 3 item prices: 25.0, 45.0, and 60.0
        // Use a loop (for or while) to accumulate these prices into 'subtotal'
        double[] prices = {25.0, 45.0, 60.0};
        for (int i = 0 ; i < prices.length; i++) {
            subtotal +=prices[i];
        }

        // --- STEP 2: MEMBERSHIP DISCOUNT (SWITCH) ---
        String customerTier = "GOLD"; // Options: "GOLD", "SILVER", "BRONZE", "GUEST"
        double membershipDiscountRate = 0.0;

        // TODO 2: Write an enhanced switch statement for 'customerTier':
        // - "GOLD"   -> 0.15 (15% off)
        // - "SILVER" -> 0.10 (10% off)
        // - "BRONZE" -> 0.05 (5% off)
        // - default  -> 0.00 (0% off)
        // Assign the result to 'membershipDiscountRate'
        membershipDiscountRate = switch (customerTier) {
            case "GOLD" -> 0.15 ;
            case "SILVER" -> 0.10;
            case "BRONZE" -> 0.05;
            default  -> 0.00;
        };
        


        // --- STEP 3: BULK DISCOUNT (IF/ELSE) ---
        double bulkDiscountRate = 0.0;

        // TODO 3: Write an if / else if / else statement on 'subtotal':
        // - If subtotal > 100.0  -> bulkDiscountRate = 0.10 (10%)
        // - Else if subtotal > 50.0 -> bulkDiscountRate = 0.05 (5%)
        // - Else -> bulkDiscountRate = 0.0
        if (subtotal > 100.0) {
             bulkDiscountRate = 0.10;
        }
        else if (subtotal > 50.0) {
            bulkDiscountRate = 0.05;
        }
        else {bulkDiscountRate = 0.0;}
        


        // --- STEP 4: TOTAL CALCULATIONS (OPERATORS) ---
        // TODO 4: Calculate total discounts and net price:
        // 1. Calculate totalDiscountAmount = subtotal * (membershipDiscountRate + bulkDiscountRate)
        // 2. Calculate discountedSubtotal = subtotal - totalDiscountAmount
        // 3. Calculate vatTax = discountedSubtotal * 0.19 (19% German VAT)
        // 4. Calculate grandTotal = discountedSubtotal + vatTax
        
        double totalDiscountAmount = subtotal * (membershipDiscountRate + bulkDiscountRate);
        double discountedSubtotal = subtotal - totalDiscountAmount;
        double vatTax =discountedSubtotal * 0.19;
        double grandTotal = discountedSubtotal + vatTax;


        // --- STEP 5: RECEIPT DISPLAY ---
        System.out.println("Subtotal: €" + subtotal);
        System.out.println("Customer Tier: " + customerTier + " (" + (membershipDiscountRate * 100) + "% off)");
        System.out.println("Bulk Discount: " + (bulkDiscountRate * 100) + "% off");
        System.out.println("Total Discount Saved: €" + totalDiscountAmount);
        System.out.println("19% German VAT: €" + vatTax);
        System.out.println("------------------------------------------");
        System.out.println("GRAND TOTAL TO PAY: €" + grandTotal);
        System.out.println("==========================================");
    }
}