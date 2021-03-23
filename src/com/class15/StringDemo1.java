package com.class15;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String name="Azizi";  //Mostly used because of shorter syntax
		String name1=new String("Azizi"); //creating object of string class
		
		System.out.println(name);
		//Length--> tells us number of characters in string object
		System.out.println(name.length());
		
		
		name="       Azizi";
		int len=name.length();   // can assign it to int variable as well, and print out using variable
		System.out.println(len);
	}

}
