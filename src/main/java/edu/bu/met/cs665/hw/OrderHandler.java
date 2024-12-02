package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 12/02/2024
 * File Name: OrderHandler.java
 * Description: Defines an interface for processing orders in the chain of responsibility.
 */
public interface OrderHandler {
    void setNext(OrderHandler nextHandler); // Set the next handler in the chain
    void handle(Order order); // Process the order
}
