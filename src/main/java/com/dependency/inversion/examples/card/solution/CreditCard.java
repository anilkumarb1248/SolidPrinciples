package com.dependency.inversion.examples.card.solution;

public class CreditCard implements BankCard {

    @Override
    public void doTransaction(long amount){
        // Do credit card transaction
    }
}
