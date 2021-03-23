package com.class08;

import java.util.Scanner;

public class DoWhileReview {
	public static void main(String[] args) {

		/*
		 * we need to make user to pay for a soda keep asking user to pay until it
		 * enters 3
		 * 
		 * if user gives more than 3---> please give less money 
		 * if user gives less than 3---> please give more money
		 * 
		 */

		Scanner scan;
		int pay = 0, enters = 3;

		scan = new Scanner(System.in);

		do {
			System.out.println("Please pay");
			pay = scan.nextInt();
			if (pay > 3) {
				System.out.println("Please give less money");
				{

				}
			} else if (pay < 3) {
				System.out.println("Please give more money");
			}

		} while (pay != 3);
		System.out.println();

	}

}
