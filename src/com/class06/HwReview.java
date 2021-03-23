package com.class06;

import java.util.Scanner;

public class HwReview {

	public static void main(String[] args) {

		/*
		 * Write a program to find largest number among three numbers using nested if
		 * provided by a user (numbers must be distinct)
		 */

		int num1, num2, num3, largest;
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter 3 numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();

		if (num1 == num2 && num2 == num3) {
			System.out.println("Numbers are equal");
		} else {

			if (num1 > num2) { // we assume num1 is bigger than num2
				if (num1 > num3) {
					largest = num1;
				} else {
					largest = num3;
				}
			} else { // assuming num2 is bigger than num1
				if (num2 > num3) {
					largest = num2;
				} else {
					largest = num3;
				}

			}

			System.out.println("The largest number amoung " + num1 + ", " + num2 + ", " + num3 + " is " + largest);

		}
		
		System.out.println("---------------------------End of program------------------------------------");
	}

}
