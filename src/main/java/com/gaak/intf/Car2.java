package com.gaak.intf;

public class Car2 implements ICar{
    int gear = 0;

    @Override
    public void engineStart() {
        System.out.println("Car2 Stated!");
        printGear();
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
        printGear();
    }

    @Override
    public void turnLeft() {
        if(gear!=0){
            gear = gear -1;
        }
        printGear();
    }

    @Override
    public void turnRight() {
        gear = gear+3;
        printGear();
    }

    private void printGear(){
        System.out.println("Gear::"+gear);
    }


    @Override
    public void fly() {

    }
}
