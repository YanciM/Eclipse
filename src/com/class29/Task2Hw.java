package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2Hw {
    public static void main(String[] args) {
        /*Create an arrayList of words. Remove every word that ends with “e”. */

        ArrayList<String>words=new ArrayList<>();
        words.add("10");
        words.add("negotiation");
        words.add("love");
        words.add("nine");
        words.add("great");
        words.add("like");
        words.add("help");

        Iterator<String>iterator=words.iterator();
        System.out.println(words);
        //Best Practice!
        while(iterator.hasNext()){
           String word= iterator.next(); //creating variable
            if(word.endsWith("e")){
               iterator.remove();  //all variables that end with e are removed
            }
        }
        System.out.println(words);

    }
}
