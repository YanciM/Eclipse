package com.class17;

public class StringBuilderVsString {
	
	public static void main(String[] args) {
		
		String var1="Meerim";
		String var2="Meerim";
		String var3="Meerim";
		String var4="Meerim";  //recommended 
		String var5=new String("Angelo");  //not recommended
		var4="Ram";
		
		StringBuilder sb1=new StringBuilder(var1);
		StringBuilder sb2=new StringBuilder("Azizi");
		StringBuilder sb3=new StringBuilder("Afzal");
		StringBuilder sb4=new StringBuilder("MJ");
		
		System.out.println(sb1.reverse());
		var1=sb1.toString();
		
		
		
		
	}

}
