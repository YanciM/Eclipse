package com.class11;

import java.util.Scanner;

public class ArrayRecap {

	public static void main(String[] args) {

		/*
		 * We want to print an array that will store elements from a user
		 */

		String[] array;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many String elements would you like to print?");
		int size=scan.nextInt();
		array=new String[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("please enter a string");
			array[i]=scan.next();
		}
		System.out.println("Lets see what we have stored");
		
		for(String str:array) {
			System.out.print(str+" ");
		}

	}

}
