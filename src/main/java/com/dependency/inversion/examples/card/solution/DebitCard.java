package com.dependency.inversion.examples.card.solution;

public class DebitCard  implements BankCard{

    @Override
    public void doTransaction(long amount){
        // Do debit card transaction
    }
}
