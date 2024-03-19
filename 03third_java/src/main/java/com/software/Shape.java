package com.software;

public abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {

    @Override
    public void draw() {
        // print circle
    }
}

class Square extends Shape {

    @Override
    public void draw() {
        // print square
    }
}