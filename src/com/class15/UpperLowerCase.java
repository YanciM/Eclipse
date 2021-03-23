package com.class15;

public class UpperLowerCase {

	public static void main(String[] args) {
		
		String var1="Hello";
		System.out.println(var1.toLowerCase());
		System.out.println(var1.toUpperCase());
		
		var1="Hello 123!";
		System.out.println(var1.toLowerCase());
		System.out.println(var1.toUpperCase());
		System.out.println(var1);  //Will print as line 11, because values are not being reassigned
		
		var1=var1.toUpperCase(); //reassigned to all upper case, now it will print all upper case
		System.out.println(var1);
		
	}

}
