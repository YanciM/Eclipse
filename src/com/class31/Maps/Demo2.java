package com.class31.Maps;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {

        HashMap<String,Double> groceries=new HashMap<>();
        groceries.put("eggs",12.0);
        groceries.put("Milk",15.0);
        groceries.put("Tomato",35.0);
        groceries.put("potato",10.0);
        System.out.println(groceries);
        groceries.remove("Tomato");
        System.out.println(groceries);
        groceries.put(null,null);
        groceries.put("Rice",155.0);
        groceries.put("Apple",null);
        groceries.put("Orange",null);
        System.out.println(groceries);
        groceries.replace("Orange",35.0);
        System.out.println(groceries);

    }
}
