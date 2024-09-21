package edu.bu.met.cs665.hw1;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 06/19/1989
 * File Name: Coffee.java
 * Description: This class extends Beverage to represent different types of coffee.
 */
public class Coffee extends Beverage {

    /**
     * Constructor for Coffee.
     * @param type Type of coffee (e.g., Espresso, Americano)
     */
    public Coffee(String type) {
        super(type, 2.00);  // Base price for coffee is $2.00
    }

    /**
     * Method to brew the coffee.
     */
    @Override
    public void brew() {
        System.out.println("Brewing coffee: " + name);
    }

    /**
     * Get the description of the coffee.
     * @return Description of the coffee
     */
    @Override
    public String getDescription() {
        return name + " (Coffee)";
    }
}
