package com.class25;

public class StaticOverRiding {

    static void printInfo(){
        System.out.println("Blah blah");
    }
}

class Child extends StaticOverRiding{

    /*void printInfo(){
        System.out.println("Blah blah from child class");
    }*/
}
