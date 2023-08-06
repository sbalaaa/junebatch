package com.training;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		//HashSet<String> fruits = new HashSet<String>();
		Set<String> fruits = new LinkedHashSet<>();
		
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		

		
		
		for(String f:fruits) {
			System.out.println(f);
		}
		
		
	}

}
