package com.class02;

public class StringExample {

	public static void main(String[] args) {

		String name;
		name = "Yanci";

		String greeting = "Good Morning!";
		String phoneNumber = "123-456-7890";

		String stringNumber = "12";
		String space = " ";

		String letter = "A";
		String letter2 = "A ";
		char oneLetter = 'A';

		// Hello, my name is Yanci

		System.out.println("Hello, my name is " + name);

		// How are you Yanci?

		System.out.println("How are you " + name);

		int age = 26;
		// I am 26

		System.out.println("I am " + age);

		char grade = 'A';
		// Yanci is A student

		System.out.println(name + " is an " + grade + " student");

		/*
		 * String concatenation operator + can be used when 
		 * we attach String another String
		 * we attach String to a number
		 * we attach String to any character or boolean
		 */

		String car = "Honda Pilot";
		int year = 2018;

		// I drive a 2018 Honda Pilot

		System.out.println("I drive a " + year + " " + car);

		String computer = "Macbook";
		int memory = 250;

		// Yanci has Macbook with 250 GB memory

		System.out.println(name + " has a " + computer + " with " + memory + " GB memory");

		String combinedValue = year + " " + car;   // 2018 Honda Pilot //Anything you attach to a String, becomes a String
		System.out.println(combinedValue);

		byte day = 7;
		String month = "February ";
        String date = month + day;
		System.out.println(date);

	}

}
