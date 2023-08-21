package com.training.generics;

public class Box<T> {

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
