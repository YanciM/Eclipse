package com.class17;

public class Employee {
	
	
	/*
	 * Create a Class called Employee:Create three  variables  empID , salary and set the CEO to "Sumair" 
	 * Create two objects of the class Employee Set the value of eID, salary 
	 * for each of the objectsPrint out the eID , salary and  CEO for each of the objects
	 */
	
	String emId;
	int salary;
	static String ceo="Sumair";
	
	public static void main(String[] args) {
		
		Employee obj1=new Employee();
		obj1.emId="A12345";
		obj1.salary=75000;
		System.out.println(obj1.emId+" "+obj1.salary+" "+ceo);
		
		Employee obj2=new Employee();
		obj2.emId="B12345";
		obj2.salary=80000;
		System.out.println(obj2.emId+" "+obj2.salary+" "+ceo);
		
		
		
	}
	
	
	

}
