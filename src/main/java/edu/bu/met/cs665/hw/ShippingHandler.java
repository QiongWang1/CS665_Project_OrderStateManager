package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: ShippingHandler.java
 * Description: Handles shipping of orders in the chain of responsibility.
 */
public class ShippingHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void setNext(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Order order) {
        System.out.println("Order shipped: " + order);
        if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }
}
