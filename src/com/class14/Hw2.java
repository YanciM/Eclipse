package com.class14;

public class Hw2 {
	
	/*
	 * Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
	 * score > 90 - A
     * score >80 - B
     * score >70 - C
     * score > 50 - D
     * anything else - F  
	 */
	
	String getGrade(int grade) {
		
		if(grade>=90) {
			return "A";
					
		}else if(grade>=80) {
			return "B";
			
		}else if(grade>=70) {
			return "c";
			
		}else if(grade>=50) {
			return "D";
			
		}else {
			return "f";
		}
	}
	
	

}
