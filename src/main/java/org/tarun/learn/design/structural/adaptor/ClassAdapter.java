package org.tarun.learn.design.structural.adaptor;

public class ClassAdapter extends Employee implements Customer{

    public ClassAdapter(String name) {
        super(name);
    }

    @Override
    public String getFullName() {
        return this.getName();
    }
}
