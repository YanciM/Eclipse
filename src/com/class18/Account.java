package com.class18;

public class Account {

	public double actualAccountBalance;
	private String actualUserName;
	private String actualPassWord;

	public boolean login(String enteredUserName, String enteredPassWord) {
		return enteredUserName.equals(actualUserName) && enteredPassWord.equals(actualPassWord);
	}

	public boolean sighnUp(String enteredUserName, String enteredPassWord, double enteredBalance) {
		if (enteredUserName.length() > 15) {
			return false;
		} else {
			actualUserName = enteredUserName;
			actualPassWord = enteredPassWord;
			actualAccountBalance = enteredBalance;
			return true;
		}
	}

	void transferFunds(String password, double enteredAccountBalace) {
		double enteredAccountBalance = 0;
		if (password.equals(actualPassWord) && enteredAccountBalance <= actualAccountBalance) {
			actualAccountBalance = actualAccountBalance - enteredAccountBalance;

		}
	}

}
