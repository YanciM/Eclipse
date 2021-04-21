package com.class29;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("Sdlc");
        subjects.add("Manual testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        System.out.println(subjects.get(2));
        subjects.add("TestNG");
        System.out.println(subjects);

        ArrayList<String> subjectsThatWeWantToRemove=new ArrayList<>();
        subjectsThatWeWantToRemove.add("Sdlc");
        subjectsThatWeWantToRemove.add("Manual testing");
        subjectsThatWeWantToRemove.add("Java");
        subjects.removeAll(subjectsThatWeWantToRemove);
        System.out.println(subjects);

    }
}
