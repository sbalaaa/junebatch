package com.training.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("kiwi");
		//fruits.add(new Employee());
		
		for(String s : fruits ) {
			System.out.println("Fruit name is: " + s);
		}


	}

}
