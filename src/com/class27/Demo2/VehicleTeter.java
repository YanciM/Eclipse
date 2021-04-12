package com.class27.Demo2;

public class VehicleTeter {

    public static void main(String[] args) {
        BMW bmw=new BMW("1234xml","sedan","BMW","X5");
        bmw.start();
        bmw.stop();
        bmw.speed();
        bmw.drive();
        bmw.display();

        Vehicle vehicle=new Toyota("123456","suv","Toyota","Rav4");
        vehicle.drive();
        vehicle.start();

        Car car=new Toyota("123456","suv","Toyota","Rav4");
        car.speed();

    }
}
