package com.class17;

public class LocalVariablesDemo {

	// Local variables are the variables which are declared inside a method,
	// constructor or any block of code.
	// Anything that is inside {}; or ();

	void printInfo(String name) {
		System.out.println(name);
	}

	void printInfoWithAddress(String name, String address) {
		System.out.println(name + address);
		// System.out.println(phoneNumber); CE not defined
	}

	public static void main(String[] args) {

		String name = "Local";
		System.out.println(name);

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// System.out.println(i); CE not defined

	}

}
