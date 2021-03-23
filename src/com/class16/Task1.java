package com.class16;

public class Task1 {
	
	public static void main(String[] args) {
		
		// Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
		String str1="Hello, how are you?";
		System.out.println(str1.replace(" ", ""));
		
		System.out.println("------------------------------");
		
		// Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String.

		String str2="Spring2021!";
		str2=str2.replaceAll("[^a-zA-Z]", "");
		System.out.println("There are "+str2.length()+ " alpha characters in the string.");
		
		System.out.println("---------------------------------");
		
		/*
		 * You have a String a="Is it saturday? Is it raining? Do we have a Java Class today?" 
		 * How would you find out how many sentences are in that String?
		 */
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] str3= a.split("[?]");
		System.out.println("There are "+str3.length+" sentences in the string.");
		
	}

}
