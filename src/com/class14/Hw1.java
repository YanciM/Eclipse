package com.class14;

public class Hw1 {
	
	//Create a method that will say Hello in different language based on the country that will passed when method is executed.
	
	String countries (String country) {
		
		if(country.equals("USA")) {
			return "Hello";
			
		}else if(country.equals("China")) {
			return "Ni hao";
			
		}else if(country.equals("France")) {
			return "Bonjour";
			
		}else if(country.equals("El Salvador")) {
			return "Hola";
		}
		return country;
		
	}

}
