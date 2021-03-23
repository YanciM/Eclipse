package com.class05;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {

		String month;
		String season = "input";

		Scanner info = new Scanner(System.in);

		System.out.println("Please enter birth month");

		month = info.next();

		if (month.equals("January") || month.equals("February") || month.equals("March")) {
			season = "Winter";
		} else if (month.equals("April") || month.equals("May") || month.equals("June")) {
			season = "Spring";
		} else if (month.equals("July") || month.equals("August") || month.equals("September")) {
			season = "Summer";
		} else if (month.equals("October") || month.equals("November") || month.equals("December")) {
			season = "Fall";
		}

		System.out.println("You were born in the season of " + season);
	}
}