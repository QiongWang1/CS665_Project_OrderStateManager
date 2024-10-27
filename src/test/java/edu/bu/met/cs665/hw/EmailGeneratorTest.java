package edu.bu.met.cs665.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: EmailGeneratorTest.java
 * Description: Unit tests for generating emails with different strategies and decorators.
 */
public class EmailGeneratorTest {

    @Test
    public void testVipCustomerWithGreetingAndDiscount() {
        // Test VIP customer with Greeting and Discount decorators
        EmailGenerationStrategy vipStrategy = new VipEmailStrategy();
        vipStrategy = new GreetingDecorator(vipStrategy);
        vipStrategy = new DiscountDecorator(vipStrategy);

        Customer vipCustomer = new Customer(vipStrategy);
        String expected = "Dear valued customer, Dear VIP customer, thank you for your continued support! Enjoy an exclusive discount on your next purchase!";
        assertEquals(expected, vipCustomer.generateEmail());
    }

    @Test
    public void testNewCustomerWithGreeting() {
        // Test New Customer with Greeting decorator only
        EmailGenerationStrategy newCustomerStrategy = new NewCustomerEmailStrategy();
        newCustomerStrategy = new GreetingDecorator(newCustomerStrategy);

        Customer newCustomer = new Customer(newCustomerStrategy);
        String expected = "Dear valued customer, Welcome! We are excited to have you with us.";
        assertEquals(expected, newCustomer.generateEmail());
    }

    @Test
    public void testReturningCustomerWithDiscount() {
        // Test Returning Customer with Discount decorator only
        EmailGenerationStrategy returningStrategy = new ReturningCustomerEmailStrategy();
        returningStrategy = new DiscountDecorator(returningStrategy);

        Customer returningCustomer = new Customer(returningStrategy);
        String expected = "Thank you for returning! We value your loyalty. Enjoy an exclusive discount on your next purchase!";
        assertEquals(expected, returningCustomer.generateEmail());
    }

    @Test
    public void testPlainVipCustomerEmail() {
        // Test VIP customer without any decorator
        EmailGenerationStrategy vipStrategy = new VipEmailStrategy();
        Customer vipCustomer = new Customer(vipStrategy);
        String expected = "Dear VIP customer, thank you for your continued support!";
        assertEquals(expected, vipCustomer.generateEmail());
    }
}
