package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: DeliveryRequest.java
 * Description: This class represents a delivery request containing the product and destination information.
 */

public class DeliveryRequest {
    private String product;
    private String destination;

    public DeliveryRequest(String product, String destination) {
        this.product = product;
        this.destination = destination;
    }

    public String getProduct() {
        return product;
    }

    public String getDestination() {
        return destination;
    }
}
