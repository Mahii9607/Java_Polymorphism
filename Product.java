package com.Poly;

public class Product {

	String name;
	String description;
	int price;
	
	public Product(String name , String description , int price) {
		this.name = name;
		this.description = description;
		this.price = price;
		
	}
	
	public double calculateDiscount() {
		return 0;
		
	}
	public void displayProductInfo() {
		System.out.println("Name: " + name);
		System.out.println("Description: " + description);
		System.out.println("Price: " + price);
	}
	
	
}
