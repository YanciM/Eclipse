package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4Hw {

    /*Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.*/

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        for(int i=0; i<=50;i++){
            if(i%2==0){
                nums.add(i);
            }
        }
        System.out.println(nums);
        Iterator<Integer> iterator=nums.iterator();  //iterator should be used when removing
        while(iterator.hasNext()){
            Integer num=iterator.next();
            if(num%5==0){
                iterator.remove();
            }
        }
        System.out.println(nums);


    }
}