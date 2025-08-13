package com.code.oops;

//Inheritance: PhysicalProduct and DigitalProduct extend Product to reuse code.

public class DigitalProduct extends Product{
	
	private double fileSizeMB;
	
	public DigitalProduct(String name, double price, double fileSizeMB)
	{
		super(name, price);
		this.fileSizeMB = fileSizeMB;
	}
	
	public double getFileSizeMB()
	{
		return fileSizeMB;
	}

}
