package com.example.creational.builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Cake cake = director.construct();
        System.out.println(cake);
    }
}
