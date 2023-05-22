package com.gaak;

public class Police extends Person{
    String workCountry;

    public Police (String name, int bornYear, String workCountry) {
        super(name, bornYear);
        this.workCountry = workCountry;
    }

    @Override
    public void introduce () {
        super.introduce();
        System.out.println("Police:: I'm a police and work in " +
                workCountry + ".");
    }
}
