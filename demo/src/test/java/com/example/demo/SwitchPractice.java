package com.example.demo;

public class SwitchPractice {
    public static void main(String[] args) {

        // ==========================================
        // STARTER LEVEL (Traditional Switch)
        // ==========================================
        int statusCode = 404;
        // TODO 1: Write a traditional switch statement for 'statusCode':
        // - 200: print "200: OK"
        // - 404: print "404: Not Found"
        // - 500: print "500: Internal Server Error"
        // - default: print "Unknown Status Code"
        // (Remember to include break; statements!) 
        switch (statusCode) {
            case 200:
                System.out.println("200: OK");
                break;
            case 404:
                System.out.println("404: Not Found");
                break;
            case 500:
                System.out.println("500: Internal Server Error");
                break;
            default:
                System.out.println("Unknown Status Code");
                       }


        // ==========================================
        // MEDIUM LEVEL (Switch with Strings)
        // ==========================================
        String userRole = "ADMIN";
        // TODO 2: Write a switch statement checking 'userRole':
        // - "ADMIN": print "Access Granted: Full Control"
        // - "USER":  print "Access Granted: Standard User"
        // - "GUEST": print "Access Granted: Read Only"
        // - default: print "Access Denied: Invalid Role"
        switch (userRole) {
            case "ADMIN":
                System.out.println("Access Granted: Full Control");
                break;
            case "USER":
                System.out.println("Access Granted: Standard User");
                break;
            case "GUEST":
                System.out.println("Access Granted: Read Only");
                break;
            default:
                System.out.println( "Access Denied: Invalid Role");
                break;
        }


        // ==========================================
        // CHALLENGE LEVEL (Modern Java Enhanced Switch)
        // ==========================================
        String trafficLight = "YELLOW";
        
        // TODO 3: Complete the modern arrow switch below to assign the value to 'action':
        // - "RED"    -> "STOP"
        // - "YELLOW" -> "CAUTION"
        // - "GREEN"  -> "GO"
        // - default  -> "INVALID LIGHT"
        
        String action = switch (trafficLight) {
            case "RED" -> "STOP";
            case  "YELLOW" -> "CAUTION";
            case "GREEN"  -> "GO";
            default -> "INVALID LIGHT";
        };


        // Print challenge result
        System.out.println("Traffic Action: " + action);
    }
}