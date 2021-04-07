package com.class23.Recap;

public class Calculator {

    private static void add(){

    }

    private static void add(int number){

    }
/*
    private static void add(int number2){
CE error
    }*/

    public static void main(String[] args) {
        System.out.println("1");
        main("one");  //calls out 2 because main is using a string.. prints out line 23
    }

    public static void main(String args) {
        System.out.println("2");
    }

    public static void main(int args) {
        System.out.println("3");
    }

    public static void main(String[] args,int a) {
        System.out.println("4");
    }
}
