package com.class23.Hw2;

public class CreditCard {

    double balance;
    double interest;

    CreditCard(double balance){
        this.balance=balance;


    }
    public void calculateInterest(){
        interest=balance*0.30;
        System.out.println("Your interest is "+balance);
    }
}
class Visa extends CreditCard{

    Visa(double balance){
        super(balance);
    }
}
class AX extends CreditCard{
    AX(double balance){
        super(balance);
    }
    public void calculateInterest(){
        interest=balance*0.10;
        System.out.println("Your interest is "+balance);
    }
}
class Tester{
    public static void main(String[] args) {

        CreditCard obj1=new CreditCard(5000);
        obj1.calculateInterest();

        Visa obj2=new Visa(3000);
        obj2.calculateInterest();

        AX obj3=new AX(1000);
        obj3.calculateInterest();
    }
}
