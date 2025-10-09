package com.example.demo.adapter;

public class ExternalStripeService {
    public void makeStripePayment(String customer, double amount) {
        System.out.println("✅ Stripe: processed payment of $" + amount + " for " + customer);
    }
}
