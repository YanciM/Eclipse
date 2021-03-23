package com.class04;

public class NestedIfLastExample {

	public static void main(String[] args) {
		
		/*
		 * To donate:
		 * you must be 18 and older, otherwise you can not
		 * your weight must be more than 110lbs, otherwise you can not donate
		 * 
		 */
		
		
		int age=27;
		int weight=100;
		
		if (age>=18) {
			System.out.println("You are eligibal");
			
			if(weight>110) {
				System.out.println("You can donate");
			}else {
				System.out.println("You can not donate");
			}
			
			
		}else {
			System.out.println("You can not donate");
		}
		
		
	
	}
}
