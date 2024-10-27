package edu.bu.met.cs665.hw;

/**
 * Name: Qiong Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/26/2024
 * File Name: EmailGeneratorApplication.java
 * Description: Main application to demonstrate the use of strategies and decorators for email generation.
 */
public class EmailGeneratorApplication {

    public static void main(String[] args) {
        // Create VIP customer email with Greeting and Discount decorators
        EmailGenerationStrategy vipStrategy = new VipEmailStrategy();
        vipStrategy = new GreetingDecorator(vipStrategy);
        vipStrategy = new DiscountDecorator(vipStrategy);

        Customer vipCustomer = new Customer(vipStrategy);
        System.out.println(vipCustomer.generateEmail());

        // Create New Customer email with Greeting decorator only
        EmailGenerationStrategy newCustomerStrategy = new NewCustomerEmailStrategy();
        newCustomerStrategy = new GreetingDecorator(newCustomerStrategy);

        Customer newCustomer = new Customer(newCustomerStrategy);
        System.out.println(newCustomer.generateEmail());
    }
}
