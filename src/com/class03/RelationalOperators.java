package com.class03;

public class RelationalOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 7;

		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != b); // not equal

		// result will always be a boolean operator
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		boolean result = a >= b; // yes--->true
		boolean result1 = a <= b; // no--->false

		System.out.println(result);
		System.out.println(result1);

		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		int c = 20;
		int d = 29;

		System.out.println(c == d); // checking equality
		System.out.println(c = d); // reassigning the value of d to c
		System.out.println(c);
		System.out.println(d);
		

	}

}
