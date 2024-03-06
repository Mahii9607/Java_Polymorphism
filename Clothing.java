package com.Poly;

public class Clothing extends Product{

	String size;
	String color;
	String material;
	
	public Clothing(String name , String description , int price , String Size , String color,String material, String size) {
		super(name , description , price);
		this.size = size;
		this.color = color;
		this.material = material;
	}
	 @Override
	    public double calculateDiscount() {
	        
	        if (size.equals("M") && color.equals("Blue")) {
	            return 0.2 * price; 
	            }
	        else {
	            return 0; 
	        }
	    }
	}

