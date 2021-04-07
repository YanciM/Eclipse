package com.class23.Static;

public class Parent {

    static void method1(){
        System.out.println("from parent");
    }
    static void printInfo(String name){
        System.out.println("name from parent "+name);
    }
}

class Child extends Parent{

    /*static void printInfo(String name){
        System.out.println("name from child "+name);
    }*/

    static void method1(){
        System.out.println("from child");

    }

    public static void main(String[] args) {

        Child.printInfo("Yanci");
    }
}
