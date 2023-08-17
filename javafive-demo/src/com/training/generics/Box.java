package com.training.generics;

public class Box<T> {
	
	T obj;
	
	public Box() {
		
	}
	
	public Box(T obj) {
		super();
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}
