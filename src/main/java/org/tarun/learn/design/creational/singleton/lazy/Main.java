package org.tarun.learn.design.creational.singleton.lazy;

public class Main {
    public static void main(String[] args) {
        Product product1 = Product.getInstance();
        Product product2 = Product.getInstance();
        System.out.println("Product1 == Product2 :" + (product1 == product2));
    }
}
