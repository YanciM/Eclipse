package com.class11;

public class GroupHw8 {

	public static void main(String[] args) {
		
		//Maximum and minimum number in the array?
		
		int[] largeArray = { -9,158698, 564,-1, 7894, 10, 50, 5 };
		int smallest=largeArray[0];
		int largest=largeArray[0];
		
		for(int i=1; i<largeArray.length; i++) {
			
			if(largeArray[i]<smallest) {
				smallest=largeArray[i];
			}
			if(largeArray[i]>largest) {
				largest=largeArray[i];
			}
		}
		
		System.out.println(smallest+" is minimum number in the array");
		System.out.println(largest+" is maximum number in the array");
		
	


	}

}
