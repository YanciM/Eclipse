package com.class18;

public class Task1 {
	
	/*
	 * Create a method that will accept an array as parameters and will return a sum of all elements from that array. 
	 * Method should be visibly only within same package and accessible by the creating an instance of the class. 
	 */
	
	double sumArrayElements(double[]arr) {
		double sum=0;
		for(double element:arr) {
			sum+=element;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		Task1 obj1=new Task1();
		
		double[] arr= {10,20};
		System.out.println(obj1.sumArrayElements(arr));
		
		
	}

}
