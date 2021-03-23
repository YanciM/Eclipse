package com.class04;

public class Task1 {

	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 4.5;

		if (diploma) {
			System.out.println("Congratulations");

			if (gpa > 3.5) {
				System.out.println("You are eligibal");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("Get a degree");
		}

		
		System.out.println("-------------------------------------------------------------------");
		
		
		double morgageRate= 3.5;
		int morgagePrice=500000;
		
		if (morgageRate>4.5) {
			System.out.println("Will not buy");
			
		}else {
			System.out.println("Will buy");
			
		  if (morgagePrice>200000) {
				System.out.println("Will take loan");
			}else {
				System.out.println("Will pay cash");
			}
		}
				
		
		
		
	}

}
