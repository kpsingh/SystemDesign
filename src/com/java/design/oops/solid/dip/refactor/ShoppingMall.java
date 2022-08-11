package com.java.design.oops.solid.dip.refactor;

public class ShoppingMall {

	IPaymentCard card;

	public ShoppingMall(IPaymentCard card) {
		this.card = card;

	}

	public void doPurchase(long amount) {
		card.doTransaction(amount);
	}

	public static void main(String[] args) {

		// DebitCard debitCard=new DebitCard();
		// CreditCard creditCard=new CreditCard();

		IPaymentCard bankCard = new CreditCard();

		/*
		 * now we can use any payment method to do the transaction and ShoppingMall is
		 * not tightly couples with any card type, it can use the any card.
		 */

		ShoppingMall shoppingMall = new ShoppingMall(bankCard);
		shoppingMall.doPurchase(5000);

	}

}
