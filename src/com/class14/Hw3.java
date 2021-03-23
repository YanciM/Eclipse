package com.class14;

public class Hw3 {
	
	//Write a method to return whether given number is prime or not?
	
	boolean isPrime;
	
	boolean prime(double num) {
		
		if(num>1) {
			
			for(double i=2; i<=num; i++) {
				
				if(num%2==0) {
					isPrime=true;
					
				}else {
					isPrime=false;
					
				}
			}
			
		}
		return isPrime;
	}

}
