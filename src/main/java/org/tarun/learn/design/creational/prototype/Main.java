package org.tarun.learn.design.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        NormalEmployee template = new NormalEmployee();
        NormalEmployee emp2 = template.clone();
        NormalEmployee emp3 = template.clone();
        System.out.println("emp1" + template);
        System.out.println("emp2" + emp2);
        System.out.println("emp3" + emp3);
    }
}
