package com.class25.Casting;

import java.util.concurrent.Callable;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();
        animal.sleep();
        //animal.speake(); no place to hold

        Cat cat=(Cat)animal; //convert back to child class to print child method
        cat.speak();
    }
}
