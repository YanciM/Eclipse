package com.class29;

import java.util.ArrayList;

public class Demo2 {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        for (int element : array) {
            if (element == 10) {
                System.out.println("found");
            }

        }

        ArrayList<Integer>arrayList=new ArrayList<>();  // <> list what type of data type to use only
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        System.out.println(arrayList.contains(100));  //checks to see if a number is present

    }
}
