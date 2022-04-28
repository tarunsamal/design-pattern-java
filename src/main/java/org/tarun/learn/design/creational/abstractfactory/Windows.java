package org.tarun.learn.design.creational.abstractfactory;

public class Windows implements OS{

    @Override
    public void run(String command) {
        System.out.println("Command Prompt : >"+command);
    }
}
