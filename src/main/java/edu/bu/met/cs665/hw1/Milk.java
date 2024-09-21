package edu.bu.met.cs665.hw1;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 06/19/1989
 * File Name: Milk.java
 * Description: This class extends CondimentDecorator to add milk to beverages.
 */
public class Milk extends CondimentDecorator {
    private int milkUnits;

    /**
     * Constructor for Milk.
     * @param beverage Beverage to which milk is added
     * @param milkUnits Number of units of milk to add
     */
    public Milk(Beverage beverage, int milkUnits) {
        super(beverage);
        this.milkUnits = milkUnits <= 3 ? milkUnits : 3;  // Limit to 3 units
    }

    /**
     * Get the description of the beverage with milk.
     * @return Description of the beverage with milk
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + " with " + milkUnits + " units of milk";
    }

    /**
     * Get the price of the beverage with milk.
     * @return Total price of the beverage with milk
     */
    @Override
    public double getBasePrice() {
        return beverage.getBasePrice() + (milkUnits * 0.50);  // Each milk unit costs $0.50
    }

    /**
     * Brew the beverage with milk by calling the underlying beverage's brew method.
     */
    @Override
    public void brew() {
        beverage.brew();
    }
}
