package org.tarun.learn.design.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        WindowsFactory factory = new WindowsFactory();
        factory.getFileSystem().format(1000L);
        factory.getOS().run("ls -lrt");
    }
}
