package com.class29;

import java.util.ArrayList;

public class InteratorDemo {
    public static void main(String[] args) {


        ArrayList<String>subjects=new ArrayList<>();
        subjects.add("Sdlc");
        subjects.add("Manual testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNG");
        System.out.println(subjects);

        for(String subject:subjects){
            if(subject.length()>4){
                subjects.remove(subject); //RE
            }
        }
        System.out.println(subjects);
    }
}
