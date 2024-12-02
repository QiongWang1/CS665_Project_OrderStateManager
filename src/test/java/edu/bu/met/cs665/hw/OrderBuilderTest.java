package edu.bu.met.cs665.hw;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: OrderBuilderTest.java
 * Description: Tests the implementation of the OrderBuilder and FlyweightFactory classes.
 */

public class OrderBuilderTest {

    @Test
    public void testOrderCreation() {
        // Initialize FlyweightFactory
        FlyweightFactory factory = new FlyweightFactory();

        // Use OrderBuilder to create an Order
        OrderBuilder builder = new OrderBuilder();
        Order order = builder
                .addProduct(factory.getProduct("Laptop", 1000.0))
                .addProduct(factory.getProduct("Mouse", 25.0))
                .addProduct(factory.getProduct("Keyboard", 45.0))
                .setLogistics("Express Delivery")
                .setPromotion("10% Off")
                .build();

        // Assert total price
        double expectedTotal = 1000.0 + 25.0 + 45.0;
        assertEquals(expectedTotal, order.calculateTotal(), 0.01);

        // Print order details (optional for debugging)
        System.out.println(order);
    }
}
