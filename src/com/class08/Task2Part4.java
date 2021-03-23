package com.class08;

import java.util.Scanner;

public class Task2Part4 {

	public static void main(String[] args) {

		/*
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money, accumulate the amount and tell the
		 * user how much is left to pay off. If user give more money program should
		 * return a change. Whenever a user done with payments program should say “Thank
		 * you for shopping!”
		 */

		Scanner input = new Scanner(System.in);
		String item;
		int price;
		int money = 0;
		int total;
		int remainder;
		int sum = 0;

		System.out.println("Please enter an item you would like to buy");
		item = input.nextLine();

		System.out.println("Please enter the price of the item");
		price = input.nextInt();
		
		System.out.println("Please pay for " + item);
		

		do {
			money = input.nextInt();
			sum += money;
			if (sum < price) {

				remainder = price - sum;
				System.out.println("Please give " + remainder);
			} else if (sum > price) {
				remainder = sum - price;
				System.out.println("Here is your change " + remainder);
				break;

			} else {
				System.out.println("You have the right amount");

			}
		} while (price != sum);     //price==sum
		System.out.println("Thank you for shopping");

	}

}
