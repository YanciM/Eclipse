package com.class29;

public class WrapperClassesDemo2 {
    public static void main(String[] args) {

        int a=10;
        Integer aa=a;
        a=aa;

        Integer integer=new Integer(10);  //boxing...putting primitive type inside a wrapper(box)
        Integer integer1=45; // autoboxing....shorter way

        //Boxing refers to converting a primitive type value into a corresponding wrapper object
        //when a wrapper object in unwrapped into a primitive value than it is known as unboxing

        int abc=integer.intValue(); //unboxing...converting wrapper class to primitive
        abc=integer; //auto unboxing...shorter way


    }
}
