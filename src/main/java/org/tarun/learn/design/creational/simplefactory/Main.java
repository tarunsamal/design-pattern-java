package org.tarun.learn.design.creational.simplefactory;

public class Main {

    public static void main(String[] args) {
        System.out.println(FigureFactory.getFigure(4).getName());
    }
}
