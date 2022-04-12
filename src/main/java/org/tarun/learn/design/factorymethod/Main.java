package org.tarun.learn.design.factorymethod;

public class Main {

    public static void main(String[] args) {
        System.out.println(new HexagonFactory().createFigure().getName());
    }
}
