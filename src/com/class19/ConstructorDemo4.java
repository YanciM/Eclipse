package com.class19;

public class ConstructorDemo4 {

    String name;
    ConstructorDemo4(){
        System.out.println("Empty parameter constructor");
    }


    ConstructorDemo4(String name){
       //this();  //will also call empty parameter constructor when line 19 is executed
        System.out.println("Parameterized constructor");
        //this.name=name;
    }

    void printInfo(){
        printName();    //printing out name as well from line 23
        System.out.println(name);
    }

    void printName(){
        System.out.println("Yanci");
    }

    public static void main(String[] args) {
        ConstructorDemo4 ob1=new ConstructorDemo4();
        new ConstructorDemo4( "Alec");

     ob1.printInfo();

     //Object such as **ConstructorDemo4 ob1=new ConstructorDemo4(); **
        // is needed to print out instance member(fields,methods)


    }
}
