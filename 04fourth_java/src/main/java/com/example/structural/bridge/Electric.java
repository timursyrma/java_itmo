package com.example.structural.bridge;

public class Electric implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine started");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stopped");
    }
}
