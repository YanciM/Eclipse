package com.class07;

public class Hw {
	public static void main(String[] args) {

		/* calculate sum of odd and even numbers from 1 to 50 */

		int sumOfOdd = 0;
		int sumOfEven = 0;

		for (int num = 1; num <= 50; num++) {
			if (num % 2 != 0) {
				sumOfOdd = sumOfOdd + num;
			}
		}
		System.out.println("The sum of odd numbers is " + sumOfOdd);

		System.out.println("-----------------------------------------");

		for (int num = 1; num <= 50; num++) {
			if (num % 2 == 0) {
				sumOfEven = sumOfEven += num;

			}
		}
		System.out.println("The sum of even numbers is " + sumOfEven);
		System.out.println(
				"---------------------------------------Another Way------------------------------------------");

		int odd = 0;
		int even = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 00) {
				even += i;
			} else {
				odd += i;
			}
		}

		System.out.println("Sum of odd numbers equals to " + odd);
		System.out.println("sum of even numbers equals to " + even);

	}

}
