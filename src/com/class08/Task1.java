package com.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		// Print numbers from 1 to 50, except those that are divisible by 3

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("----------------------------------------------------------------------------");

		// Create a program that will keep asking user to apply for a credit card. As
		// soon as you get "yes" from a user, program should stop asking.

		Scanner info = new Scanner(System.in);
		boolean card = true;

		do {
			System.out.println("Would you like to apply for a card?");
			card = info.nextBoolean();
			if (card) {
				break;
			}

		} while (!card);

	}

}
