package edu.bu.met.cs665.hw1;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 06/19/1989
 * File Name: BeverageFactory.java
 * Description: This class is responsible for creating beverage objects.
 */
public class BeverageFactory {

    /**
     * Create a beverage based on type.
     * @param type The type of beverage to create
     * @return A new Beverage object
     */
    public Beverage createBeverage(String type) {
        switch (type.toLowerCase()) {
            case "espresso":
                return new Coffee("Espresso");
            case "americano":
                return new Coffee("Americano");
            case "black tea":
                return new Tea("Black Tea");
            case "green tea":
                return new Tea("Green Tea");
            case "yellow tea":
                return new Tea("Yellow Tea");
            default:
                System.out.println("Unknown beverage type: " + type);
                return null;
        }
    }
}
