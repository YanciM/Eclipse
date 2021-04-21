package com.class30.Hw;

public abstract class Insurance {
        String insuranceName;
        abstract  void getQuote();
        abstract void cancelInsurance();

        Insurance(String insuranceName){
            this.insuranceName=insuranceName;
        }
}
class Car extends Insurance{
String carModel;

Car(String insuranceName, String carModel){
    super(insuranceName);
    this.carModel=carModel;
}
    @Override
    void getQuote() {
        System.out.println("What will my car insurance quote be?");
    }

    @Override
    void cancelInsurance() {
        System.out.println("I want to cancel my car insurance.");
    }
}
class Pet extends Insurance{
String petType;

Pet(String insuranceName, String petType){
    super(insuranceName);
    this.petType=petType;
}
    @Override
    void getQuote() {
        System.out.println("What will my pet insurance quote be?");
    }

    @Override
    void cancelInsurance() {
        System.out.println("I want to cancel my pet insurance.");
    }
}
class Health extends Insurance{

    Health(String insuranceName) {
        super(insuranceName);
    }
    @Override
    void getQuote() {
        System.out.println("What will my health insurance quote be?");
    }

    @Override
    void cancelInsurance() {
        System.out.println("I want to cancel my health insurance.");
    }
}