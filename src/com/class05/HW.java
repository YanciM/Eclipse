package com.class05;

import java.util.Scanner;

import reviewclass1.Main;

public class HW {
	
	public static void main(String[] args) {
		
		String creditCard;
		double balance;
		Scanner scan;
		
		scan=new Scanner(System.in);
		
	
		System.out.println("Do you have a credit card");
		
		creditCard=scan.next();
		
		if (creditCard.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance");
			
			balance=scan.nextDouble();
			
			if (balance>1000) {
				System.out.println("Pay off immediatly");
				
			}else {
				System.out.println("Spend more");
			}
			
			
		}else {
		System.out.println("Would you like a credit card?");
		}
	
	}

}
