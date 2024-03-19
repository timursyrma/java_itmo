package com.example.behavorial.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    private String expiraionDate;
    private String cvv;

    public CreditCardPaymentStrategy(String cardNumber, String expiraionDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiraionDate = expiraionDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using credit card.");
    }
}
