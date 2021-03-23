package com.class14;

public class MoreMethodsTester {

	public static void main(String[] args) {
		
		MoreMethodExamples obj1=new MoreMethodExamples();
		
			System.out.println(obj1.print());
			
			
			
			System.out.println(obj1.doubleTheValue(10));
			
			
			obj1.isRaining(true);	

			
			obj1.print5Times();
			
		  System.out.println(obj1.greaterNumber(12,15));
		  
		obj1.evenOrOdd(7);
		
		
		double[]arr= {10,20,30,40};
		System.out.println(obj1.returnTheArraySum(arr));
		
		
		
System.out.println(obj1.isMirror("aba"));
System.out.println(obj1.isMirror("abcdef"));
	}

}
