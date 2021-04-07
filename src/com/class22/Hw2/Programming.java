package com.class22.Hw2;

public class Programming {

    Programming(){     //this is a constructor
        System.out.println("I love programming languages");
    }

    Programming(String value){     //this is a constructor
        System.out.println("I love "+value);
    }

    public static void main(String[] args) {

        new Programming();
        new Programming("Java");

    }


}
