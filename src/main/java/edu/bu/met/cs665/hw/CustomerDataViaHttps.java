package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2024
 * File Name: CustomerDataViaHttps.java
 * Description: Interface for accessing customer data via HTTPS in the new system.
 */

public interface CustomerDataViaHttps {
    /**
     * Prints customer information based on customer ID.
     * @param customerId The ID of the customer to print.
     */
    void printCustomer(int customerId);

    /**
     * Retrieves customer information via HTTPS based on customer ID.
     * @param customerId The ID of the customer to retrieve.
     * @return The customer data for the given ID.
     */
    Customer getCustomerViaHttps(int customerId);
}
