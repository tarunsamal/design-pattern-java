package org.tarun.learn.design.structural.adaptor;

public class ObjectAdapter implements Customer{

    Employee employee;

    ObjectAdapter(Employee employee)
    {
        this.employee =employee;
    }

    @Override
    public String getFullName() {
        return employee.getName();
    }
}
