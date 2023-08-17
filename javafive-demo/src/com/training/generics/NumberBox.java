package com.training.generics;

public class NumberBox<T extends Number> {
	
	T obj;
	
	public NumberBox() {
		
	}
	
	public NumberBox(T obj) {
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
