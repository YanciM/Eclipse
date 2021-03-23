package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {

		/*
		 * we need to identify favorite food
		 * 
		 * we need to capture country from a user based on country, identify favorite
		 * food
		 */

		Scanner input;
		String country, food;

		input = new Scanner(System.in);
		System.out.println("Please enter your country");

		country = input.nextLine();

		switch (country) {

		case "USA":
			food = "burger";
			break;
		case "Afghanistan":
			food = "Kebab";
			break;
		case "Vietnam":
			food = "Pho";
			break;
		case "Poland":
			food = "Pierogi";
			break;
		case "Kazakstan":
			food = "horse";
			break;
		case "Belarus":
			food = "draniki";
			break;
		case "Tajikistan":
			food = "Plov";
			break;
		case "Mexico":
			food = "Tacos";
			break;
		default:
			food = "Unknown";
       }
		System.out.println("Your favotite food is "+food);

	}

}
