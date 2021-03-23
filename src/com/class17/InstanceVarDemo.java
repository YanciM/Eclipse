package com.class17;

public class InstanceVarDemo {
	
	String name= "Yanci";
	int age=26;
	void ptintInfo() {
		
		/*
		 * If I am inside the same class and my method is not static
		 * I can use my instance variable directly
		 */
		double salary=120000;
		System.out.println(salary);
		System.out.println(name+" "+age);
	}

}
