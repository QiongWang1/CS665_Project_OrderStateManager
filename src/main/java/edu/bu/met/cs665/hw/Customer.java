package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2024
 * File Name: Customer.java
 * Description: Class representing customer data with ID and name.
 */

public class Customer {
    private int customerId;
    private String name;

    /**
     * Constructor for creating a Customer object.
     * @param customerId The ID of the customer.
     * @param name The name of the customer.
     */
    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    /**
     * Returns the customer ID.
     * @return The customer ID.
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Returns the name of the customer.
     * @return The customer's name.
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name;
    }
}
