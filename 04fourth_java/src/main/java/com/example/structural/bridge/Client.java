package com.example.structural.bridge;

public class Client {
    public static void main(String[] args) {
        Car sedanGasoline = new Sedan(new GasEngine());
        Car suvDiesel = new SUV(new DieselEngine());

        sedanGasoline.drive();
        sedanGasoline.stop();

        suvDiesel.drive();
        suvDiesel.stop();
    }
}
