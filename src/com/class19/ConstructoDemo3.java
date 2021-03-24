package com.class19;


public class ConstructoDemo3 {

	String name;
	double salary;
	double bonus;
	int numberOfDaysWorked;
	double bonusPercentage;

	ConstructoDemo3(String name, double salary, int numberOfDaysWorked, double bonusPercentage) {

		this.name = name;
		this.salary = salary;
		this.bonus = 1000;
		this.numberOfDaysWorked = numberOfDaysWorked;
		this.bonusPercentage = bonusPercentage;
	}

	void printBonus() {
		if (numberOfDaysWorked > 300) {
			bonus = 1000;
     } else {
			bonus = 500;
       }
	}

	public static void main(String[] args) {

		ConstructoDemo3 RamObj = new ConstructoDemo3("Ram", 100000, 300, 100);
		System.out.println(RamObj.name);
		System.out.println(RamObj.salary);
		System.out.println(RamObj.bonus);
		System.out.println(RamObj.numberOfDaysWorked);
		System.out.println(RamObj.bonusPercentage);
		RamObj.printBonus();
		System.out.println(RamObj.name);
		System.out.println(RamObj.salary);
		System.out.println(RamObj.bonus);
		System.out.println(RamObj.numberOfDaysWorked);
		System.out.println(RamObj.bonusPercentage);
	}

}
