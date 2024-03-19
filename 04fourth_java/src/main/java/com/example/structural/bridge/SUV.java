package com.example.structural.bridge;

public class SUV implements Car {
    private Engine engine;

    public SUV(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("SUV is driving");
    }

    public void stop() {
        engine.stop();
        System.out.println("SUV stopped");
    }
}
