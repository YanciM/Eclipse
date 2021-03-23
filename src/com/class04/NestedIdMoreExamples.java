package com.class04;

public class NestedIdMoreExamples {

	public static void main(String[] args) {
		
		/*
		 * If it's Friday--->go to the movies, otherwise stay at home and study
		 * If it's Friday, then I will check if day is the 13---->if yes---->watch scary movie
		 *                   If no---> watch any movie you like
		 */
		
		
		boolean isFriday=false;
		int day=13;
		
		
		if(isFriday) {
			System.out.println("Its a movie day!!!");
			
			if(day==13) {
				System.out.println("I will watch a scary movie");
			}else {
				System.out.println("Ill watch any available movie");
			}
			
		}else {
			System.out.println("I will stay at home and study Java");
		}
		
		System.out.println("--------------------------Example 2------------------------------");
		
		/*
		 * Check assignment and based on the score, we display a message
		 */
		
		boolean completed=true;
		int score=88;
		
		
		if(completed) {
			
			if(score>90) {
				System.out.println("Great job");
			}else if (score>80) {
				System.out.println("Good job");
			}else if (score>70) {
				System.out.println("Good, but lets try to do better");
			}else {
				System.out.println("Good for trying, but study more!!!");
			}
			
		}else {
			System.out.println("Please make sure to complete all assignments on time");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
