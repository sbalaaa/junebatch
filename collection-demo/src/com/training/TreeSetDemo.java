package com.training;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		//HashSet<String> fruits = new HashSet<String>();
		Set<String> fruits = new TreeSet<>();
		
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
