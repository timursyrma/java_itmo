package com.example.creational.lazy_init;

// Singleton
public class Singleton {
    private volatile Object instance;

    public Object getInstance() {
        if (instance == null) {
            synchronized (this) {
                if (instance == null) {
                    instance = createInstance();
                }
            }
        }

        return instance;
    }


    private Object createInstance() {
        return new Object();
    }

}
