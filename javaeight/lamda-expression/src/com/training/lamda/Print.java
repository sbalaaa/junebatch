package com.training.lamda;

@FunctionalInterface
public interface Print {
	public void write(); // SAM
	//public void welcome();
	
	default void display() {
		
	}
	
	static void show() {
		
	}
}
