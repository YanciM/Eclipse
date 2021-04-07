package com.class25.Task;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class Student {

    void eat(){
        System.out.println("Students eat");
    }

    void sleep(){
        System.out.println("Students sleep");
    }
    void study(){
        System.out.println("Students study");
    }

}
class SyntaxStudent extends Student{

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void sleep() {
        super.sleep();
    }

    @Override
    void study() {
        super.study();
    }

    void learn(){
        System.out.println("Syntax students learn Java");
    }
}
class CollageStudent extends Student {

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void sleep() {
        super.sleep();
    }

    @Override
    void study() {
        super.study();
    }

    void lear(){
        System.out.println("Collage students learn many subjects");
    }


    class SchoolStudent extends Student {

        @Override
        void eat() {
            super.eat();
        }

        @Override
        void sleep() {
            super.sleep();
        }

        @Override
        void study() {
            super.study();
        }

        void learn(){
            System.out.println("School students learn a lot");
        }
    }
}
