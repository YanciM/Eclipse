package com.class04;

import java.util.Scanner;

public class Hw2 {
	
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter name of city");
		
		String city=input.nextLine();
		
		System.out.println("Enter temperature");
		
		int temp=input.nextInt();
		
		int cel=(temp-30)/2;
		
		System.out.println("The temperature in the city of "+city+" is "+cel+" degrees celcius.");
		
		
		
		
		
		
		
		
	}

}
