package com.class05;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {

		double num1, num2, num3;
		double largest = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter first number");
		num1 = input.nextDouble();

		System.out.println("Please enter second number");
		num2 = input.nextDouble();

		System.out.println("Please enter third number");
		num3 = input.nextDouble();

		if (num1 > num2 && num1 > num3) {
			largest = num1;
		} else if (num2 > num1 && num2 > num3) {
			largest = num2;
		} else if (num3 > num1 && num3 > num2) {
			largest = num3;
		}

		System.out.println("The largest number is " + largest);
	}

}
