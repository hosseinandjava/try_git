package com.ameri.hossein;

public class Person {

    private String name;
    private String lastName;

    public Person(String name, String lastName) {

        this.name = name;
        this.lastName = lastName;

    }

    public void setName(String name){

   this.name = name;

    }

    public void setlastName(String lastName){

        this.lastName = lastName;
    }

        
    @Override
    public String toString() {

        return name + " " + lastName;
    }

}
