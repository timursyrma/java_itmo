package com.example.creational.builder;

public class Cake {
    String part1;
    String part2;
    String part3;

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public void setPart3(String part3) {
        this.part3 = part3;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3='" + part3 + '\'' +
                '}';
    }
}
