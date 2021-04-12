package com.class28.interfaces;

public interface IParent {

    // private int number=10;  All variables in interfaces are public
    public static final int number=10; //No need to make make variables as public static and final because they already are by default
    int number2=20;

    void method1();
}
interface IParent2{
    void method2();
}
class AdvancedcHILD implements IParent,IParent2{

    @Override
    public void method1() {
        System.out.println("From Iparent");
    }

    @Override
    public void method2() {
        System.out.println("From IParent2");
    }
}
