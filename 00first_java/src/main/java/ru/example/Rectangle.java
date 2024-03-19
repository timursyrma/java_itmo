package ru.example;

public class Rectangle implements Shape, Shape2 {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int get_area() {
        return width * height;
    }

    @Override
    public int get_perimeter() {
        return 2 * width + 2 * height ;
    }
}
