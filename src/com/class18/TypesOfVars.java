package com.class18;

public class TypesOfVars {
	
	String name;
	static String companyName="Syntax";
	
	void printInfo() {
		System.out.println(name+" company "+companyName);
		}
	
	static void printCompanyInfo() {
		// System.out.println(name);                   CE...Java will get confused and not know what name to print out
		                                               //Non static variables such as, instance variable can not be used in static.
	}
	
	
	
	public static void main(String[] args) {
		
		TypesOfVars obj1=new TypesOfVars();
		obj1.name="Ram";
		
		TypesOfVars obj2=new TypesOfVars();
		obj2.name="Aiman";
		
	}

}
