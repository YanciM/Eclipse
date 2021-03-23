package com.class03;

public class TemperaturCheck {

	public static void main(String[] args) {

		int temp = 28;
		if (temp < 32) {
			System.out.println("I am a if bloack");
			System.out.println("Water will freeze with temperature " + temp);
			System.out.println("It is very cold");
		} else {
			System.out.println("I am else block");
			System.out.println("Water will not freeze with temperaure " + temp);

		}

		double money = 5;
		double $coke = 9;

		if (money == $coke) {
			System.out.println("I am buying soda");
		} else {
			System.out.println("I need exact amount");
		}

		System.out.println("--------------------------------------------------");

		boolean snow = true;

		if (snow) {
			System.out.println("Yay, I will play with the snow");
		} else {
			System.out.println("I am going to ride my bicycle");
		}

		boolean summer = false;

		if (summer) {
			System.out.println("I am going to Florida");
		} else {
			System.out.println("I will stay at home");
		}

	}

}
