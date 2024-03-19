package com.example.creational.abstract_factory.factories;

import com.example.creational.abstract_factory.furniture.Chair;
import com.example.creational.abstract_factory.furniture.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}
