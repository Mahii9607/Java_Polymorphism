package com.Poly;

public class Main {
	public static void main(String[] args) {
		 Electronics laptop = new Electronics("Dell", "High-performance laptop", 12000, 2, "Laptop");
	        Clothing shirt = new Clothing("Likra", "Casual shirt", 300, "M", "Blue", "Cotton" , "Shirt");

	        // Calculate discounts for products
	        double laptopDiscount = laptop.calculateDiscount();
	        double shirtDiscount = shirt.calculateDiscount();

	        // Display product information including discounted price
	        System.out.println("Electronics:");
	        laptop.displayProductInfo();
	        System.out.println("Discounted Price: $" + (laptop.price - laptopDiscount));
	        System.out.println();

	        System.out.println("Clothing:");
	        shirt.displayProductInfo();
	        System.out.println("Discounted Price: $" + (shirt.price - shirtDiscount));
	    }
	}

