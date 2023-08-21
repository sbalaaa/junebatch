package com.training.generics;

public class BoxTest {

	public static void main(String[] args) {
		Box<Integer> intObj = new Box<Integer>();
		intObj.setObj(1);
		Integer i = intObj.getObj();
		
		Box<String> strObj = new Box<String>();
		strObj.setObj("Hello");
		String s = strObj.getObj();

	}

}
