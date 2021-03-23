package com.class10;

public class AllElementsFromAnArrayUsingIfElse {
	public static void main(String[] args) {

		int[] numbers = { 10, 14, 78, 5, 90, };

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + " ");
			}

		}
		
		
		System.out.println("--------------------------------------------------------");
		
		
int[] number= {10, 14, 78, 5, 90, };
		
		for(int num:number) {
			
			if(num%2==0) {
				System.out.print(num+" ");
			}
			
			
		
		}

	}

}
