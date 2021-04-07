package com.class24.Demo3;

public class CarTester {

    public static void main(String[] args) {

        Car car1=new BMW();
        car1.start();  //method from child will be called because we have over written it
        car1.stop();  //method from parent will be called because we have not over written it
       // bmw.drifting(); CE not allowed by using parent references

        BMW bmw1=(BMW)car1; //since we have converted our reference back to BMW
        bmw1.drifting();

        Car car=new Tesla();
        BMW bmw2=(BMW)car;

    }
}
