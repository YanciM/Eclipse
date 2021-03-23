package com.class11;

public class Task3 {
	public static void main(String[] args) {
		  
		
		/*
		 * Create 2D array of cars : american, german, korean, italian. 
		 * Then retrieve all values from that array using 2 different loops
		 */
		
		String[][] cars= {
				{"Ford", "Jeep", "Cheverolet", "Buic"},
				{"BMW", "Audi", "Porsche", "Volkswagon"},
				{"Kia", "Hyundai", "Daewoo", "Genesis"},
				{"Fiat", "Maserati", "Ferrari", "Lamboghini"}
				
		};
		for(int r=0; r<cars.length; r++) {
			for(int c=0; c<cars[r].length; c++) {
				System.out.print(cars[r][c]+"  ");
			}
			System.out.println();
			
			
			
			
		}
		System.out.println("------2nd way----------");
		
		for(String[] a:cars) {
			for(String b:a) {
				System.out.print(b+"  ");
			}
		System.out.println();
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		
		/*
		 * Using 2D array create a grocery list.
		 * Inside you should have an array of veggies, fruits, dairy and sweets. 
		 * Retrieve all values from that array using 2 different loops
         */
		
		String[][] grocery= {
				
				{"Carrots","Brocolli","Onion","Potato"},
				{"Apple","Orange","Grapes","Pears","Peaches"},
				{"Milk","Cheese","Yogurt"},
				{"Candy","Chocolate","Ice Cream","Dougnuts","Pie"}
				
		};
		
		for(int r=0; r<grocery.length; r++) {
			for(int c=0; c<grocery[r].length; c++) {
				System.out.print(grocery[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----2nd way-----");
		
		for(String[] str:grocery) {
			for(String str1:str) {
				System.out.print(str1+" ");
			}
			System.out.println();
		}
	}
}
