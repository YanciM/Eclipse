package com.class02;

public class VariableDeclaration {

	public static void main(String[] args) {

		// 1st way to create variable
		short b = 200; // create a variable and assign value
						// declare a variable and initialized

		// 2nd way to create a variable
		int sum; // declaration happens ONLY ONCE.......ask for a box
		sum = 20; // initialized the variable

		sum = 30; // reassign the value

		/*
		 * int x; int y; int z;
		 */
		int x, y, z;

		x = 10;
		y = 20;
		// z=30.9; Error: Type Mismatch, since variable can store only int type of
		// value, not float

		// I would like to change the value of x
		x = 70;

		System.out.println(x);
		System.out.println(y);
		System.out.println(sum);
		System.out.println(b);

		int num = 33;
		// we are using value of different variable to initialize the value of a new
		// variable

		int num2=num; // 33
		System.out.println(num2);
		
		int age=50;
		int iq=age;
		
		System.out.println(iq+""+age);
		
	}

}
