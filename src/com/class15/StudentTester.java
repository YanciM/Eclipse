package com.class15;

public class StudentTester {

	public static void main(String[] args) {
		
		Student ramObj=new Student();  //creating an object 
		ramObj.name="Ram";
		ramObj.age=25;
		ramObj.studentId="cs123";
		ramObj.schoolName="Syntax";
		ramObj.study();
		ramObj.payTuition();
		
		Student aimenObj=new Student();
		aimenObj.name="Aimen";
		aimenObj.age=26;
		aimenObj.studentId="cs456";
		aimenObj.schoolName="Syntax";
		aimenObj.study();
		aimenObj.payTuition();
		
		System.out.println(aimenObj.name+" is "+aimenObj.getStudentAge()+" years old");
	}

}
