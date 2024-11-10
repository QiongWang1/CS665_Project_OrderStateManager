package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2024
 * File Name: CustomerDataAdapter.java
 * Description: Adapter class to adapt the legacy system interface to the new system interface.
 */

public class CustomerDataAdapter implements CustomerDataViaHttps {
    private CustomerDataViaUsb legacyCustomerData;

    /**
     * Constructor for creating a CustomerDataAdapter object.
     * @param legacyCustomerData The legacy system's data access implementation.
     */
    public CustomerDataAdapter(CustomerDataViaUsb legacyCustomerData) {
        this.legacyCustomerData = legacyCustomerData;
    }

    @Override
    public void printCustomer(int customerId) {
        // Forward the request to the legacy system's print method
        legacyCustomerData.printCustomer(customerId);
    }

    @Override
    public Customer getCustomerViaHttps(int customerId) {
        // Forward the request to the legacy system's getCustomer method
        return legacyCustomerData.getCustomerViaUsb(customerId);
    }
}
