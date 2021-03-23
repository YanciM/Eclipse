package com.class04;

import java.util.Scanner;

//Shortcut to import for window: ctrl+shift+o
public class Demo {
	
	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter any text");
		
		
		                              //captures entire text with space
		String text=scan.nextLine(); //scan.next();----> captures your input from console
		                                              //once you enter text you must Hit Enter
		                                            
		
		System.out.println("Text that I entered is "+text);
		
		System.out.println("Please enter name");
		
	
		
		
		String name=scan.next(); //captures 1 word till space
		
		System.out.println("Nice to meet you "+name);
		
		System.out.println("Please enter your age");
		
		
		
		int age=scan.nextInt();
		System.out.println("My name is "+name+" and I am "+age+" years old");
		
	
	
	
	}
	
	}
