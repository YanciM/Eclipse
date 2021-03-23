package com.class02;

public class HWJava {

	public static void main(String[] args) {

		byte box1 = 27; // creating a variable and assigning value to it

		short box2 = 130;

		int box3 = 130000; // creating variable and assigning value to it
		box3 = 140000;

		long box4 = 1400000000;

		float f = 10.99f;
		double d = 10.9999;

		char m = '$';

		boolean yes = true;
		boolean no = false;

		box3 = 2000; // reassign the value (change the value of the variable)
		
		//byte box1=20; Java complains because now we have duplicate variable
		
		//box3=12.99; Error: type mismatch: because variable c can only hold it in int types of value

		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(f);
		System.out.println(d);
		System.out.println(m);
		System.out.println(yes);
		System.out.println(no);

	}

}
