package com.example.demo.adapter;

public class StripeAdapter implements PaymentProcessor {

    private ExternalStripeService stripeService;
    private String customerName;

    public StripeAdapter(String customerName) {
        this.stripeService = new ExternalStripeService();
        this.customerName = customerName;
    }

    @Override
    public void pay(double amount) {
        stripeService.makeStripePayment(customerName, amount);
    }
}
