package com.m3.training.inventory;

public class Item {
	String id;
	String description;
	Integer quantity;
	double price;
	boolean recalled;
	
	Item(String id, String description, Integer quantity) {
		this.id = id;
		this.description = description;
		this.quantity = quantity;
		recalled = false;
		
		
		
	}

}
