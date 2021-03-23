package com.class10;

public class Hw1 {
	public static void main(String[] args) {

		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array.
		 */

		String[] car = { "Honda", "Mercedes", "BMW", "Chevrolet", "Tesla", "Porsche" };

		for (String cars : car) {
			System.out.print(cars+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		for(int i=0; i<car.length; i++) {
			System.out.print(car[i]+" ");
		}

	}
}
