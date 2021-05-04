package com.class30.Hw;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {

        LinkedList<Card> linkedList=new LinkedList<>();
        linkedList.add(new CreditCard("Credit card"));
        linkedList.add(new DebitCard("Debit card"));
        linkedList.add(new PrepaidCard("Prepaid card"));

        for (Card card : linkedList) {
            card.issueCard();
            card.calculateInterest();
        }
    }
}
