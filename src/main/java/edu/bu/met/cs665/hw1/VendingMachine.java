package edu.bu.met.cs665.hw1;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 06/19/1989
 * File Name: VendingMachine.java
 * Description: This class manages the vending machine's beverages.
 */
public class VendingMachine {
    private List<Beverage> beverages = new ArrayList<>();
    private int size;

    /**
     * Initialize the vending machine with beverages.
     */
    public void init() {
        beverages.add(new Coffee("Espresso"));
        beverages.add(new Coffee("Americano"));
        beverages.add(new Coffee("Latte Macchiato"));  // 添加 Latte Macchiato
        beverages.add(new Tea("Black Tea"));
        beverages.add(new Tea("Green Tea"));
        beverages.add(new Tea("Yellow Tea"));
        size = beverages.size();
    }

    /**
     * Display the beverages in the vending machine and describe the condiment rules.
     */
    public void displayMachine() {
        System.out.println("Vending Machine has the following beverages:");
        for (Beverage beverage : beverages) {
            System.out.println(beverage.getName() + " - Price: $" + beverage.getBasePrice());
        }

        System.out.println("\nYou can customize your beverage by adding up to 3 units of milk and/or sugar.");
        System.out.println("Each unit of milk or sugar costs $0.50, and a maximum of 3 units for each condiment is allowed.");
        System.out.println("If you attempt to add more than 3 units, only 3 units will be added.");
    }

    /**
     * Returns the number of beverages in the vending machine.
     * @return the number of beverages.
     */
    public int getSize() {
        return size;
    }
}
