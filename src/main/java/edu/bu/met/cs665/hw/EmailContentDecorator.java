package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: EmailContentDecorator.java
 * Description: Abstract decorator class for adding additional content to the email.
 */
public abstract class EmailContentDecorator implements EmailGenerationStrategy {
    protected EmailGenerationStrategy strategy;

    public EmailContentDecorator(EmailGenerationStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String generateEmailContent() {
        return strategy.generateEmailContent();
    }
}
