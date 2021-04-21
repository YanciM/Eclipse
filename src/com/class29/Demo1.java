package com.class29;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {

        int a=214748347;
       // double[] array=new double[214748347];

        String[] names=new String[2];
        names[0]="Monika";
        names[1]="Yanci";
       // names[2]="Mj";

        String[] names2=new  String[3];
        names2[0]=names[0];
        names2[1]=names[1];
        names2[2]="Mj";
        System.out.println(Arrays.toString(names2));


    }
}
