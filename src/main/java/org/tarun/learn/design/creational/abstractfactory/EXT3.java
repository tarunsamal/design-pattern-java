package org.tarun.learn.design.creational.abstractfactory;

public class EXT3 implements FileSystem {
    @Override
    public void format(Long gb) {
        System.out.println("Formatted EXT3 GB:" +gb);
    }
}
