package com.class17;

public class ConvertingBetweenSbAndString {
	public static void main(String[] args) {
		
		String var1="Nelson";
		StringBuilder sb1=new StringBuilder(var1);
		sb1.reverse();
		var1=sb1.toString();
		System.out.println(var1);
	}

}
