package org.tarun.learn.design.creational.prototype;


public class NormalEmployee extends Employee{
    @Override
    protected NormalEmployee clone() throws CloneNotSupportedException {
        NormalEmployee normalEmployee = (NormalEmployee)super.clone();
        normalEmployee.init();

        normalEmployee.reset();
        return normalEmployee;
    }

    @Override
    protected void init() {
        this.type="NE";
    }

    @Override
    protected void reset() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.id = Long.toString(System.currentTimeMillis());
    }

}
