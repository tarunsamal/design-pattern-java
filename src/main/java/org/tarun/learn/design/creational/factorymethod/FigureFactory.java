package org.tarun.learn.design.creational.factorymethod;

public abstract class FigureFactory {

    public  Figure getFigure()
    {
        return createFigure();
    }

    protected abstract Figure createFigure();

}

class QuadrilateralFactory extends FigureFactory
{
   @Override
    public Figure createFigure() {
        return new Quadrilateral();
    }
}
class PentagonFactory extends FigureFactory
{

    @Override
    public Figure createFigure() {
        return new Pentagon();
    }
}

class HexagonFactory extends FigureFactory {


    @Override
    public Figure createFigure() {
        return new Hexagon();
    }
}
class TriangleFactory extends FigureFactory
{

    @Override
    public Figure createFigure() {
        return new Triangle();
    }
}
