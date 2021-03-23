package com.class13;

public class Dog {

	
	public String breed;
	public String size;
	public String color;
	public int age;
	
	public void bark() {
		System.out.println("arff arff");
	}
	
	public void sleep() {
		System.out.println("ZZZzzzzzz....");
	}
	public void eat() {
		System.out.println("num num num....");
	}
	public void look() {
		System.out.println("Hi I am a dog, my color is "+color);
	}
	
	public static void main(String[] args) {
		
		Dog Bulldog=new Dog();
		Bulldog.breed="American Bulldog";
		Bulldog.size="Large";
		Bulldog.color="White & Black";
		Bulldog.age=3;
		Bulldog.bark();
		Bulldog.eat();
		Bulldog.sleep();
		Bulldog.look();		
		
		Dog Terrier=new Dog();
		Terrier.breed="Jack Russel";
		Terrier.size="Small";
		Terrier.color="White";
		Terrier.age=2;
		Terrier.look();
		
		Dog GermanShepard=new Dog();
		GermanShepard.breed="German Shepard";
		GermanShepard.size="Large";
		GermanShepard.color="White & Orange";
		GermanShepard.age=6;		
		
	}

	

}
