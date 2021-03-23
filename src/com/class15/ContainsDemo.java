package com.class15;

public class ContainsDemo {

	public static void main(String[] args) {
		
		String var="This is a demo of contain #!";
		System.out.println(var.contains("#"));
		
		if(var.contains("#") || var.contains("!")) {
			System.out.println("#, ! are not allowed");
		}
		
		System.out.println(var.contains("demo"));  //will check for any part
		
		System.out.println(var.startsWith("demo"));   //will only check starting part
		
		System.out.println(var.endsWith("#"));       //will only check ending part
		
		

	}

}
