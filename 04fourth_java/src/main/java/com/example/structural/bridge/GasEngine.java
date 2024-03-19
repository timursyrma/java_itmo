package com.example.structural.bridge;

public class GasEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Gasoline engine started");
    }

    @Override
    public void stop() {
        System.out.println("Gasoline engine stopped");
    }
}
