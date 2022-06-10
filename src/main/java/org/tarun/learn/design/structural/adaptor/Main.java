package org.tarun.learn.design.structural.adaptor;

public class Main {

    public static void main(String[] args) {
        Client.printName(new ClassAdapter("Benu Gopal Iyer"));
        System.out.println();
        System.out.println("*******************************************");
        ObjectAdapter objectAdapter = new ObjectAdapter(new Employee("Benu Gopal Iyer"));
        Client.printName(objectAdapter);
    }
}
