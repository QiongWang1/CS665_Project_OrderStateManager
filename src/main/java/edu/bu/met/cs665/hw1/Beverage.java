package edu.bu.met.cs665.hw1;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 06/19/1989
 * File Name: Beverage.java
 * Description: This is an abstract class for beverages, defining basic attributes and methods.
 */
public abstract class Beverage {
    protected String name;
    protected double basePrice;

    /**
     * Constructor for Beverage.
     * @param name Name of the beverage
     * @param basePrice Base price of the beverage
     */
    public Beverage(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    /**
     * Get the name of the beverage.
     * @return Name of the beverage
     */
    public String getName() {
        return name;
    }

    /**
     * Get the base price of the beverage.
     * @return Base price of the beverage
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * Abstract method to brew the beverage.
     */
    public abstract void brew();

    // Declare the getDescription method
    public abstract String getDescription();
}
