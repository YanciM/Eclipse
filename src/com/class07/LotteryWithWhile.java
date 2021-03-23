package com.class07;

import java.util.Scanner;

public class LotteryWithWhile {
	public static void main(String[] args) {

		Scanner input;
		int num;
		int lotteryNumber = 17;

		input = new Scanner(System.in);

		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		num = input.nextInt();

		while (num != lotteryNumber) {
			System.out.println("Please enter any number from 1 to 100 to wint the lottery");
			num = input.nextInt();
		}

		System.out.println("Congratulations, you entered " + num + " which is the lucky number");

	}
}
