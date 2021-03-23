package com.class13;

public class Account {

	String username;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;

	public void login(String passedUserNameWhenLogging, 
			String passedPasswordWhenLogging) {

		if (username.equals(passedUserNameWhenLogging) &&
				password.equals(passedPasswordWhenLogging)) {
			System.out.println("Welcome to Bank of America, your balance is " + 
				balance);
		} else {
			System.out.println("Username or Pw is not correct");
		}
	}

	public void printInfo() {

		if (isLoggedIn) {
			System.out.println("Your account number is " + accountNumber + 
					" your balance is " + balance);

		}
	}
		
	public void printUsernameAndPassword(String username, String password) {
		
		if(username.equals("Bryan")) {
			System.out.println("Hi Bryan");
			
		}else {
			System.out.println("Bye Bryan");
		}
		
	}

}
