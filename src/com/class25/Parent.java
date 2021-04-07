package com.class25;

public class Parent {

    final void method1(){
        System.out.println("No child is allowed to change me");
    }

    final void method1(String name){
        System.out.println("No child is allowed to change me"); // can overload, but not override
    }
}
class child extends Parent{

    /*@Override
    void method1() {
        System.out.println("From child class");
    }*/
}