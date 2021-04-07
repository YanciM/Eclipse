package com.class22.SuperKeywordDemo2;

public class Animal {

    String name;
    String age;
    String color;



    public Animal(String name, String age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("Parameterized parent");

    }

    public Animal(){
        System.out.println("Parent");
    }
}
