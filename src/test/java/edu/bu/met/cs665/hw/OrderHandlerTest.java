package edu.bu.met.cs665.hw;

import org.junit.Test;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: OrderHandlerTest.java
 * Description: Tests the chain of responsibility for order processing.
 */
public class OrderHandlerTest {

    @Test
    public void testOrderProcessingChain() {
        // Initialize handlers
        OrderHandler confirmation = new ConfirmationHandler();
        OrderHandler payment = new PaymentHandler();
        OrderHandler shipping = new ShippingHandler();

        // Set up the chain
        confirmation.setNext(payment);
        payment.setNext(shipping);

        // Create an order
        FlyweightFactory factory = new FlyweightFactory();
        OrderBuilder builder = new OrderBuilder();
        Order order = builder
                .addProduct(factory.getProduct("Laptop", 1000.0))
                .setLogistics("Express Delivery")
                .setPromotion("Black Friday Discount")
                .build();

        // Process the order through the chain
        confirmation.handle(order);
    }
}
