package com.class24.Demo;

public class PersonTester {

    public static void main(String[] args) {

        Person person=new Student();
        Person person1=new Teacher();
        Person person2=new Student();

      //  Student student=new Person();
      //  Student student=(Student)person1;
        Student student=(Student) person;
    }
}
