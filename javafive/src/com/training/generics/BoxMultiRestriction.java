package com.training.generics;

public class BoxMultiRestriction<T extends Number & Comparable> {

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
