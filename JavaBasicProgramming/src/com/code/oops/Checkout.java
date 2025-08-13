package com.code.oops;

//Polymorphism – one call works for different implementations
//Polymorphism: processOrder() works with any payment method without changing its code.


public class Checkout {
	
	public void processOrder(Product product, PaymentMethod paymentMethod)
	{
		System.out.println("Ordering: "+ product.getname()+ "-$" +product.getPrice());
		paymentMethod.pay(product.getPrice());
		System.out.println("Order Completed");
	}

}
