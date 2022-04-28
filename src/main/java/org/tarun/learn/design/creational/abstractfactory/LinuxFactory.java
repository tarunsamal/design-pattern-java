package org.tarun.learn.design.creational.abstractfactory;

public class LinuxFactory implements OSFactory{
    @Override
    public OS getOS() {
        return new Linux();
    }

    @Override
    public FileSystem getFileSystem() {
        return new EXT3();
    }
}
