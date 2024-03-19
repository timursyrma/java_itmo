package com.example.creational.abstract_factory.factories;

import com.example.creational.abstract_factory.furniture.Chair;
import com.example.creational.abstract_factory.furniture.ModernChair;
import com.example.creational.abstract_factory.furniture.ModernTable;
import com.example.creational.abstract_factory.furniture.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();    }
}
