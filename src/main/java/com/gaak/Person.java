package com.gaak;

public class Person {
    String name;
    int bornYear;

    public Person (String name, int bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }

    public void introduce () {
        System.out.print("Person::My name is " + name + ",");
        System.out.println(" I was born in " + bornYear + ".");
    }
}
