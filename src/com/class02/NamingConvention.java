package com.class02;

public class NamingConvention {

	public static void main(String[] args) {

		// Keywords- a special word hat reserved in java memory: class, public, static,
		// final, for

		// identifiers- name that we give to classes, variables and methods

		/*
		 * Rule!!! DO NOT USE KEYWORD AS IDENTIFIER Identifiers can not contain space
		 * Identifiers can not start with numbers Identifiers can not have special
		 * characters: _ or $ can be used
		 */

		// 1. int final=10; error: INVALID IDENTIFIER

		// 2. byte variable one=12; can not contain space

		// 3. short 1b=12; wrong way
		short b1 = 12; // correct way, don't start with number

		// 4. long *l=20000; can not use special character
		// long l*=20000; can not use special character

		long _l = 20000; // you can use _ or $
		long long_ = 20000;

		double $price = 12.99;
		double price$ = 12.99;

		// NamingCovention ........ Not a rule, its something we prefer to use
		// 1. we use "CamelCasing"
		// 2. classes start with upper cases and will follow camel casing
		// 3. variables start with lower case and will follow camel casing
		// 4. packages we use lower case and use names as reverse way or url
		// 5. use meaningful name for your variable

		int Number = 12; // try not to use upper case names
		int number = 12; // more preferable

		int numberOne = 12;
		int numberTwo = 13;

		boolean isSnow = true;
		boolean snow = true;

		double applePrice = 12.99;
		double mangoPrice = 13.89;

	}

}
