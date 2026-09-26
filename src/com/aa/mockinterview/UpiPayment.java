package com.aa.mockinterview;

public class UpiPayment extends Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹"+amount+" Using UPI");
	}

}
