package com.class03;

public class Casting {
   public static void main(String[] args) {
	   
	   //int i=10.99; //type mismatch
	   
	   //widening or implicit casting
	   double d=10;
	   System.out.println(d);
	   
	   int num=10;
	   
	   
	   // narrowing or explicit casting
	   int i=(int)12.99;
	   System.out.println(i);
	   
	   
	    byte b=(byte)130;
	   System.out.println(b);
	   
	   
	   int cakePiece=11;
	   cakePiece/=4;
	   System.out.println(cakePiece); //2
	   
	   int number=12;
	   double result=number/5;
	   
	   System.out.println(result); //2.0
	   
	   double newNum=10; 
	   newNum=newNum/3;
	   
	   System.out.println(newNum);
	   
	   //int num1=10+10.5;.....int can not hold double, double is to big of a value
	   double num1=10+10.5;   //double can hold int, because int is a smaller value
	   System.out.println(num1);
	   
	   long a=(long)500.4444;
	   
	   System.out.println(a);
	   
   }
}
