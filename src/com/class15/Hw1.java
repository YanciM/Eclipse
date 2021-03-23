package com.class15;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		
		/*
		 *Write a program that reads two people's first names and if they expecting boy or girl?    
         *Based on the input suggests a name for a baby:
         *Example Output:
         *Mom's first name? Mary
         *Dad's first name? Daniel
         *Boy or Girl? boy
         *Suggested baby name: DANRY
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is moms first name?");
		String momName=input.next();
		
		System.out.println("What is dads name?");
		String dadName=input.next();
		
		System.out.println("Is the baby a boy or girl?");
		String baby=input.next();
		
		if(baby.equalsIgnoreCase("girl")) {
			System.out.println(dadName.substring(0,2)+momName.substring(4,5)+momName.substring(3));
			
		}else if(baby.equalsIgnoreCase("boy")) {
			System.out.println(dadName.substring(0,3)+momName.substring(4));
		}
		
		
		
		
		
		
		

	}

}
