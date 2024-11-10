package edu.bu.met.cs665.hw;

import java.util.HashMap;
import java.util.Map;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2024
 * File Name: MockCustomerDataUsb.java
 * Description: Mock implementation of the legacy system's data access interface for testing.
 */

public class MockCustomerDataUsb implements CustomerDataViaUsb {
    private Map<Integer, Customer> customerDatabase;

    /**
     * Constructor that initializes a mock customer database with sample data.
     * This simulates the legacy system's data retrieval through a USB interface.
     */
    public MockCustomerDataUsb() {
        // Creating a simple mock database with sample customer data
        customerDatabase = new HashMap<>();
        customerDatabase.put(1, new Customer(1, "Alice"));
        customerDatabase.put(2, new Customer(2, "Bob"));
    }

    /**
     * Prints customer information based on customer ID.
     * If the customer is found, prints their details with USB source indication;
     * otherwise, prints "Customer not found in USB database."
     * @param customerId The ID of the customer to print
     */
    @Override
    public void printCustomer(int customerId) {
        Customer customer = customerDatabase.get(customerId);
        if (customer != null) {
            System.out.println("USB System: Customer ID: " + customerId + ", Name: " + customer.getName());
        } else {
            System.out.println("Customer not found in USB database.");
        }
    }


    /**
     * Retrieves customer information from the USB database.
     * @param customerId The ID of the customer to retrieve
     * @return The Customer object if found; otherwise, null
     */
    @Override
    public Customer getCustomerViaUsb(int customerId) {
        return customerDatabase.get(customerId);
    }
}
