package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: EmailGenerationStrategy.java
 * Description: Interface for defining the email content generation strategy for different customer types.
 */
public interface EmailGenerationStrategy {
    /**
     * Generates email content for a specific customer type.
     * @return the generated email content as a String
     */
    String generateEmailContent();
}
