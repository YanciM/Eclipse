package reviewclass3;

import java.util.Scanner;

public class LogicalOperators4 {

	public static void main(String[] args) {
		 

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your password");
		String pass=scan.next();
		
		if(pass.equals("pass123")) {
			System.out.println("Enter true to check your balance and false to close the app");
			boolean nextOp=scan.nextBoolean();
			
			if(nextOp) {
				System.out.println("Hello this is Zhana");
				
			}else {
				System.out.println("Application closed");
			}
			
			
		         
		}else {
			System.out.println("Password is incorrect");
		}

	}

}
