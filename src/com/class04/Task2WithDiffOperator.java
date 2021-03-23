package com.class04;

public class Task2WithDiffOperator {

	public static void main(String[] args) {

		double morgageRate = 4.2;
		int morgagePrice = 10000;

		if (morgageRate < 4.5) {
			System.out.println("I am buying");

			if (morgagePrice > 200000) {
				System.out.println("Will take loan");
			} else
				System.out.println("Will pay cash");

		} else {
			System.out.println("Not buying");

		}

	}

}
