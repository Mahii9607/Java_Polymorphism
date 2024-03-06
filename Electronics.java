package com.Poly;

public class Electronics extends Product {

	int warrantyPeriod;
	String brand;
	
	
	public Electronics(String name , String description , int price ,int warrantyPeriod ,String brand) {
		super(name , description , price);
		this.warrantyPeriod = warrantyPeriod;
		this.brand = brand;
		
	}
	
	public double calculateDiscount() {
		return 0.1 * price;
	}

}
