package com.class25;

public class Task1 {

    final int number;
    Task1(int number){
        this.number=number;                //can initialize only through constructor
    }

    /*void init(int number){
        this.number;             //CE Variable is final, can not change it
    }*/

    public static void main(String[] args) {
        Task1 var1=new Task1(10);
       // var1=new Task1(20);

        final int[] a={10,20};
        a[1]=30;

    }
}

