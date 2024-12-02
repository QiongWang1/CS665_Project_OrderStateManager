package edu.bu.met.cs665.hw;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: OrderMementoTest.java
 * Description: Tests the Memento pattern implementation for saving and restoring Order states.
 */

import java.util.List;

public class OrderMementoTest {

    @Test
    public void testOrderMemento() {
        // Initialize FlyweightFactory
        FlyweightFactory factory = new FlyweightFactory();

        // Create an order with initial state
        OrderBuilder builder = new OrderBuilder();
        Order order = builder
                .addProduct(factory.getProduct("Laptop", 1000.0))
                .setLogistics("Express Delivery")
                .setPromotion("Black Friday Discount")
                .build();

        System.out.println("Initial Order State: " + order);

        // Initialize OrderCaretaker to save and restore states
        OrderCaretaker caretaker = new OrderCaretaker();

        // Save the initial state
        caretaker.save(order.saveToMemento());
        System.out.println("Saved Initial State.");

        // Modify the order state
        order.restoreFromMemento(
                new OrderMemento(
                        List.of(factory.getProduct("Mouse", 25.0)),
                        "Standard Delivery",
                        "No Discount"
                )
        );
        System.out.println("Modified Order State: " + order);

        // Save the modified state
        caretaker.save(order.saveToMemento());
        System.out.println("Saved Modified State.");

        // Restore to initial state
        order.restoreFromMemento(caretaker.restore(0));
        System.out.println("Restored to Initial State: " + order);
        assertEquals("Express Delivery", order.getLogistics());
        assertEquals("Black Friday Discount", order.getPromotion());

        // Restore to modified state
        order.restoreFromMemento(caretaker.restore(1));
        System.out.println("Restored to Modified State: " + order);
        assertEquals("Standard Delivery", order.getLogistics());
        assertEquals("No Discount", order.getPromotion());
    }
}
