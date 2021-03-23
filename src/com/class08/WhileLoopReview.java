package com.class08;

import java.util.Scanner;

public class WhileLoopReview {
	public static void main(String[] args) {

		/*
		 * we need to make user to pay for a soda keep asking user to pay until it
		 * enters 3
		 * 
		 * if user gives more than 3---> please give less money if user gives less than
		 * 3---> please give more money
		 * 
		 */

		Scanner scan;
		int pay = 0, enters = 3;

		scan = new Scanner(System.in);
		System.out.println("Please pay for soda");
		pay = scan.nextInt();

		while (pay != 3) {
			if (pay < 3) {
				System.out.println("Please give more money");
			} else if (pay > 3) {
				System.out.println("Please give less money");
			}
			pay = scan.nextInt();
		}
		System.out.println("Thank you for your purchase");
	}

}
