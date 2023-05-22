package com.gaak.abstractt;

public class CarUse extends CarBase{
    CarUse() {
        super(1,"red");
    }
    CarUse(int arg) {
        super(arg);
    }

    @Override
    public void changeGear(int newGear) {
        super.gear = newGear;
    }
}
