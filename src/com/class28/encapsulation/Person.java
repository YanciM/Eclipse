package com.class28.encapsulation;

public class Person {
    private String name;
    private String bankAccountNum;
    private String address;
    private String ssn;

    void setName(String name) {
        if (name.length() < 15) {
            if (name.matches("^[a-zA-Z]*$")) {
                this.name = name;


            } else {
                System.out.println("Only chapters are allowed");
            }
        } else {
            System.out.println("Names longer than 15 characters are not allowed");
        }
    }
}



