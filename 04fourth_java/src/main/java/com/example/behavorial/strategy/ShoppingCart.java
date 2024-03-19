package com.example.behavorial.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        // TODO
        if (paymentStrategy == null) {
            throw new RuntimeException("Strategy hadn't been initialized");
        }
        paymentStrategy.pay(amount);
    }
}
