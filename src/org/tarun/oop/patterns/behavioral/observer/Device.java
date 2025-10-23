package org.tarun.oop.patterns.behavioral.observer;

public interface Device {
    default void updateTemp(int temp) {
        System.out.println(this.getClass().getSimpleName() + " : " + temp);
    }
}
