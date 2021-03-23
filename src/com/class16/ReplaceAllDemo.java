package com.class16;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		
		String var1="Syntax is best3434. Batch nine is great.";
		System.out.println(var1.replace("3434", ""));   //removes numbers by replacing 3434 with nothing
		
		var1="3348489499cjdjnhcm";
		System.out.println(var1.replaceAll("[0-9]", ""));  //removes all numbers even if we dont know the numbers
		System.out.println(var1.replaceAll("[a-zA-Z]", ""));   //removes all letters as well
		
		var1="987837873dchbSSdGDHSsjc@#$%!@#$";
		System.out.println(var1.replaceAll("[^a-z]", " ")); // ^means everything that is not a-z replace with space/remove
		System.out.println(var1.replaceAll("[^A-Z]", ""));  // removes all that are not capital letters A-Z
		
		
		
		

	}

}
