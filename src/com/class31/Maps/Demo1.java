package com.class31.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Azizi");
        arrayList.add("Ram");
        arrayList.add("Danilo");
        arrayList.add("Mike");
        arrayList.indexOf("Mike");

        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(123456,"Azizi");
        map.put(1234567,"Ram");
        map.put(1234568,"Danilo");
        map.put(1234569,"Mike");
        //map.put(1234569,"Jon");  //no duplicates allowed with keys
        map.put(12345610,"Jon");

        System.out.println(map);





    }
}
