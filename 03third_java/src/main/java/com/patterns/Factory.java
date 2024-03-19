package com.patterns;

public interface Factory {
    Product createProduct();
}

class FactoryA implements Factory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}

class FactoryB implements Factory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}

class FactoryMethodExample {
    FactoryA factoryA = new FactoryA();
    FactoryB factoryB = new FactoryB();
    Config cfg = read from file;

    if (cfg.delivery == "car") {

    } ()
    Product productA = factoryA.createProduct();
}
