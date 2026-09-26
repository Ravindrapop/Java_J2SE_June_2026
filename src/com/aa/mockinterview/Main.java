package com.aa.mockinterview;

public class Main {
	public static void main(String[] args) {
		
		Payment payment = new CreditCardPayment();
		payment.pay(15000);
		Payment payment1 = new Payment();
		payment1.pay(10000);
		CreditCardPayment creditCardPayment = new CreditCardPayment();
		creditCardPayment.pay(1000);
	}

}
