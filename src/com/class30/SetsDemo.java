package com.class30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetsDemo {

    public static void main(String[] args) {

        Set<String> names=new HashSet<>();
        names.add("Z");
        names.add("G");
        names.add("J");
        names.add("F");
        names.add("A");
        names.add("T");


        ArrayList<String>listFromSet=new ArrayList<>(names);
        System.out.println(names);
        for(int i=0; i< names.size();i++){
            System.out.println(listFromSet.get(i));
        }

    }
}
