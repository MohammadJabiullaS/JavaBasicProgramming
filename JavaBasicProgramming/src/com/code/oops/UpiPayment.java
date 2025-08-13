package com.code.oops;

//Abstraction – hide details behind an interface
//Abstraction: PaymentMethod interface hides payment details.

public class UpiPayment implements PaymentMethod {
	
	public void pay(double amount)
	{
		System.out.println("Paid ₹"+ amount + "using UPI");
		
	}

}
