package com.class18;

import java.util.Scanner;

public class AccountTester {
	public static void main(String[] args) {
		
		Account account=new Account();
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter 1 for signup/n 2 for login /n 3 for transfer /n 4 to exit the program");
		    int input=scanner.nextInt();
		    
		    if(input==4) {
		    	break;
		    }else if(input==3) {
		    	System.out.println("Enter the amount that you want to transfer");
		    	double amount=scanner.nextDouble();
		    	System.out.println("Please re-enter your password");
		    	String pass=scanner.next();
		    	account.transferFunds(pass, amount);
		    	
		    	if(input==2) {
		    		System.out.println("Welcome to our bank, please enter your username and password");
		    		String username=scanner.next();
		    		String password=scanner.next();
		    		account.login(username, password);
		    		
		    		
		    	}else if(input==1) {
		    		System.out.println("Enter you username and password and the amount that you want to deposit");
		    		account.sighnUp(scanner.next(), scanner.next(), scanner.nextDouble());
		    	}
		    	
		    }
		}
	}

}
