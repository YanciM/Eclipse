package com.class06;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {

		/*
		 * HomeWork: Using scanner class create calculator. Allow user to enter 2
		 * numbers and operator(+,-,*,/). Based on operator provide the result to user.
		 */

		Scanner input;
		int num1, num2, result = 0;
		char operator;

		input = new Scanner(System.in);

		System.out.println("Please enter two numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();

		System.out.println("Enter operator");
		operator = input.next().charAt(0);

		switch (operator) {

		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			result = 0;
			System.out.println("Operator not valid");
		}
		
		if (result!=0) {
			System.out.println(num1 + "" + operator + "" + num2 + "=" + result);
		}

	}

}
