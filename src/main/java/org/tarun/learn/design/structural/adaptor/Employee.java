package org.tarun.learn.design.structural.adaptor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


public class Employee {
    public Employee(String name) {
        this.name = name;
    }

    public Employee() {
    }

    private String name;

    public String getName()
    {
        return this.name;
    }
}
