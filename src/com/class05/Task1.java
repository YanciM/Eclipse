package com.class05;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		
		int height;
		
		Scanner input;
		input=new Scanner(System.in);
		
		System.out.println("Please enter your height");

		height=input.nextInt();
		
		if (height<=60) {
			System.out.println("You are short");
			
		}else if (height>=60 && height<=72) {
			System.out.println("You are a medium height");
			
		}else if (height>=72) {
			System.out.println("You are tall");
		}
		
		
		
		
		
	}

}
