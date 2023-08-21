package com.training.generics;

public class BoxRestriction<T extends Number> {

	private T obj;
	

	public void setObj(T o) {
		this.obj = o;
	}
	
	public T getObj() {
		return obj;
	}
	
	public void displayObjectDetails() {
		System.out.println("The type of object: " + obj.getClass().getName());
	}
	
}
