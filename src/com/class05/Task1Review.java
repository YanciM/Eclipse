package com.class05;

import java.util.Scanner;

public class Task1Review {
	
	public static void main(String[] args) {
		
		//BETTER WAY
		
int height;
		
		Scanner input;
		input=new Scanner(System.in);
		
		System.out.println("Please enter your height");

		height=input.nextInt();
		
		String definition;
		
		if (height<=60) {
			definition="short";
			
		}else if (height>60 && height<=72) {
            definition="medium";
			
		}else {
		    definition="tall";
		}
		
		System.out.println("you are a person who's height is "+definition);
		
	}

}
