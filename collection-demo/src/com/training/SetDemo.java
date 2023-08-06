package com.training;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		//HashSet<String> fruits = new HashSet<String>();
		Set<String> fruits = new HashSet<>();
		
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
