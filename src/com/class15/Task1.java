package com.class15;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		
		System.out.println("Please enter username");
		String username=input.next();
		
		System.out.println("Please enter password");
		String password=input.next();
		
		
		
		
		
		if(username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password can not be empty");
			
		}else if(password.length()<8) {
			System.out.println("Password is to short");
			
		}else if(password.contains(username)) {
			System.out.println("Password can not contain username");
			
		}else if(!password.equals(password)) {
			System.out.println("Passwords do not match");
			
		}else {
			System.out.println("Your username and password have been created");
		}
		
		
		

	}

}
