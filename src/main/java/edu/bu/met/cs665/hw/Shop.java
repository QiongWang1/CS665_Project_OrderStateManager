package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/13/2024
 * File Name: Shop.java
 * Description: This class represents a shop that creates delivery requests and notifies registered drivers.
 */

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private List<Driver> drivers = new ArrayList<>();

    public Shop(String name) {
        this.name = name;
    }

    // Register a driver
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    // Create a delivery request and notify drivers
    public void createDeliveryRequest(String product, String destination) {
        DeliveryRequest request = new DeliveryRequest(product, destination);
        notifyDrivers(request);
    }

    // Notify all registered drivers
    private void notifyDrivers(DeliveryRequest request) {
        for (Driver driver : drivers) {
            driver.notify(request);
        }
    }

    // Add this method to return the list of drivers
    public List<Driver> getDrivers() {
        return drivers;
    }
}
