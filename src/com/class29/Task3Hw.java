package com.class29;

import java.util.ArrayList;

public class Task3Hw {
    public static void main(String[] args) {
        /*Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. */

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("soda");
        drinks.add("juice");
        drinks.add("beer");
        drinks.add("wine");
        drinks.add("milk");
        drinks.add("coffee");

        //FIRSTWAY
      /*  for(String drink:drinks){
           if(drinks.contains("a")||drinks.contains("e")){
               drinks.set(drink.indexOf(drink),"water");
           }

        }*/

        //SECOND WAY
        System.out.println(drinks);
        for(int i=0; i<drinks.size();i++){
            if(drinks.get(i).contains("e")||drinks.get(i).contains("a")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);
    }
}
