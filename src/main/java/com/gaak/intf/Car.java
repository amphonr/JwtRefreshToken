package com.gaak.intf;

public class Car implements ICar, IJest{
    int gear = 0;

    @Override
    public void engineStart() {
        System.out.println("Stated!");
        printGear();
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
        printGear();
    }

    @Override
    public void turnLeft() {
       gear = gear -1;
        printGear();
    }

    @Override
    public void turnRight() {
        gear = gear+1;
        printGear();
    }

    private void printGear(){
        System.out.println("Gear::"+gear);
    }

    @Override
    public void fly() {
        System.out.println("Fly!!"+IJest.val);
    }
}
