package com.example.creational.abstract_factory.factories;

import com.example.creational.abstract_factory.furniture.Chair;
import com.example.creational.abstract_factory.furniture.Table;
import com.example.creational.abstract_factory.furniture.VintageChair;
import com.example.creational.abstract_factory.furniture.VintageTable;

public class VintageFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VintageChair();
    }

    @Override
    public Table createTable() {
        return new VintageTable();
    }
}
