package org.tarun.learn.design.creational.objectpool;

import lombok.Getter;
import lombok.Setter;

import java.awt.geom.Point2D;

public interface Image {

    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);

}
