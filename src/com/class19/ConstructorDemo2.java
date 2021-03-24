package com.class19;

public class ConstructorDemo2 {
	
	double bonus;
	double salary;
	String name;
	
	ConstructorDemo2(String name1){
		bonus=50000;
		salary=50000;
		this.name=name1;  //this.name lets java know we are using instance variable name, and not local variable
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo2 obj1=new ConstructorDemo2("Ram"); //This will get assigned to (String name1) and then saved to name..instance variable
		System.out.println(obj1.bonus);
		System.out.println(obj1.salary);
		System.out.println(obj1.name);
		
		
	}

}
