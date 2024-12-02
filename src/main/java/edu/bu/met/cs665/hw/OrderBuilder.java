package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: OrderBuilder.java
 * Description: This class implements the Builder pattern to create an Order object.
 */

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private List<ProductFlyweight> products = new ArrayList<>();
    private String logistics;
    private String promotion;

    // Add a product to the order
    public OrderBuilder addProduct(ProductFlyweight product) {
        products.add(product);
        return this;
    }

    // Set the logistics for the order
    public OrderBuilder setLogistics(String logistics) {
        this.logistics = logistics;
        return this;
    }

    // Set the promotion for the order
    public OrderBuilder setPromotion(String promotion) {
        this.promotion = promotion;
        return this;
    }

    // Build the final order object
    public Order build() {
        return new Order(products, logistics, promotion);
    }
}
