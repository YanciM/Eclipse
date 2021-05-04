package com.class31.Maps;

import java.util.HashMap;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {
        HashMap<String,Double> groceries=new HashMap<>();
        groceries.put("eggs",12.0);
        groceries.put("Milk",15.0);
        groceries.put("Tomato",35.0);
        groceries.put("potato",10.0);


        Set<String> mapKeys=groceries.keySet();
        for (String key:mapKeys){
            if (groceries.get(key)>=15){
                groceries.remove(key);
            }
        }

        }
    }

//This is not possible!