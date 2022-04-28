package org.tarun.learn.design.creational.factorymethod;

public abstract class Figure {

    abstract String getName();

}

class Quadrilateral extends Figure
{
 @Override
    String getName() {
        return this.getClass().getSimpleName();
    }

}
class Pentagon extends Figure
{

    @Override
    String getName() {
        return this.getClass().getSimpleName();
    }
}

class Hexagon extends Figure {

    @Override
    String getName() {
        return this.getClass().getSimpleName();
    }

}
class Triangle extends Figure
{

    @Override
    String getName() {
        return this.getClass().getSimpleName();
    }
}
