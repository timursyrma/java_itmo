package com.example.creational.builder;

public class ConcreteBuilder implements Builder {
    private Cake cake;

    public ConcreteBuilder() {
        this.cake = new Cake();
    }
    @Override
    public void buildPart1() {
        cake.setPart1("Part1");
    }

    @Override
    public void buildPart2() {
        cake.setPart2("Part2");
    }

    @Override
    public void buildPart3() {
        cake.setPart3("Part3");
    }

    @Override
    public Cake getResult() {
        return cake;
    }
}
