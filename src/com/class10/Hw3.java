package com.class10;

public class Hw3 {
	public static void main(String[] args) {

		/*
		 * Create an array on integers and calculate the sum of all elements in an
		 * array.
		 */

		int[] num = { 7, 9, 26, 27, 3, 2 };

		System.out.println("The sum of all elements is " + (num[0] + num[1] + num[2] + num[3] + num[4] + num[5]));

		System.out.println("--------------------------Or-------------------------");

		int sum = 0;
		for (int i : num) {
			sum += i;
        }
		System.out.print("The sum of all elements is "+sum);

	}
}
