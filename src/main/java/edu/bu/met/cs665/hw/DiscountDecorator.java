package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: DiscountDecorator.java
 * Description: Decorator for adding discount information to the email content.
 */
public class DiscountDecorator extends EmailContentDecorator {

    public DiscountDecorator(EmailGenerationStrategy strategy) {
        super(strategy);
    }

    @Override
    public String generateEmailContent() {
        return super.generateEmailContent() + " Enjoy an exclusive discount on your next purchase!";
    }
}
