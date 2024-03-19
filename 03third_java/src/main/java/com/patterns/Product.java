package com.patterns;

public interface Product {
    void operate();
}

class ProductA implements Product {

    @Override
    public void operate() {
        System.out.println("Operating ProductA");
    }
}

class ProductB implements Product {

    @Override
    public void operate() {
        System.out.println("Operating ProductB");
    }
}
