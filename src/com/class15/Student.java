package com.class15;

public class Student {
	
	String name;
	int age;
	String studentId;
	String schoolName;
	void study() {
		System.out.println(name+" studies in "+schoolName);
	}
	void payTuition() {
		System.out.println(name+" pays the tuition");
	}
	
	int getStudentAge() {
		return age;
	}

}
