package com.training.generics;

public class NonGenericBoxTest {

	public static void main(String[] args) {
		NonGenericBox box = new NonGenericBox();
		box.setObj(1);
		Float i = (Float) box.getObj();
		
		NonGenericBox string = new NonGenericBox();
		box.setObj("hello");
		String s = (String) box.getObj();

	}

}
