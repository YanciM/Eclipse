package com.class06;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {

		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At
		 * the end your program should print which grade was entered by a user with
		 * explanation.
		 */

		Scanner info;
		char grade;
		String explanation;

		info = new Scanner(System.in);
		System.out.println("Please enter grade");
		grade = info.next().charAt(0);

		switch (grade) {

		case 'A':
			explanation = "Excelent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Average";
			break;
		case 'D':
			explanation = "Bad";
		default:
			explanation = "Not Acceptable";

		}
            System.out.println("Your grade "+grade+" is "+explanation);
	}

}
