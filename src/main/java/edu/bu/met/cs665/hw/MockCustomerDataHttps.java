package edu.bu.met.cs665.hw;

import java.util.HashMap;
import java.util.Map;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2024
 * File Name: MockCustomerDataHttps.java
 * Description: Mock implementation of the new system's data access interface for testing.
 */

public class MockCustomerDataHttps implements CustomerDataViaHttps {
    private Map<Integer, Customer> customerDatabase;

    public MockCustomerDataHttps() {
        customerDatabase = new HashMap<>();
        customerDatabase.put(1, new Customer(1, "Alice"));
        customerDatabase.put(2, new Customer(2, "Bob"));
    }

    @Override
    public void printCustomer(int customerId) {
        Customer customer = customerDatabase.get(customerId);
        if (customer != null) {
            System.out.println("HTTPS: " + customer);
        } else {
            System.out.println("Customer not found in HTTPS.");
        }
    }

    @Override
    public Customer getCustomerViaHttps(int customerId) {
        return customerDatabase.get(customerId);
    }
}
