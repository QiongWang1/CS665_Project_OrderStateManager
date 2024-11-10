package edu.bu.met.cs665.hw;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2024
 * File Name: CustomerDataAdapterTest.java
 * Description: Unit test for the CustomerDataAdapter to ensure correct functionality of the adapter pattern.
 */

public class CustomerDataAdapterTest {

    private CustomerDataViaHttps customerDataAdapter;
    private MockCustomerDataUsb mockCustomerDataUsb;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    /**
     * Sets up the test environment by initializing the adapter and mock data.
     */
    @Before
    public void setUp() {
        mockCustomerDataUsb = new MockCustomerDataUsb();
        customerDataAdapter = new CustomerDataAdapter(mockCustomerDataUsb);
        // Capture console output for printCustomer test
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Test to verify that the adapter correctly retrieves customer data.
     */
    @Test
    public void testGetCustomerViaHttps() {
        Customer customer = customerDataAdapter.getCustomerViaHttps(1);
        assertNotNull("Customer should not be null", customer);
        assertEquals("Customer ID should be 1", 1, customer.getCustomerId());
        assertEquals("Customer name should be Alice", "Alice", customer.getName());
    }

    /**
     * Test to verify that the adapter correctly prints customer data.
     */
    @Test
    public void testPrintCustomer() {
        // Capture the output of the printCustomer method
        customerDataAdapter.printCustomer(2);
        // Compare the actual output after trimming any trailing whitespace and newlines
        assertEquals("USB System: Customer ID: 2, Name: Bob", outputStreamCaptor.toString().trim());
    }


    /**
     * Test to verify that the adapter handles non-existent customer IDs.
     */
    @Test
    public void testGetNonExistentCustomer() {
        Customer customer = customerDataAdapter.getCustomerViaHttps(999);
        assertNull("Customer should be null for non-existent ID", customer);
    }

    /**
     * Test to verify that the adapter does not modify the original mock data.
     */
    @Test
    public void testAdapterDoesNotModifyMockData() {
        Customer customerBefore = mockCustomerDataUsb.getCustomerViaUsb(1);
        customerDataAdapter.getCustomerViaHttps(1);
        Customer customerAfter = mockCustomerDataUsb.getCustomerViaUsb(1);
        assertEquals("Customer data should remain the same", customerBefore, customerAfter);
    }

    /**
     * Test to verify handling of invalid customer ID (e.g., negative ID).
     */
    @Test
    public void testInvalidCustomerId() {
        Customer customer = customerDataAdapter.getCustomerViaHttps(-1);
        assertNull("Customer should be null for invalid ID", customer);
    }
}
