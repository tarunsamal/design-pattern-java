package org.tarun.learn.design.creational.abstractfactory;

public class Linux implements OS{

    @Override
    public void run(String command) {
        System.out.println("Terminal : #"+command);
    }
}
