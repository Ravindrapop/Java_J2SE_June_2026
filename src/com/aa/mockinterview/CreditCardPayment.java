package com.aa.mockinterview;

public class CreditCardPayment extends Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹ "+amount+" Using Credit Card");
	}

}
