package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: ProductFlyweight.java
 * Description: This class implements the Flyweight pattern for shared product data.
 */

public class ProductFlyweight {
    private final String name;
    private final double price;

    public ProductFlyweight(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Get the product name
    public String getName() {
        return name;
    }

    // Get the product price
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
