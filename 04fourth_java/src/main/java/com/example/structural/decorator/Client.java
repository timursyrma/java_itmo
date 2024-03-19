package com.example.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println("Order: " + espresso.getDescription() + ", Cost: $" + espresso.cost());

        Beverage espressoWithSugar = new SugarDecorator(espresso);
        System.out.println("Order: " + espressoWithSugar.getDescription() + ", Cost: $" + espressoWithSugar.cost());
    }
}
