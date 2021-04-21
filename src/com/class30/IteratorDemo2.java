package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("Sdlc");
        subjects.add("Manual testing");
        subjects.add("Java");
        subjects.add("TestNG");


        Iterator<String>iterator=subjects.iterator();
        System.out.println(subjects);
        while(iterator.hasNext()){
            String var= iterator.next();
            if(var.length()>4){
                iterator.remove();
            }

        }
        System.out.println(subjects);



    }
}
