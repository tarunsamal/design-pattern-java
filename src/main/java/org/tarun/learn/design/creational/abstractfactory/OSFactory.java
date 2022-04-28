package org.tarun.learn.design.creational.abstractfactory;


public interface OSFactory {
    OS getOS();
    FileSystem getFileSystem();
}
