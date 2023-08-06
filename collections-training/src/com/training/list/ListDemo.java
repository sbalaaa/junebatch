package com.training.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		//ArrayList<String> fruits = new ArrayList<String>();
		//List<String> fruits = new ArrayList<String>();
		List<String> fruits = new ArrayList<>();
		
		//fruits.add("apple");
		//fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("kiwi");
		//fruits.add(5,"berry");
		
		//fruits.add(new Integer(10));
		
		
		/*for(String s : fruits ) {
			System.out.println("Fruit name is: " + s);
		}
		
		System.out.println("Fruit at first index: " + fruits.get(0));*/

		
		if( fruits.contains("apple")) {
			System.out.println("I have apple");
		} else {
			System.out.println("I do not have apple");
		}
		
		System.out.println("fruit size is " + fruits.size());
		
		//new Employee();

	}

}
