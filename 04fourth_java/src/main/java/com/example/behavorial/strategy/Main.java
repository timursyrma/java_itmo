package com.example.behavorial.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPaymentStrategy("1234567890", "12/23", "019"));
        cart.checkout(100);
    }
}
