package com.gaak.intf;

public class TestIntf {
    public static void main(String[] arg) {
         proce("car");
         proce("car2");
    }

    public static void proce(String carType){
        ICar car = null;
        if("car".equals(carType)){
            car = new Car();
        }
        if ("car2".equals(carType)){
            car = new Car2();
        }
        car.engineStart();
        car.turnLeft();
        car.turnRight();
        car.turnRight();
        car.fly();
    }
}
