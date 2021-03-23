package com.class10;

public class Hw2 {
	public static void main(String[] args) {
		
		/*
		 * Create an array of animals and store 6 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */
		
		String[] animals={"Dog", "Cat", "Bird", "Turtle", "Bunny", "Fish"};
		
		for(String a:animals) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("----------------------------------------");
		
		for(int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
		}
	}

}
