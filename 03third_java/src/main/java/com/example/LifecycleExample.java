package com.example;


// Instantination
// Usage
// Garbage Collection
// Destruction

public class LifecycleExample {
    private int value;
    public LifecycleExample(int value) {
        this.value = value;
    }

    @Override
    protected void finalize() {
        System.out.println("Object destructed");
    }

    public static void main(String[] args) {
        LifecycleExample obj = new LifecycleExample(10);
        obj = null;
        System.gc();
    }
}