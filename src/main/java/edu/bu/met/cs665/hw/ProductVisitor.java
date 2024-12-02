package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: ProductVisitor.java
 * Description: Implements OrderVisitor to process and analyze the products in an Order.
 */
public class ProductVisitor implements OrderVisitor {

    @Override
    public void visitProducts(Order order) {
        System.out.println("Processing products in the order...");
        order.getProducts().forEach(product ->
                System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice())
        );
    }

    @Override
    public void visitPromotion(Order order) {
        // This visitor doesn't process promotions
    }
}
