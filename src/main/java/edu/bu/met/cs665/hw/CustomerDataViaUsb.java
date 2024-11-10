package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2024
 * File Name: CustomerDataViaUsb.java
 * Description: Interface for accessing customer data via USB in the legacy system.
 */

public interface CustomerDataViaUsb {
    /**
     * Prints customer information based on customer ID.
     * @param customerId The ID of the customer to print.
     */
    void printCustomer(int customerId);

    /**
     * Retrieves customer information via USB based on customer ID.
     * @param customerId The ID of the customer to retrieve.
     * @return The customer data for the given ID.
     */
    Customer getCustomerViaUsb(int customerId);
}

