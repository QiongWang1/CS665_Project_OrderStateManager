// BeverageTest.java
package edu.bu.met.cs665.hw1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 06/19/1989
 * File Name: BeverageTest.java
 * Description: This class tests beverage creation and condiment addition functionalities.
 */
public class BeverageTest {

    @Test
    public void testBeverageCreation() {
        Beverage coffee = new Coffee("Espresso");
        assertEquals("Espresso", coffee.getName());
        assertEquals(2.0, coffee.getBasePrice(), 0);
    }

    @Test
    public void testBeverageWithCondiments() {
        Beverage coffee = new Coffee("Americano");
        Beverage coffeeWithMilk = new Milk(coffee, 2);
        Beverage coffeeWithMilkAndSugar = new Sugar(coffeeWithMilk, 1);

        assertEquals(3.5, coffeeWithMilkAndSugar.getBasePrice(), 0);
        assertEquals("Americano (Coffee) with 2 units of milk and 1 units of sugar", coffeeWithMilkAndSugar.getDescription());
    }
}
