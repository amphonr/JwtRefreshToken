package com.gaak.intf;

public interface ICar extends IJest {
    public void engineStart();
    public void changeGear(int newGear);
    public void turnLeft();
    public void turnRight();
}
