package com.class06;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {

		// Ask user to enter their country and capture it. Once values are captured
		// print which language user speaks.

		Scanner input;
		String country, language;

		input = new Scanner(System.in);

		System.out.println("Please enter your country");
		country = input.nextLine();

		switch (country) {

		case "USA":
			language = "No offcial language";
			break;
		case "El Salvador":
			language = "Spanish";
			break;
		case "China":
			language = "Mandarin";
			break;
		case "France":
			language = "French";
			break;
		case "Greece":
			language = "Greek";
			break;
		case "Japan":
			language = "Japanese";
			break;
		case "Italy":
			language = "Italian";
			break;
		default:
			language = "Uknown";

		}
                      System.out.println("You speak "+language);
	}

}
