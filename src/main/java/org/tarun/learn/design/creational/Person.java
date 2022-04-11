package org.tarun.learn.design.creational;

import org.apache.commons.lang3.StringUtils;


public class Person {

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    private  String name;

    private String id;

    private Person(String name ,String id) {
        this.name = name;
        this.id =id;
    }

    public PersonBuilder getPersonBuilder()
    {
        return new PersonBuilder();
    }

    public static class PersonBuilder {

        private  String firstName;

        private String lastName;

        private String id;

        public PersonBuilder withFirstName(String firstName){
            this.firstName=firstName;
            return this;
        }

        public PersonBuilder withLastName(String lastName){
            this.lastName=lastName;
            return this;
        }

        public PersonBuilder withId(String id){
            this.id = id;
            return this;
        }

        public Person build()
        {
            if(StringUtils.isBlank(id))
            {
                this.id = Long.toString(System.currentTimeMillis());
            }
            return new Person(firstName.toUpperCase() +StringUtils.SPACE + lastName.toUpperCase(),id);
        }

    }
}
