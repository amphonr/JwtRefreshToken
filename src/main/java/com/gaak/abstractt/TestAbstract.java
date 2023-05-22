package com.gaak.abstractt;

public class TestAbstract {

    public static void main(String[] arg){
        CarBase carBase = new  CarUse();
        carBase.engineStart();
        carBase.changeGear(2);
        carBase.printGear();
     }
}
