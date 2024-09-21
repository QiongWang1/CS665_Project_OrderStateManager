package edu.bu.met.cs665.hw1;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 06/19/1989
 * File Name: Sugar.java
 * Description: This class extends CondimentDecorator to add sugar to beverages.
 */
public class Sugar extends CondimentDecorator {
    private int sugarUnits;

    /**
     * Constructor for Sugar.
     * @param beverage Beverage to which sugar is added
     * @param sugarUnits Number of units of sugar to add
     */
    public Sugar(Beverage beverage, int sugarUnits) {
        super(beverage);
        this.sugarUnits = sugarUnits <= 3 ? sugarUnits : 3;  // Limit to 3 units
    }

    /**
     * Get the description of the beverage with sugar.
     * @return Description of the beverage with sugar
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + " and " + sugarUnits + " units of sugar";
    }

    /**
     * Get the price of the beverage with sugar.
     * @return Total price of the beverage with sugar
     */
    @Override
    public double getBasePrice() {
        return beverage.getBasePrice() + (sugarUnits * 0.50);  // Each sugar unit costs $0.50
    }

    /**
     * Brew the beverage with sugar by calling the underlying beverage's brew method.
     */
    @Override
    public void brew() {
        beverage.brew();
    }
}
