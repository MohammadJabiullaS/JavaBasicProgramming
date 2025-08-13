package com.code.oops;

//Example: Mini E-Commerce System
//Encapsulation - keep data safe inside classes 
//Encapsulation: Product details are private, only accessible via getters.

public class Product {
	
	private String name;
	private double price;
	
	public Product(String name, double price) {
		
		if  (price < 0)throw new IllegalArgumentException("Price cannot be negative");
		this.name = name;
		this.price = price;
	}
	
	public String getname()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}

}
