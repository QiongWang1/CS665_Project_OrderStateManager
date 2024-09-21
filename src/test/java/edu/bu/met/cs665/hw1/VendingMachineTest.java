package edu.bu.met.cs665.hw1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 06/19/1989
 * File Name: VendingMachineTest.java
 * Description: This class tests the VendingMachine functionality.
 */
public class VendingMachineTest {

    private VendingMachine vendingMachine;

    @Before
    public void setUp() {
        // Initialize the vending machine before each test
        vendingMachine = new VendingMachine();
        vendingMachine.init();
    }

    @Test
    public void testVendingMachineInitialization() {
        // Check if the vending machine has been initialized with the correct number of beverages
        assertEquals(6, vendingMachine.getSize());
    }

    @Test
    public void testDisplayMachine() {
        // This test verifies if the displayMachine method can be called without errors
        vendingMachine.displayMachine();
        // You can use assertions here to verify the output if you capture the output stream
        // but typically this method is just used to display information
        assertTrue(true);  // Dummy assertion, assuming displayMachine works
    }
}
