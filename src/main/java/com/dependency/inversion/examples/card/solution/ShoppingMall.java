package com.dependency.inversion.examples.card.solution;

/***
 * Here ShoppingMall supports any kind of card which implements the BankCard.
 */
public class ShoppingMall {

    private final BankCard bankCard;

    public ShoppingMall(BankCard bankCard){
        this.bankCard = bankCard;
    }

    public void purchaseItem(long amount){
        bankCard.doTransaction(amount);
    }
}
