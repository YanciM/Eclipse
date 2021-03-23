package reviewclass3;

import java.util.Scanner;

public class LogicalOperators3 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your password");
		String pass=scan.next();
		
		
		// incorrect way of doing
		System.out.println("Enter the amount of money that you want to transfer");
		double transferAmount=scan.nextDouble();
		
		if(pass.equals("pass123") && transferAmount<1000) {
			System.out.println("Amount transffered");
			
		}else {
		System.out.println("Either you pa is not correct or you dont have enough balance");
		}
		
		
		
		
		System.out.println("----------------------------------------------------------------------");
		
		
		if(pass.equals("pass123")) {
			System.out.println("Enter the amount that you want to transfer");
		           transferAmount=scan.nextDouble();
		           
		           if(transferAmount<1000) {
		        	   System.out.println("Amount transferred");
		        	   
		           }else {
		        	   System.out.println("Not enough balance");
		        	   
		           }
			
		}else {
			System.out.println("Password is incorrect");
		}
	}

}
