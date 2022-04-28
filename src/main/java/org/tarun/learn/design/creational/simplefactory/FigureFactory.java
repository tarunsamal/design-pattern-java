package org.tarun.learn.design.creational.simplefactory;

public class FigureFactory {

    public static Figure getFigure(int sides)
    {
        switch (sides)
        {
            case 3 : return  new Triangle();
            case 4 : return  new Quadrilateral();
            case 5 : return  new Pentagon();
            case 6 : return  new Hexagon();
            default : throw new IllegalArgumentException();
        }
    }
}
