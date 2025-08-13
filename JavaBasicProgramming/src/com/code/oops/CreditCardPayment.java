package com.code.oops;

//Abstraction – hide details behind an interface
//Abstraction: PaymentMethod interface hides payment details.

public class CreditCardPayment implements PaymentMethod {
	
	public void pay(double amount)
	{
		System.out.println("Paid $" +amount+ " using Credit Card");
	}

}
