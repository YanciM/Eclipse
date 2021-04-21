package com.class30;

public class Student {
    int rollno;
    String name;
    int age;
    Student(int rollno, String name, int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {  //what ever is put in the toString() method, will print
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
