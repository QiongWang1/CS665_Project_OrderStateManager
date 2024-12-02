package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: PromotionVisitor.java
 * Description: Implements OrderVisitor to process and analyze the promotion in an Order.
 */
public class PromotionVisitor implements OrderVisitor {

    @Override
    public void visitProducts(Order order) {
        // This visitor doesn't process products
    }

    @Override
    public void visitPromotion(Order order) {
        System.out.println("Processing promotion in the order...");
        System.out.println("Promotion details: " + order.getPromotion());
    }
}
