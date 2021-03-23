package com.class15;

public class Hw2 {

	public static void main(String[] args) {

		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String. Create a String and print it in
		 */

		String str = "Happy";

		if (!str.isEmpty()) {
			int str1=str.length()/2;
			System.out.println("The middle character in Happy is "+str.charAt(str1));

		}
		
		System.out.println("------------------------------------------");
		
		//reverse order (Sunday → yadnuS).
		
		String reverse="Sunday";
		
		for(int i=reverse.length()-1;i>=0;i--) {
			System.out.print(reverse.charAt(i));
		}

	}

}
