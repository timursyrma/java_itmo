package com.example;

public class Example {
    String str;
    int id;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((str == null) ? 0 : str.hashCode());
        return result;
    }
}
