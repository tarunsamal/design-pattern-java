package org.tarun.learn.design.creational.abstractfactory;

public class WindowsFactory implements OSFactory{

    @Override
    public OS getOS() {
        return new Windows();
    }

    @Override
    public FileSystem getFileSystem() {
        return new NTFS();
    }
}
