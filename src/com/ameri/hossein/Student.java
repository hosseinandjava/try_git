package com.ameri.hossein;

public class Student {

    private String name;
    private String lastName;

    public Student() {

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + lastName;

    }

}
