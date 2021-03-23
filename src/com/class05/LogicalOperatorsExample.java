package com.class05;

import java.util.Scanner;

public class LogicalOperatorsExample {
	
	public static void main(String[] args) {
		
		/*ask user to enter age
		 * based on the age we will define
		 * if age is from 1to 3---> you are a baby
		 * if age is from 3 to 5---> you are a bigger baby
		 * if age is from 5 to 11---> you are a kid
		 * if age is from 13 to 19---> teenager
		 * if age above 19---> you are an adult
		 */
		
		Scanner input;
		String name;
		int age;
		
		input=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		name=input.next();
		
		System.out.println("Please enter your age");
		age=input.nextInt();
		
		if (age>=1 && age<3) {
			System.out.println(name+" you are a baby");
		
		}else if (age>=3 && age<=5) {
			System.out.println("You are a bigger baby");
			
		}else if (age>=5 && age<=11) {
			System.out.println("You are a kid");
			
		}else if(age>=13 && age<=19) {
			System.out.println("You are a teenager");
			
		}else if(age>=19){
			System.out.println(name+" you are an adult");
		}
	}

}
