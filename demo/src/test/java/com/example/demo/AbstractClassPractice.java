package com.example.demo;

abstract class Appliance {

    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public abstract void turnOn();

    public void turnOff() {
        System.out.println("Turning off " + brand + " appliance.");
    }
}

class WashingMachine extends Appliance {

    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println("Washing machine by " + brand + " is filling with water!");
    }
}

public class AbstractClassPractice {

    public static void main(String[] args) {

        Appliance myWasher = new WashingMachine("Samsung");

        myWasher.turnOn();
        myWasher.turnOff();
    }
}