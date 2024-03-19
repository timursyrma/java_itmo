package com.example.creational.abstract_factory;

// Creational Patterns +
// Structural Patterns
// Behavioral Patterns

import com.example.creational.abstract_factory.factories.FurnitureFactory;
import com.example.creational.abstract_factory.factories.ModernFurnitureFactory;
import com.example.creational.abstract_factory.factories.VintageFurnitureFactory;
import com.example.creational.abstract_factory.furniture.Chair;
import com.example.creational.abstract_factory.furniture.Table;

// Factory Method ->
public class Main {

    public static void clientCode(FurnitureFactory factory) {
        Chair chair = factory.createChair();
        Table table = factory.createTable();
        System.out.println("Chair: " + chair.getName());
        System.out.println("Table: " + table.getName());
    }

    public static void main(String[] args) {
        System.out.println("Client: Testing Modern furniture factory...");
        clientCode(new ModernFurnitureFactory());


        System.out.println("Client: Testing Vintage furniture factory...");
        clientCode(new VintageFurnitureFactory());
    }
}