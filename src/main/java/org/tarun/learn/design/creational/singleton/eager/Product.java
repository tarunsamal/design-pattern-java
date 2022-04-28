package org.tarun.learn.design.creational.singleton.eager;

public class Product {

    private Product(){}

    private static final Product INSTANCE = new Product();

    public static final Product getInstance(){
        return INSTANCE;
    }
}
