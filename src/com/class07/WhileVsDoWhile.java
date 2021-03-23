package com.class07;

public class WhileVsDoWhile {
	public static void main(String[] args) {
		
		int num=6;
		
		while(num<=5) {     // while loop is used more in programming compared to do while!!!!
			System.out.println(num);
			num++;
		}
		
		System.out.println("-----------------Do while-----------------");
		
		int num1=6;
		
		do {
			System.out.println(num1);
			num1++;
		}while(num1<=5);
		
		/*
		 * while: first checks the condition
		 * do: first executes, then checks condition
		 * 
		 * Even when condition is false, do will execute code at least once
		 */
	}

}
