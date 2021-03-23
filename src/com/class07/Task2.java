package com.class07;

public class Task2 {
	public static void main(String[] args) {

		System.out
				.println("---------------------PRINT NUMBERS FROM 1 TO 100 IN LINE WITH SPACE-----------------------");

		for (int num = 1; num <= 100; num++) {
			System.out.print(num + " ");
		}

		System.out.println();
		System.out.println("----------------------PRINT NUMBERS FROM 100 TO 1---------------------------");

		for (int num = 100; num >= 1; num--) {
			System.out.print(num + " ");
		}

		System.out.println();
		System.out.println("------------------------PRINT EVEN NUMBERS BETWEEN 20 TO 1-------------------------");

		for (int num = 20; num >= 1; num--) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
		
		System.out.println();
		System.out.println("------------------------OR-------------------------");
		
		for(int num=20; num>=1; num-=2) {
			System.out.print(num+" ");
		}

		System.out.println();
		System.out.println("------------------------PRINT ODD NUMBERS BETWEEN 20 AND 50-------------------------");

		for (int num = 20; num <= 50; num++) {
			if (num % 2 == 1) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
		System.out.println("-----------------------------------OR------------------------------");

		for (int num = 21; num <= 50; num += 2) {
			System.out.print(num + " ");
		}

		System.out.println();
		System.out.println("---------------------------WHAT IS THE OUTPUT--------------------------------");

		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		System.out.println();
		System.out.println("---------------------------WHAT IS THE OUTPUT--------------------------------");

		int result = 0;

		for (int i = 2; i < 10; i += 2) {
			result += i;

		}
		System.out.print(result);

		
		
		
		/*  calculate sum of odd and even numbers from 1 to 50*/
	}
}
