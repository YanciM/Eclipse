package com.class19;

import java.util.Scanner;

public class ConstuctorsDemo {
	
	ConstuctorsDemo(){
		System.out.println("Constructor called");
	}
	
	int returnNumber() {
		return 18;
	}
	
	public static void main(String[] args) {
		
		ConstuctorsDemo obj=new ConstuctorsDemo();
		
		int var1=obj.returnNumber();
		
		
		
	}

}
