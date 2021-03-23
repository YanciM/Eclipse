package com.class04;

import java.util.Scanner;

public class Hw1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter amount of loan needed");

		int amount = input.nextInt();

		if (amount <= 200000) {
			System.out.println("I will lend money");

		} else {
			System.out.println("I will not lend money");
		}

		System.out.println("----------------------------------------------------");

		System.out.println("What is your age?");

		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("You are eligibal for a drivers license");

		} else {
			System.out.println("You will need to apply for a learners permit");
		}

	}

}
