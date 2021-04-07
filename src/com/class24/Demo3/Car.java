package com.class24.Demo3;

public class Car {

    String make;
    String model;

    void start(){
        System.out.println("Use the key to start me");
    }

    void stop(){
        System.out.println("Use the break to stop me");
    }

    void park(){
        System.out.println("Park me manually");
    }

}
class BMW extends Car{
    void start(){
        System.out.println("Use the button to start me");
    }
    void drifting(){
        System.out.println("I can drift really good in rain");
    }
}

class Tesla extends Car {
    void start(){
        System.out.println("Use app to start me");
    }
    void park(){
        System.out.println("Park me using sensor camera");
    }
}

class Toyota extends Car{

}
