package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {

		/*
		 * store gender using M or F based on the gender we will specify if M--> Male if
		 * F--> Female otherwise--> not sure
		 */

		char gender = 'F';
		String description;

		switch (gender) {

		case 'M':
			description = "Male";
			break;
		case 'F':
			description = "Female";
			break;
		default:
			description = "N/A";

		}
		System.out.println(description);

		/*
		 * LIMITATION: switch CANNOT use Relational orLogical Operators (it simply checks value)
		 * switch CANNOT work with boolean, float, double, long
		 * can only work with  byte, short, char, int, String
		 */
		
		boolean sunny=true;
		System.out.println("I am happy");
		
		
		double price=10.99;
		
		if(price>10) {
			System.out.println("Too expensive");
		}
		
		//switch(sunny) {   // CANNOT hold boolean variable
	//	}

	}

}
