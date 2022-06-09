package org.tarun.learn.design.creational.objectpool;


import java.awt.geom.Point2D;

public class Bitmap implements Image,Poolable{

    private Point2D location;

    public Bitmap(final String name)
    {
        System.out.println("Image Retrieved" +name);
    }


    @Override
    public void draw() {
        System.out.println("Image Drawn" + location.getX() + "," +location.getY());
    }

    @Override
    public Point2D getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        this.location = null;
        System.out.println("location reset");
    }
}
