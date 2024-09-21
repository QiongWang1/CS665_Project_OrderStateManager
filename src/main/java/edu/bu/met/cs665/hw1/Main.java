package edu.bu.met.cs665.hw1;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 06/19/1989
 * File Name: Main.java
 * Description: This is the main entry point to the program.
 */
public class Main {

    /**
     * The main method is the entry point to the program.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Initialize the vending machine
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.init();

        // Display the beverages available in the vending machine
        vendingMachine.displayMachine();

        // Create a factory object
        BeverageFactory factory = new BeverageFactory();

        // Use the factory to create a beverage
        Beverage beverage = factory.createBeverage("Espresso");

        if (beverage != null) {
            System.out.println();
            beverage.brew();  // Brew the selected beverage
        }

        // Add condiments to the beverage
        Beverage beverageWithMilk = new Milk(beverage, 2);
        Beverage beverageWithMilkAndSugar = new Sugar(beverageWithMilk, 1);

        // Calculate the total price of the beverage with condiments
        PriceCalculator calculator = new PriceCalculator();
        double price = calculator.calculatePrice(beverageWithMilkAndSugar);

        // Output the final description and price of the beverage
        System.out.println(beverageWithMilkAndSugar.getDescription() + " - Total Price: $" + price);
    }
}

