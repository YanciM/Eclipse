package com.class10;

public class Task2 {
	public static void main(String[] args) {

		String[] names = new String[6];

		names[0] = "Amy";
		names[1] = "Iqra";
		names[2] = "Yanci";
		names[3] = "Jose";
		names[4] = "Mahamaed";
		names[5] = "Steven";

		System.out.println(names[2]);

		System.out.println("---------------------------2nd Way-------------------------------");

		String[] names2 = { "Amy", "Iqra", "Yanci", "Jose", "Mahamed", "Steven" };
		System.out.println(names2[2]);

		System.out.println("-----------------------------------------------------------------");

		String[] words = { "Java", "Saturday", "Day", "coding", "is" };
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);

	}
}
