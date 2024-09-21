package edu.bu.met.cs665.hw1;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 06/19/1989
 * File Name: Tea.java
 * Description: This class extends Beverage to represent different types of tea.
 */
public class Tea extends Beverage {

    /**
     * Constructor for Tea.
     * @param type Type of tea (e.g., Green Tea, Black Tea)
     */
    public Tea(String type) {
        super(type, 1.50);  // Base price for tea is $1.50
    }

    /**
     * Method to brew the tea.
     */
    @Override
    public void brew() {
        System.out.println("Brewing tea: " + name);
    }

    /**
     * Get the description of the tea.
     * @return Description of the tea
     */
    @Override
    public String getDescription() {
        return name + " (Tea)";
    }
}
