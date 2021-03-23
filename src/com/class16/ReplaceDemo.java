package com.class16;

public class ReplaceDemo {

	public static void main(String[] args) {
		
		String var1="Hello";
		var1=var1.replace('e', 'a');  //replaced 'e' with 'a'  //we can replace the characters
		System.out.println(var1);    
		
		System.out.println("-----------------------------");
		
		String var2="Syntax is best. Batch 9 is best";
		System.out.println(var2.replace("best", "amazing"));  //we can also replace words
		
		
	}

}
