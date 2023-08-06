package com.training.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		boolean isExist;
		Set<String> fruits = new HashSet<>();
		isExist = fruits.add("apple");
		System.out.println("First Time " + isExist);
		isExist = fruits.add("apple");
		System.out.println("Second Time " + isExist);
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("kiwi");
		//fruits.add(new Employee());
		
		for(String s : fruits ) {
			System.out.println("Fruit name is: " + s);
		}


	}

}
