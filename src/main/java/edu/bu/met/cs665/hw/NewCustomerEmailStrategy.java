package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: NewCustomerEmailStrategy.java
 * Description: Strategy class for generating welcome email content for new customers.
 */
public class NewCustomerEmailStrategy implements EmailGenerationStrategy {

    @Override
    public String generateEmailContent() {
        return "Welcome! We are excited to have you with us.";
    }
}
