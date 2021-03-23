package com.class11;

public class GroupHw9 {
	public static void main(String[] args) {

		// Write a java program to find the second largest number in the array?

		int num, size;

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		size = array.length;

		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {

				if (array[i] > array[j]) {
					num = array[i];
					array[i] = array[j];
					array[j] = num;
				}
			}
		}
		System.out.println("The second largest number is " + array[size - 2]);

		System.out.println("----------ANOTHER WAY----------");

		int[] arr2 = {-900, 200, 900, 3, 300, 300, 0, -900, 145, 76, 45, 125, 36, 145 };

		int large, secondLarge;

		large = arr2[0];
		secondLarge = arr2[0];

		for (int i = 0; i < arr2.length; i++) {

			if (arr2[i] > large) {
				secondLarge = large;
				large = arr2[i];
			} else if (arr2[i] > secondLarge && arr2[i] != large) {
				secondLarge = arr2[i];
			}

		}
		System.out.println("Largest number is " + large);
		System.out.println("Second largest number is " + secondLarge);

	}

}
