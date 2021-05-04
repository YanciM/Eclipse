package com.class29;


import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("Sdlc");
        subjects.add("Manual testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        System.out.println(subjects.get(2));
        subjects.add("TestNG");
       // System.out.println(subjects.get(6)); Runtime Error
        System.out.println(subjects.indexOf("Java"));
        System.out.println("Size before removal "+subjects.size());
        subjects.remove("Git");
        System.out.println("Size after removal "+subjects.size());
        System.out.println(subjects.isEmpty());


    }
}
