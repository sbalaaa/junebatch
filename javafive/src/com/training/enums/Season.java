package com.training.enums;

public enum Season  {
	
	WINTER(10), SUMMER(20), RAINING(30);
	
	private int id;
	
	Season(int n) {
		this.id = n;
	}

	public int getId() {
		return id;
	}
	
   

}
