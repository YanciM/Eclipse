package com.class11;

public class GroupHw4 {

	public static void main(String[] args) {

		/*
		 * Create 2D array of countries: north america countries, south america
		 * countries, europe countries, asian countries, african countries. Then print
		 * all values from that array using 2 different loops and calculate how many
		 * total countries have been stored.
		 * 
		 */

		int count = 0;
		String[][] countries = {

				{ "United States", "Canada", "Mexico", "Cuba", "El Salvador" },
				{ "Brazil", "Argentina", "Colombia", "Peru", "Chile" },
				{ "Germany", "France", "Italy", "United Kingdom", "Netherlands" },
				{ "Japan", "Indonesia", "China", "India", "Thailand" },
				{ "South Africa", "Nigeria", "Ghana", "Kenya", "Ethiopia" } };

		for (int r = 0; r < countries.length; r++) {

			for (int c = 0; c < countries[r].length; c++) {
				System.out.print(countries[r][c] + " ");
				count++;
			}
			System.out.println();
		}

		System.out.println("-----------------2nd Way-----------------");
		for (String[] str : countries) {
			for (String str1 : str) {
				System.out.print(str1 + " ");
			}
			System.out.println();
		}

		System.out.println("-----------------------------------------------");
		System.out.println(count + " countries have been stored.");

	}

}
