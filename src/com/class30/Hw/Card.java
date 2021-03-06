package com.class30.Hw;

public abstract class Card {

    String creditCardType;

    Card(String creditCardType){
        this.creditCardType=creditCardType;
    }

    abstract void calculateInterest();
    public void issueCard(){
        System.out.println(creditCardType+" issued");
    }
}
class CreditCard extends Card{

    CreditCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("Interest is 15%");
    }
}
class DebitCard extends Card{

    DebitCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("Interest is 0, but has a fee of $20.00");
    }
}
class PrepaidCard extends Card{

    PrepaidCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("Must pay upfront");
    }
}
