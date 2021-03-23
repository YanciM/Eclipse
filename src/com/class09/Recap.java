package com.class09;

public class Recap {

	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {

			for (int j = 1; j < 5; j++) {
				System.out.println("Good evening");
			}
			System.out.println("--------------------");
		}

		System.out.println(
				"----------------------------------------------------------------------------------------------------");

		for (int i = 1; i < 3; i++) {
			System.out.println(i);

			for (int j = 1; j <= 4; j++) {
				System.out.println(j);
			}
		}

		System.out.println(
				"----------------------------------------------------------------------------------------------------");

		for (int i = 1; i < 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.println(i + " " + j);
			}
		}

		System.out.println("-----------------------------PRINT FROM 10 TO 99---------------------------------------");

		for (int i = 0; i <= 10; i++) {

			for (int j = 0; j <= 9; j++) {
				System.out.println(i + " " + j);
			}
		}

		System.out.println("---------------------------CAR ODEMETER TASK-------------------------------");

		for (int i = 0; i <= 9; i++) {

			for (int j = 0; j <= 9; j++) {

				for (int k = 0; k <= 9; k++) {

					for (int l = 0; l <= 9; l++) {
						System.out.println(i + " " + j + " " + k + " " + l);
					}

				}
			}
		}

		System.out.println("--------------------------Clock------------------------------");

		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {

				if (h < 10 && m < 10) {
					System.out.println("0" + h + ":0" + m);
				} else if (h < 10 && m >= 10) {
					System.out.println("0" + h + ":" + m);
				} else if (h >= 10 && m < 10) {
					System.out.println(h + ":0" + m);

				} else {
					System.out.println(h + ":" + m);
				}
			}

		}

		System.out.println("------------------------------------------------------------------------");

		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				if (h < 10) {
					if (m < 10) {
						System.out.println("0" + h + ":0" + m);
					} else {
						System.out.println("0" + h + ":" + m);
					}
				} else {
					if (m < 10) {
						System.out.println(h + ":0" + m);
					} else {
						System.out.println(h + ":" + m);
					}
				}

			}

		}

		System.out.println(
				"----------------------------------------MULTIPLICATION TABLE---------------------------------------------");
		
		int result;

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				result= i*j;
				System.out.println(i + " * " + j + " = " + result);
			}
		}
	}
}
