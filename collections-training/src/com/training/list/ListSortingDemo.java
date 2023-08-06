package com.training.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingDemo {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();

		fruits.add("banana");
		fruits.add("orange");
		fruits.add("kiwi");
		fruits.add("apple");
		
	
		System.out.println("Before shorting");
		
		for(String s : fruits ) {
			System.out.println("Fruit name is: " + s);
		}
		
		Collections.sort(fruits);
		
		System.out.println("After shorting");
		
		for(String s : fruits ) {
			System.out.println("Fruit name is: " + s);
		}
		

	}

}
