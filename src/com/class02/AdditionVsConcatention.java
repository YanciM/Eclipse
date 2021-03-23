package com.class02;

public class AdditionVsConcatention {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=11;
		
		String str1="Hello";
		String str2="Hi";
		
		System.out.println(num1+num2+str1+str2);
		System.out.println(num1+str1+num2+str2);
		System.out.println(str1+str2+num1+num2);
		
		
		String result=str1+str2+(num2+num1);
		System.out.println(result);
		
		
		
		
		
		

	}

}
