package org.tarun.learn.design.structural.adaptor;

public class Client {
    public static void printName(Customer customer)
    {
        for (String name: customer.getFullName().split(" ")) {
            System.out.print(":::" + name);
        }

    }
}
