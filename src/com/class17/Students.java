package com.class17;

public class Students {

	/*
	 * Create a Class called Student Create three variables studentName , studentID
	 * and numberOfStudents Create three objects of the Students Class Set the value
	 * for studentName , studentID and increment the numberOfStudents for each
	 * object Print out total number of students
	 */

	String studentName;
	String studentID;
	static int numberOfStudents;

	public static void main(String[] args) {
		Students obj1 = new Students();
		obj1.studentID = "A123";
		obj1.studentName = "Yanci";
		numberOfStudents++; //obj1.numberOfStudents++... not needed since numberOfStudents is already static in class method... It will increment each student
		
		Students obj2 = new Students();
		obj2.studentID = "B456";
		obj2.studentName = "Bella";
		numberOfStudents++;
		
		Students obj3 = new Students();
		obj3.studentID = "C789";
		obj3.studentName = "Eleni";
		numberOfStudents++;
		
		System.out.println("Total number of students is "+numberOfStudents);
	}

}
