package org.tarun.learn.design.creational;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .withFirstName("Tarun")
                .withLastName("Samal")
                .build();
        System.out.print(person);
    }
}
