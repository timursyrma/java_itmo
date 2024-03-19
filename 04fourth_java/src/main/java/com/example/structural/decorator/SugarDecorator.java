package com.example.structural.decorator;

public class SugarDecorator implements Beverage {
    private Beverage beverage;

    public SugarDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
