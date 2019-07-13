package com.m3.training.inventory;

public class RecalledItem extends Item {
	Boolean recalled;
	Boolean available;
	
	public RecalledItem() {
		super(description, description, quantity);
		recalled = true;
		available = false;
		
	}

}
