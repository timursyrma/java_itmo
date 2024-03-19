package com.example.creational.builder;

public interface Builder {
    void buildPart1();
    void buildPart2();
    void buildPart3();
    Cake getResult();
}
