package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: FlyweightFactory.java
 * Description: This class manages shared ProductFlyweight instances.
 */

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, ProductFlyweight> flyweights = new HashMap<>();

    // Get a shared ProductFlyweight instance
    public ProductFlyweight getProduct(String name, double price) {
        if (!flyweights.containsKey(name)) {
            flyweights.put(name, new ProductFlyweight(name, price));
        }
        return flyweights.get(name);
    }
}

