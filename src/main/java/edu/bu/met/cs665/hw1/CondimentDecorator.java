package edu.bu.met.cs665.hw1;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 06/19/1989
 * File Name: CondimentDecorator.java
 * Description: This abstract class extends Beverage to allow the addition of condiments (decorator pattern).
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    /**
     * Constructor for CondimentDecorator.
     * @param beverage Beverage to which the condiment is added
     */
    public CondimentDecorator(Beverage beverage) {
        super(beverage.getName(), beverage.getBasePrice());
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}
