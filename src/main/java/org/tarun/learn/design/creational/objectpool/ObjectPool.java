package org.tarun.learn.design.creational.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool <T extends Poolable>
{
    public BlockingQueue<T> availQueue;

    public ObjectPool(Supplier<T> supplier, int count)
    {
        availQueue = new LinkedBlockingQueue<T>();
        for (int i = 0; i < count ; i++) {
            System.out.println(availQueue.offer(supplier.get()));
        }
    }

    public T get()
    {
        try {
            return availQueue.take();
        } catch (InterruptedException e) {
            System.err.println("take() interrupted");
        }
        return null;
    }

    public void release(T t)
    {
        t.reset();
        try {
            availQueue.put(t);
        } catch (InterruptedException e) {
            System.err.println("put() interrupted");
        }
    }
}
