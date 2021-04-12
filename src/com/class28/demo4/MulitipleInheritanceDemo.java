package com.class28.demo4;

public class MulitipleInheritanceDemo extends Parent1{

}
class Parent1{
    void method(){
        System.out.println("Method from Parent1");
    }
}
class Parent2{
    void method(){
        System.out.println("Method from Parent2");
    }
}
class Tester{

    public static void main(String[] args) {
        MulitipleInheritanceDemo mulitipleInheritanceDemo=new MulitipleInheritanceDemo();
        mulitipleInheritanceDemo.method();
    }
}