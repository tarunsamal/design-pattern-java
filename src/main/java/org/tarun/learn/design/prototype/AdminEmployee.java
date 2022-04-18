package org.tarun.learn.design.prototype;


public class AdminEmployee extends Employee{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("AdminEmployee can not be cloned");
    }

    @Override
    protected void init() {
        this.id = Long.toString(System.currentTimeMillis());
    }

    @Override
    protected void reset()
    {
        throw new UnsupportedOperationException("Can not reset an Admin");
    }

}
