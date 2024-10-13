package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: DeliveryTest.java
 * Description: This is a test class that simulates the interaction between a shop and drivers.
 */

public class DeliveryTest {
    public static void main(String[] args) {
        // Create a shop
        Shop shop = new Shop("Shop A");

        // Create 5 drivers and register them
        Driver driver1 = new Driver("Driver 1");
        Driver driver2 = new Driver("Driver 2");
        Driver driver3 = new Driver("Driver 3");
        Driver driver4 = new Driver("Driver 4");
        Driver driver5 = new Driver("Driver 5");

        shop.addDriver(driver1);
        shop.addDriver(driver2);
        shop.addDriver(driver3);
        shop.addDriver(driver4);
        shop.addDriver(driver5);

        // Create a delivery request and notify all drivers
        shop.createDeliveryRequest("Books", "123 Main St");
    }
}
