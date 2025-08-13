package com.code.oops;

public class ECommerceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product laptop = new PhysicalProduct("Laptop", 1200.0, 2.5);
		Product ebook = new DigitalProduct("Book of Eli", 25.0, 5.0);
		
		Checkout checkout = new Checkout();
		
		//Pay uisng Credit Card
		checkout.processOrder(laptop, new CreditCardPayment());
		
		//Pay using UPI
		checkout.processOrder(ebook, new UpiPayment());
	}

}
