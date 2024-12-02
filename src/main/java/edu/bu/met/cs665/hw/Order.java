package edu.bu.met.cs665.hw;

import java.util.List;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: Order.java
 * Description: Represents an order, supports saving/restoring state using the Memento pattern,
 * and implements the Visitor pattern for processing order components.
 */
public class Order {
    private List<ProductFlyweight> products; // List of products in the order
    private String logistics; // Logistics details
    private String promotion; // Promotion details

    // Constructor
    public Order(List<ProductFlyweight> products, String logistics, String promotion) {
        this.products = products;
        this.logistics = logistics;
        this.promotion = promotion;
    }

    // Getters
    public List<ProductFlyweight> getProducts() {
        return products;
    }

    public String getLogistics() {
        return logistics;
    }

    public String getPromotion() {
        return promotion;
    }

    // Calculate the total price of the order
    public double calculateTotal() {
        return products.stream().mapToDouble(ProductFlyweight::getPrice).sum();
    }

    // Save the current state as a memento
    public OrderMemento saveToMemento() {
        return new OrderMemento(products, logistics, promotion);
    }

    // Restore the state from a memento
    public void restoreFromMemento(OrderMemento memento) {
        this.products = memento.getProducts();
        this.logistics = memento.getLogistics();
        this.promotion = memento.getPromotion();
    }

    // Accept a visitor to process the order components
    public void accept(OrderVisitor visitor) {
        visitor.visitProducts(this);
        visitor.visitPromotion(this);
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", logistics='" + logistics + '\'' +
                ", promotion='" + promotion + '\'' +
                ", totalPrice=" + calculateTotal() +
                '}';
    }
}
