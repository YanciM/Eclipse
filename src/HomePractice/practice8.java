package HomePractice;

import java.util.Scanner;

public class practice8 {
	
	 public static void main(String[] args) {
		 
		 /*
		  * Write code that will take in a String input and check to see if it is a palindrome or not.                            //Your check should be case insensitive too. 
		  * A palindrome means that the characters are the same forwards and backwards, ignoring spaces.                          //For example, "Bob" is a palindrome, despite the first B being capitalized.
		  * Examples of palindromes:
		  * racecar
          * was it a car or a cat I saw
          * never odd or even
          * rats live on no evil star 
		  */
		 
		    Scanner input = new Scanner(System.in);
		    System.out.print("In:");
		    String givenString = input.nextLine();
		   	//write your code below
		   	String replaceAllStr=givenString.replaceAll("\\s","").toLowerCase();

		     boolean tOrF=false;

		     int i=0;
		     int j=replaceAllStr.length()-1;

		     while(i<=j){
		       if(replaceAllStr.charAt(i)==replaceAllStr.charAt(j)){
		            tOrF=true;
		       }else{
		         break;
		       }
		       i++;
		       j--;
		     }
		     System.out.println(tOrF);

}
}
