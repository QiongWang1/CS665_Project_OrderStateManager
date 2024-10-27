package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: ReturningCustomerEmailStrategy.java
 * Description: Strategy class for generating email content for returning customers.
 */
public class ReturningCustomerEmailStrategy implements EmailGenerationStrategy {

    @Override
    public String generateEmailContent() {
        return "Thank you for returning! We value your loyalty.";
    }
}
