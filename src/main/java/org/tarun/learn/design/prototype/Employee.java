package org.tarun.learn.design.prototype;

public abstract class Employee implements Cloneable{

    protected String type ="E";

    protected String id ="00000";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    abstract protected void init();

    abstract protected void reset();
}
