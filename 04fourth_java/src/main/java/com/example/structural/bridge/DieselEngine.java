package com.example.structural.bridge;

public class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("DieselEngine engine started");
    }

    @Override
    public void stop() {
        System.out.println("DieselEngine engine stopped");
    }
}
