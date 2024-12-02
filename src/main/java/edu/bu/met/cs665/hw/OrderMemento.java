package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: OrderMemento.java
 * Description: Represents a snapshot of an Order's state for the Memento pattern.
 */

import java.util.List;

public class OrderMemento {
    private final List<ProductFlyweight> products;
    private final String logistics;
    private final String promotion;

    public OrderMemento(List<ProductFlyweight> products, String logistics, String promotion) {
        this.products = List.copyOf(products); // Ensure immutability
        this.logistics = logistics;
        this.promotion = promotion;
    }

    public List<ProductFlyweight> getProducts() {
        return products;
    }

    public String getLogistics() {
        return logistics;
    }

    public String getPromotion() {
        return promotion;
    }
}
