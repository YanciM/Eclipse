package com.class22.methodOverLoading;

public class MethodOverLoadingDemo {

    void add(int a, int b){
        System.out.println(a+b);
    }

    void addDoubles(double a, double b){
        System.out.println(a+b);

    }
    void addArrays(int[] arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }

    void addThreeNumbers(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {

        MethodOverLoadingDemo methodOverLoadingDemo=new MethodOverLoadingDemo();
        methodOverLoadingDemo.add(10,20);
        methodOverLoadingDemo.addDoubles(10.5,20.5);
        int[] arr={10,10,10};
        methodOverLoadingDemo.addDoubles(10.5,20);
    }
}
