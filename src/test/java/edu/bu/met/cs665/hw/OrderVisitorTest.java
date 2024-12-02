package edu.bu.met.cs665.hw;

import org.junit.Test;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: OrderVisitorTest.java
 * Description: Tests the Visitor pattern implementation for Order.
 */
public class OrderVisitorTest {

    @Test
    public void testVisitorPattern() {
        // Initialize FlyweightFactory
        FlyweightFactory factory = new FlyweightFactory();

        // Create an order
        OrderBuilder builder = new OrderBuilder();
        Order order = builder
                .addProduct(factory.getProduct("Laptop", 1000.0))
                .addProduct(factory.getProduct("Mouse", 25.0))
                .setLogistics("Express Delivery")
                .setPromotion("Black Friday Discount")
                .build();

        // Use visitors
        OrderVisitor productVisitor = new ProductVisitor();
        OrderVisitor promotionVisitor = new PromotionVisitor();

        // Process the order with visitors
        order.accept(productVisitor);
        order.accept(promotionVisitor);
    }
}
