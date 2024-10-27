package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: VipEmailStrategy.java
 * Description: Strategy class for generating email content for VIP customers.
 */
public class VipEmailStrategy implements EmailGenerationStrategy {

    @Override
    public String generateEmailContent() {
        return "Dear VIP customer, thank you for your continued support!";
    }
}
