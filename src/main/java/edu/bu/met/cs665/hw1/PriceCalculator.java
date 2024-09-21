package edu.bu.met.cs665.hw1;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 06/19/1989
 * File Name: PriceCalculator.java
 * Description: This class calculates the total price of a beverage with condiments.
 */
public class PriceCalculator {

    /**
     * Calculate the total price of the beverage.
     * @param beverage The beverage whose price to calculate
     * @return The total price
     */
    public double calculatePrice(Beverage beverage) {
        return beverage.getBasePrice();
    }
}
