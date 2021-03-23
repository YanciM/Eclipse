package com.class14;

public class WithMethods {
	
	public static void main(String[] args) {
		
		
		int  num1=10;
		int num2=-1;
		int num3=0;
		int num4=1000;
		checkNumber(num1);
		checkNumber(num2);
		checkNumber(num3);
		checkNumber(num4);
		
		
	}
public static void checkNumber (int num) {
	
	if(num>0) {
		System.out.println(num+" is greater than 0");
		
	}else if (num<0) {
		System.out.println(num+" is less than 0");
		
	}else {
		System.out.println(num+" is 0");
	
	
	}
}
}
