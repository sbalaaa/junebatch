package com.training.generics;

public class NumberBoxDemo {

	public static void main(String[] args) {

		//NumberBox<String> b = new NumberBox<>("Apple");
		//System.out.println(b.getObj());
		
		
		NumberBox<Float> f = new NumberBox<>(Float.valueOf(32.1F));
		System.out.println(f.getObj());
		
		NumberBox<Integer> i = new NumberBox<>(Integer.valueOf(1));
		System.out.println(i.getObj());

	}

}
