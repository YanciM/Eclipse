package com.class22.Hw4;

public class Sample {

    private void printInfo(String name){
        System.out.println(name);
    }

    private void printInfo(String name, String address){
        System.out.println(name+address);
    }

    private void printInfo(String name, String address, String phoneNum){
        System.out.println(name+address+phoneNum);
    }

    public static void main(String[] args) {

        Sample obj=new Sample();
        obj.printInfo("Yanci");
        obj.printInfo("Yanci ", "12345");
        obj.printInfo("Yanci ","12345 ","3012334444");
    }
}
