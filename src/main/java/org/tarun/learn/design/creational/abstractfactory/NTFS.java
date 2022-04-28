package org.tarun.learn.design.creational.abstractfactory;

public class NTFS implements FileSystem{

    @Override
    public void format(Long gb) {
        System.out.println("Formatted NTFS GB:" +gb);
    }
}
