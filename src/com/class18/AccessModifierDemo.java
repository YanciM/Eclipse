package com.class18;

public class AccessModifierDemo {
	

	String name;
	private String bankAccountPassword;
	String sSNumber;
	
	
	public void park() {
		System.out.println("Everyone can go to a public park");
		}
	
	public void car() {
		System.out.println("My spouse can drive my car");
		}
	
	private void toothbrush() {
		System.out.println("No one can use my toothbrush!");
		}
	
	
	
	
	void printInfo() {
		System.out.println(name);
		System.out.println(bankAccountPassword);
		System.out.println(sSNumber);
		}


}
