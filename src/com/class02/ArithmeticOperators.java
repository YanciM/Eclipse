package com.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=5;
		
		
		//    +,*,/,-,%
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int muti=num1*num2;
		int div=num1/num2;
		
		
		// sum of number 10 and 5 is = 15
		System.out.println("sum of number "+num1+" and "+num2+" is = "+sum);
		System.out.println("Sum of number 10 and 5 is = 15");
		
		double number1=10.99;
		double number2=90.99;
		
		double sumOfDouble=number1+number2;
		double subOfDouble=number1-number2;
		double divOfDouble=number2/number1;
		
		System.out.println("Result of division of 2 double values is  "+divOfDouble);
		
		float n1=10.99f;
		float n2=90.99f;
		
		float divOfFloat=n2/n1;
		
		System.out.println("Result of division of 2 float values is "+divOfFloat);
		
		
			//precedence()-->* & /--> + & -
		int result=(10+2)*5;
		System.out.println(result);
		
		//modulus operator--> shows remainder of division
		int mod=10%3;
		System.out.println("The remainder of 10 divided by 3 is ="+mod); //1
		
		int mod1=10%2;
		System.out.println("The remainder of 10 divided by 2 is = "+mod1); //0
		
		int mod2=15%4;
		System.out.println("The remainder of 15 divided y 4 is = "+mod2);  //3
		
		int r=(20%7)*3;
		System.out.println(r);  //18
		
		

	}

}
