package com.class31.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo7 {
    public static void main(String[] args) {

        HashMap<String,Double> groceries=new HashMap<>();
        groceries.put("eggs",12.0);
        groceries.put("Milk",15.0);
        groceries.put("Tomato",35.0);
        groceries.put("potato",10.0);
        System.out.println(groceries);
        Iterator<String> iterator=groceries.keySet().iterator();
        while(iterator.hasNext()){
            String key=iterator.next();
                    if(key.contains("o")){
                        iterator.remove();
                    }
        }

        System.out.println(groceries);


    }
}
