package com.class28.encapsulation;

public class BankAccountTester {
    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount("123","abc","123",1000);
        bankAccount.login("abc","123");
        System.out.println(bankAccount.getBalance("abc","123"));
    }
}
