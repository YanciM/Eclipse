package com.class29;

import java.util.ArrayList;

public class ArrayListDemo5 {

    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("Sdlc");
        subjects.add("Manual testing");
        subjects.add("Java");

        ArrayList<String>allSubjects=new ArrayList<>();
        allSubjects.add("Git");
        allSubjects.add("Selenium");
        allSubjects.add("TestingNG");

        System.out.println(allSubjects.contains(subjects));
    }
}
