package com.class23.Overriding;

public class Bank {

    void chargeTransferFee(double amount){
        System.out.println("Your fee is "+amount*0.02);
    }
}

class BankOfAmerica extends Bank{
    @Override
    void chargeTransferFee(double amount){
        System.out.println("Your fee is "+amount*0.05);
    }
}

class Chase extends Bank {
    void chargeTransferFee(double amount){
        System.out.println("Your fee is "+amount*0.03);
    }
}

class Citizen extends Bank{

}