package com.class07;

public class Task1 {
	public static void main(String[] args) {

		System.out.println(
				"-------------------------------------print numbers 1 to 100-------------------------------------");
		int num = 1;

		while (num <= 100) {
			System.out.print(num + " ");
			num++;
		}

		System.out.println();
		System.out.println(
				"------------------------------print numbers 100 to 1--------------------------------------------");

		int num1 = 100;

		while (num1 >= 1) {
			System.out.print(num1 + " ");
			num1--;
		}

		System.out.println();
		System.out.println(
				"------------------------------print even numbers from 20 to 100-----------------------------------------");

		int num2 = 20;

		while (num2 <= 100) {
			System.out.print(num2 + " ");
			num2 += 2;
		}
		System.out.println();// or you can print even numbers this way
		System.out.println("--------------------or you can print even numbers this way------------------------");
		int a = 20;

		while (a <= 100) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
			}
			a++;
		}
		
		
		System.out.println("----------------------------End of code------------------------------");
		
		
	}

}
