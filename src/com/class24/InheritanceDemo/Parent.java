package com.class24.InheritanceDemo;

public class Parent {

    String name;

    void printInfo(){
        System.out.println(name);
    }
}
class Child extends Parent{
    void printInfo(){
        System.out.println("Print info from child"+name);
    }
}