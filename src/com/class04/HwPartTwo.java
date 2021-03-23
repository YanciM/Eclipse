package com.class04;

import java.util.Scanner;

public class HwPartTwo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of years worked");

		int yearsWorked = input.nextInt();

		if (yearsWorked >= 5) {
			System.out.println("You are eligibal for a bonus!");

			System.out.println("Enter annual salary");

		} else {
			System.out.println("Sorry, you are not eligibal for a bonus.");
		}

		int salary = input.nextInt();

		if (salary > 50000) {
			System.out.println("You get a bonus of 50,000.");

		} else {
			System.out.println("You get a bonus of 3,000.");
		}
	}

}
