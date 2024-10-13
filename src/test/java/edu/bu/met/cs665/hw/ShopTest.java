package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: ShopTest.java
 * Description: JUnit test for Shop and Driver functionality.
 */

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class ShopTest {
    private Shop shop;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        shop = new Shop("Shop A");

        // Capture output stream for verification
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testAddDriver() {
        Driver driver1 = new Driver("Driver 1");
        shop.addDriver(driver1);
        assertTrue(shop.getDrivers().contains(driver1));
    }

    @Test
    public void testCreateDeliveryRequest() {
        // Create and register drivers
        Driver driver1 = new Driver("Driver 1");
        Driver driver2 = new Driver("Driver 2");
        shop.addDriver(driver1);
        shop.addDriver(driver2);

        // Create delivery request and notify drivers
        shop.createDeliveryRequest("Books", "123 Main St");

        // Verify that all drivers received the request
        String output = outputStream.toString();
        assertTrue(output.contains("Driver 1 received request to deliver Books to 123 Main St"));
        assertTrue(output.contains("Driver 2 received request to deliver Books to 123 Main St"));
    }

    @Test
    public void testNoDriversRegistered() {
        // Create delivery request without any drivers registered
        shop.createDeliveryRequest("Books", "123 Main St");

        // Verify that no notification was sent (no output)
        String output = outputStream.toString();
        assertEquals("", output);
    }
}
