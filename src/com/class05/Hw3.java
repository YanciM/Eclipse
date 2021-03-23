package com.class05;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		double num1, num2, num3, largest = 0;
		

		

		System.out.println("Please enter first number");
		num1 = scan.nextDouble();

		System.out.println("Please enter secong number");
		num2 = scan.nextDouble();

		System.out.println("Please enter third number");
		num3 = scan.nextDouble();

		if (num1 > num2 && num1 > num3) {
			largest = num1;
		} else {
			if (num2 > num1 && num2 > num3) {
				largest = num2;
			} else if (num3 > num1 && num3 > num2) {
				largest = num3;
			}
		}

		System.out.println("The largest number is " + largest);

	}

}
