package com.gaak;

public class Sheriff extends Person{
    String workState;

    public Sheriff (String name, int bornYear, String workState) {
        super(name, bornYear);
        this.workState = workState;
    }

    public Sheriff (String name, int bornYear) {
        super(name, bornYear);
        /// this.workState = workState;
    }

    @Override
    public void introduce () {
        // super.introduce();
        System.out.println("Sheriff::I'm a sheriff and work in " +
                workState + ".");
    }
}
