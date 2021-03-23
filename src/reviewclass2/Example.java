package reviewclass2;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		double acountBalance = 5000;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your username");

		String name = scan.next();

		if (name.equals("Salma")) { // use .equals when using String, because String is a non primitive data type

			System.out.println("Please enter password");

			String pW = scan.next();
			if (pW.equals("Salma123")) {
				System.out.println("Welcome to Bank od America");

				System.out.println("Please enter amount to transfer");

				double amountToTransfer = scan.nextDouble();

				if (amountToTransfer <= acountBalance) {
					System.out.println("Amount Transffered");

				} else {
					System.out.println("Insufficient balance");
				}
			}

		} else {
			System.out.println("Username is invalid");
		}
	}
}