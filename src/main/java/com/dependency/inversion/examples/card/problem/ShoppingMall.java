package com.dependency.inversion.examples.card.problem;

/***
 * The principle states that we must use abstraction (abstract classes and interfaces) instead of
 * concrete implementations. High-level modules should not depend on the low-level module but
 * both should depend on the abstraction.
 * Because the abstraction does not depend on detail but the detail depends on abstraction.
 * It decouples the software.
 *
 * “Depend on abstractions, not on concretions”
 *
 * To simplify this we can state that while designing the interaction between a high-level module
 * and a low-level one, the interaction should be thought of as an abstract interaction between them.
 */

/***
 * Here ShoppingMall only contains the credit card, if the customer ask for debit card
 * the entire class should be modified. (Replacing the Credit card with Debit card)
 *
 * And Credit card is tightly coupled with the Shopping Mall.
 *
 * We should implement in such way that the Shopping Mall supports any kind of cards with loose coupling.
 * That we can achieve through only interfaces or abstract classes
 */
public class ShoppingMall {

    private final CreditCard creditCard;

    public ShoppingMall(){
        creditCard = new CreditCard();
    }

    public void purchaseItem(long amount){
        creditCard.doTransaction(amount);
    }
}
