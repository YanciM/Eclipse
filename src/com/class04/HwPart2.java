package com.class04;

import java.util.Scanner;

public class HwPart2 {
	
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Do you have a credit card");
		
		String creditCard=input.next();
		
		if (creditCard.equals("no")) {
			System.out.println("Would you like to apply for a credit card?");
			
		}else {
			System.out.println("What is the balace on you card?");
		}
		
		int balance=input.nextInt();
		
		if (balance>1000) {
			System.out.println("Please pay off immediatly");
			
		}else {
			System.out.println("You can spend more!");
		}
		
		
		
		
		
		System.out.println("Input the boolean value");

	    boolean v=input.nextBoolean();

	    if (v=true);{
	      System.out.println("The value is "+v);
	    }
		
	}

}
