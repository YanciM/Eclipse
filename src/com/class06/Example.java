package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		/*
		 * we need to calculate final price after the discount
		 * 
		 * we check if there is sale if no sale--> I am not going for shopping if there
		 * is sale we wil ask the item we will ask price
		 * 
		 * if price is less than 10---> apply 5% discount if price is between 10 and
		 * 100---> apply 10% discount if price is between 100 to 500---> apply 20%
		 * discount if price is more than 500---> apply 30% discount
		 * 
		 * "Which item you purchased, what was original price, what discount applies and final price"
		 * 
		 * 
		 */

		Scanner scan;
		boolean sale;
		String item = null;
		Double price, discount=0.0, finalPrice = 0.0;

		scan = new Scanner(System.in);

		System.out.println("Is there a sale?");
		sale = scan.nextBoolean();

		if (!sale) {
			System.out.println("I am not going shopping");

		} else {
			System.out.println("What item is on sale?");
			item = scan.next();
			System.out.println("What is the price?");
			price = scan.nextDouble();

			if (price < 10) {
				discount = price * 0.5;

			} else if (price >= 10 && price <= 100) {
				discount = price * 0.1;

			} else if (price >= 100 && price <= 500) {
				discount = price * 0.2;

			} else if (price > 500) {
				discount = price * 0.3;

			}
			
			finalPrice=price-discount;
			System.out.println("You are purchasing " + item + " with the original price of " + price
					+ " with a discount of " + discount + " and final price of " + finalPrice);
		}

	}

}
