package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: Driver.java
 * Description: This class represents a driver who receives notifications about delivery requests.
 */

public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    // Method to receive notifications about the delivery request
    public void notify(DeliveryRequest request) {
        System.out.println("Driver " + name + " received request to deliver " +
                request.getProduct() + " to " + request.getDestination());
    }
}
