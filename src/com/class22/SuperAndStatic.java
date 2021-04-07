package com.class22;

public class SuperAndStatic {

    String color;

    static void printInfo(){

    }

    public static void main(String[] args) {

        SuperAndStatic superAndStatic=new SuperAndStatic();
        superAndStatic.color="Red";
        SuperAndStatic superAndStatic1=new SuperAndStatic();
        superAndStatic.color="White";
        SuperAndStatic superAndStatic2=new SuperAndStatic();
        superAndStatic.color="Black";
        SuperAndStatic.printInfo();
    }
}

class Parent{
    String color;
}
