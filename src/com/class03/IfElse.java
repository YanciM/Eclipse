package com.class03;

public class IfElse {
	public static void main(String[] args) {

		// compared 2 numbers--->3 possible conditions
		double num1 = 100.20;
		double num2 = 15.20;

		if (num1 > num2) {
			System.out.println("Double value " + num1 + " is larger than " + num2);
		} else if (num1 < num2) {
			System.out.println("Double value " + num2 + " is larger than " + num1);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		// 2. based on the day number, define a day

		int day = 0;

		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
			System.out.println("Today is Wednesday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("This date is invalid");
		}

	}
}
