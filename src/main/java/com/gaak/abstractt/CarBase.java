package com.gaak.abstractt;

import com.gaak.intf.ICar;
import com.gaak.intf.IJest;

public abstract class CarBase     {
    protected int gear = 0;
    private String color;
    CarBase(int gear){
        this.gear = gear;
    }
//    CarBase(){
//    }
    CarBase(int gear, String color){
        this.gear = gear;
        this.color = color;
    }
     public void engineStart() {
        System.out.println("Stated!");
        printGear();
    }

    abstract public void changeGear(int newGear);

    protected void printGear(){
        System.out.println("Gear::"+gear);
    }

 }
