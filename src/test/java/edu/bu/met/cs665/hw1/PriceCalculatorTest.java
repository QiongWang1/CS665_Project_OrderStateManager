// PriceCalculatorTest.java
package edu.bu.met.cs665.hw1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 06/19/1989
 * File Name: PriceCalculatorTest.java
 * Description: This class tests the price calculation functionality.
 */
public class PriceCalculatorTest {

    @Test
    public void testCalculatePrice() {
        Beverage coffee = new Coffee("Latte Macchiato");
        Beverage coffeeWithMilk = new Milk(coffee, 2);
        PriceCalculator calculator = new PriceCalculator();

        double price = calculator.calculatePrice(coffeeWithMilk);
        assertEquals(3.0, price, 0);
    }
}
