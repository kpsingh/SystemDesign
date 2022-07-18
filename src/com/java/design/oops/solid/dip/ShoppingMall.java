package com.java.design.oops.solid.dip;

public class ShoppingMall {

	DebitCard card;

	public ShoppingMall(DebitCard card) {
		this.card = card;

	}

	public void doPurchase(long amount) {
		card.doTransaction(amount);
	}

	public static void main(String[] args) {
		/*
		 * This class is tightly coupled with Debit Card. Suppose if new payment link
		 * Credit Card then it will be a problem.
		 * 
		 * 
		 * If I want a credit card then it is problem sicne the ShoppingMall constructor expecting the
		 * Debit card instance not the credit card.
		 */

		DebitCard card = new DebitCard();

		ShoppingMall mall = new ShoppingMall(card);
		mall.doPurchase(1500);

	}

}
