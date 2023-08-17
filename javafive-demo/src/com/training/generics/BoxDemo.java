package com.training.generics;

public class BoxDemo {

	public static void main(String[] args) {

		Box<String> b = new Box<>("Apple");
		System.out.println(b.getObj());
		
		Box<Integer> i = new Box<>(Integer.valueOf(1));
		System.out.println(i.getObj());

	}

}
