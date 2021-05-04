package com.class32.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapsDemo2 {
    public static void main(String[] args) {

        HashMap<Integer,String> students=new HashMap<>();
        students.put(1,"Karina");
        students.put(2,"Roheen");
        students.put(3,"Bryan");
        students.put(4,"Ariana");
        students.put(5,"Ariana");

        Collection<String> values= students.values();  //when it comes to values we are using a collection
        for(String student:values){
            System.out.println(student);
        }

       Set<Integer>Keys= students.keySet();  //when it comes to key we are using a set
        for(Integer key:Keys){
            System.out.println(key);
        }


    }
}
