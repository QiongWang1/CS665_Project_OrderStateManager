package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: OrderVisitor.java
 * Description: Defines an interface for visiting and operating on different parts of an Order.
 */
public interface OrderVisitor {
    void visitProducts(Order order); // Visit and process products
    void visitPromotion(Order order); // Visit and process promotion
}
