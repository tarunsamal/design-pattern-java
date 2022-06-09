package org.tarun.learn.design.creational.objectpool;

import java.awt.*;

public class Main {
    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(()->new Bitmap("test.img"),5);
    public static void main(String[] args) {

        Bitmap bitmap1 = bitmapPool.get();
        Bitmap bitmap2 = bitmapPool.get();

        bitmap1.setLocation(new Point(10,20));
        bitmap2.setLocation(new Point(-10,-20));

        bitmap1.draw();
        bitmap2.draw();

        bitmapPool.release(bitmap1);
        bitmapPool.release(bitmap2);
    }
}
