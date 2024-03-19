package com.example.structural.bridge;

public class Sedan implements Car {
    private Engine engine;

    public Sedan(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Sedan is driving");
    }

    public void stop() {
        engine.stop();
        System.out.println("Sedan stopped");
    }
}
