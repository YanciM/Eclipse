package com.class11;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		/*
		 * Create an array on double values using Scanner calculate the sum of all
		 * stored elements in that array
		 */

		Scanner scan = new Scanner(System.in);
		double sum = 0;

		System.out.println("How many elements you want to store");
		int size = scan.nextInt();

		double[] number = new double[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter double value");
			number[i] = scan.nextDouble();
			sum += number[i];
		}
		System.out.println("The sum of " + size + " elements from array = " + sum);

	}
}
