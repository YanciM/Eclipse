package com.class21.Demo1;

import com.class21.Demo1.ParentClass;

public class ChildClass extends ParentClass {

    int field1;
    public ChildClass (int field1, int field2, int field3, int field4, int field5, int field6, int field7){
        super( field1,  field2,  field3,  field4,  field5,  field6,  field7);
        System.out.println("Child class constructor is called");
        super.field1=12;  //super means we are referring to parent class
        this.field1=13;   // this mans we are referring to child class
    }
}
