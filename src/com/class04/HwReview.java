package com.class04;

public class HwReview {

	public static void main(String[] args) {
		
		int negativeOrPositive=-23;
		
		if (negativeOrPositive>0) {
			System.out.println(negativeOrPositive+" is positive number");
		}else if (negativeOrPositive<0) {
			System.out.println(negativeOrPositive+" is negative number");
		}else {
			System.out.println("Number is neither positive or negative");
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		
		int num=11;
		
		if (num%2==0) {
			System.out.println(num+" is even number");
		}else {
			System.out.println(num+" is odd number");
		}
		
		
	}
}
