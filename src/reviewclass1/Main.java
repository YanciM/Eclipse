package reviewclass1;

public class Main {

	public static void main(String[] yanci) {

		System.out.println("Hello Batch 9");

		// byte short int long---> for storing numbers with out decimals
		// float & double--> for storing decimals
		// char--> for storing single character
		// boolean--> for storing true or false
		// string--> to store more than one character

		String number1 = "10";
		String number2 = "25";

		System.out.println(number1 + number2); // will not calculate under String

		int num1 = 10;
		int num2 = 20;

		System.out.println(num1 + num2); // now it will calculate

		double num5 = 10;
		double num6 = 25;

		System.out.println(num5 / num6);

		String firstName = "Yanci";
		String surName = "Montiel";
		String mobilOrEmail = "2222222222";
		String password = "bchedbcjqn";
		String day = "1";
		String month = "Feb";
		String year = "2021";
		year="2022";  // you can change the value, box does not have to be retyped
		char gender ='F';
		
		
		
		System.out.println(firstName+" your account has been created successfully, you were born in "+year);
		

	}

}
