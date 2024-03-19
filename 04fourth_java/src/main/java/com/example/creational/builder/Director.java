package com.example.creational.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Cake construct() {
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
        return builder.getResult();
    }
}
