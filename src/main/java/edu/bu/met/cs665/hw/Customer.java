package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: Customer.java
 * Description: Customer class that holds an email generation strategy to create personalized email content.
 */
public class Customer {
    private EmailGenerationStrategy emailStrategy;

    /**
     * Constructor to set the email generation strategy for the customer.
     * @param emailStrategy the strategy to generate email content
     */
    public Customer(EmailGenerationStrategy emailStrategy) {
        this.emailStrategy = emailStrategy;
    }

    /**
     * Generates an email based on the current strategy and any applied decorators.
     * @return the generated email content as a String
     */
    public String generateEmail() {
        return emailStrategy.generateEmailContent();
    }
}

