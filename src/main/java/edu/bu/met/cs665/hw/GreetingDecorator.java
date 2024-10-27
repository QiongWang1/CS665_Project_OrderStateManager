package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: GreetingDecorator.java
 * Description: Decorator for adding a personalized greeting to the email content.
 */
public class GreetingDecorator extends EmailContentDecorator {

    public GreetingDecorator(EmailGenerationStrategy strategy) {
        super(strategy);
    }

    @Override
    public String generateEmailContent() {
        return "Dear valued customer, " + super.generateEmailContent();
    }
}
