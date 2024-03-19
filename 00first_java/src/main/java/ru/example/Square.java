package ru.example;

public class Square implements Shape {

    int side;
    Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int get_area() {
        return side * side;
    }

    @Override
    public int get_perimeter() {
        return 4 * side;
    }
}
