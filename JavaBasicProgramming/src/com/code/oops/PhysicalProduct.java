package com.code.oops;

//Inheritance: PhysicalProduct and DigitalProduct extend Product to reuse code.

public class PhysicalProduct extends Product {
	
	private double shippingWeight;
	
	public PhysicalProduct(String name, double price, double weight) 
	{
		super(name, price);
		this.shippingWeight = weight;
	}
	
	public double getShippingWeight()
	{
		return shippingWeight;
	}
	

}
