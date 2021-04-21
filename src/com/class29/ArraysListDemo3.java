package com.class29;

import java.util.ArrayList;

public class ArraysListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("Sdlc");
        subjects.add("Manual testing");
        subjects.add("Java");
        System.out.println(subjects);

        ArrayList<String>subjects2=new ArrayList<>();
        subjects2.add("Git");
        subjects2.add("Selenium");
        subjects2.add("TestingNG");

        //subjects.addAll(subjects2);
        //subjects.addAll(0,subjects2);
        subjects.addAll(1,subjects2);
        System.out.println(subjects);

    }
}
