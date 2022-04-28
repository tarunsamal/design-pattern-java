package org.tarun.learn.design.creational.singleton.lazy;

public class Product {

    private Product(){}

    private static volatile Product INSTANCE;

    public synchronized static final Product getInstance(){
        if(null == INSTANCE)
        {
            INSTANCE = new Product();
        }
        return INSTANCE;
    }
}
