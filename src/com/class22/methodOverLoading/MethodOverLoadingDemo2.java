package com.class22.methodOverLoading;

public class MethodOverLoadingDemo2 {

//    void add(int a, int b){
//        System.out.println(a+b);
//    }
//    void add(double a, double b){
//        System.out.println(a+b);
//    }
//    void add(double a, int b){
//        System.out.println(a+b);
//    }
//    void add(int a, double b){
//        System.out.println(a+b);
//    }
//    void add(double a, int b, int c){
//        System.out.println(a+b+c);
//    }
//    void add(int[] arr){
//            int sum=0;
//            for(int num:arr){
//                sum+=num;
//            }
//            System.out.println(sum);
//    }

    void add(int ... arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        MethodOverLoadingDemo2 obj1=new MethodOverLoadingDemo2();
        obj1.add(10,10);
//        obj1.add(10.0,10.0);
//        obj1.add(10,10.0);
//        obj1.add(10.0, 10);
//        obj1.add(10, 10.0);
//        obj1.add(10.0,10,25);
//        int[] arr={10,12,13};
//        obj1.add(arr);

//        int[] arr={10,12,13};
//        obj1.add(arr);
//        obj1.add(10);
//        obj1.add(10,10);
//        obj1.add(10,10,25);
//        obj1.add(10,25,36,45);
    }
}
