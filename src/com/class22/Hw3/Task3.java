package com.class22.Hw3;

public class Task3 {

    static void printInfo(String name){
        System.out.println(name);
    }

    static void printInfo(String name, String address){
        System.out.println(name+address);
    }

    static void printInfo(String name, String address, String phoneNum){
        System.out.println(name+address+phoneNum);
    }

    public static void main(String[] args) {
        printInfo("Yanci");
        printInfo("Yanci ", "12345");
        printInfo("Yanci ","12345 ","3012334444");
    }
}
