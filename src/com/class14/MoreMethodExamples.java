package com.class14;

public class MoreMethodExamples {
	
	/*
	 * create a method that does not take any values
	 * and always returns String Hi
	 */
	
	String print() {   //Not taking and output from outside
		return "Hi";
	}
	
	
	/*
	 * create a method that takes a number
	 * and returns the double of that number
	 */
	
	double doubleTheValue(double input) {   //Taking input from outside
		return input*2;
	}
	
	
	/*
	 * create a method that will take a boolean as input
	 * if the value is true, I want to say "Take the umbrella"
	 * if false "Go for a walk"
	 */
	
	void isRaining(boolean isRain) {
		
		if(isRain) {
			System.out.println("Take the umbrella");
		}else {
			System.out.println("Go for a walk");
		}
	}
	
	
	/*
	 * Write a method to print "Batch 9 is great" 5 times
	 */

	
	void print5Times() {
		
		for(int i=0; i<5; i++);{
			System.out.println("Batch 9 is great");
		}
		
	}
	
	
	/*
	 * create a method that takes 2 numbers as input
	 * and returns the greater number
	 */
	
	
	double greaterNumber(double num1, double num2) {
		
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	
	/*
	 * create a method that take a number 
	 * if number is even print "Even"
	 * else print "Odd"
	 */
	
     void evenOrOdd(int num) {
		
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	
	
	/*
	 * write a method that takes an array and returns the
	 * sum of the elements that are present in the array
	 */
     
     double returnTheArraySum(double [] arr) {
    	 double sum=0;
    	 for(double element: arr) {
    		 sum=sum+element;
    		 
    	 }
    	 return sum;
     }
	
	
	
	/*
	 * Write a method that returns true if a string is a mirror of itself
	 * otherwise it returns false
	 * 
	 * aba
	 * bbb
	 * bba
	 */
     
     boolean isMirror(String str) {
    	 String newStr="";
    	 
    	 for(int i=str.length()-1; i>=0; i--) {
    		 System.out.println(i+" "+str.charAt(i));
    		 newStr+=str.charAt(i);
    	 }
    	 System.out.println(newStr);
    	
    	 
    	 if(str.equals(newStr)) {
    		 return true;
    	 }else {
    		 return false;
    	 }
     }
     
     
	
	
	
	
}
