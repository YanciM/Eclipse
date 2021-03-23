package com.class17;

public class InstanceVariablesDemo {
	
	//Instance variables are variables which are declared inside a class, but outside of a method, constructor or any block of code.
	// Instance variables can be accessed anywhere inside a class by directly calling them using their names
	//We can not access them inside a static method by directly calling their names,
	//but we can access them by creating an object of that class
	
	int number=10; //instance variable
	void printNumber() {
		System.out.println(number);
		String name="Asghar";
	}
	
	void printNumber2() {
		System.out.println(number);
		//System.out.println(name);  CE ...Can not access, because it is a local variable
	}
	
	public static void main(String[] args) {
		
		InstanceVariablesDemo obj=new InstanceVariablesDemo();
		System.out.println(obj.number);
		
	}

}
