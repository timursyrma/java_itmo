package com.example;

public class MyClass implements Comparable<MyClass>{
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(MyClass o) {
        return Integer.compare(this.value, o.value);
    }
}
