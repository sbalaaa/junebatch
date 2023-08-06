package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		/*int[] i = {10,20,25};
		
		for(int k:i) {
			System.out.println(k);
		}
		*/
		
		//ArrayList<String> fruits = new ArrayList<String>();
		//List<String> fruits = new ArrayList<String>();
		List<String> fruits = new ArrayList<>();
		
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("orange");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		
		//Integer i = Integer.valueOf(10);
		//fruits.add(i);
		
		Collections.sort(fruits);
		
		for(String f:fruits) {
			System.out.println(f);
		}
		
		boolean isExist = fruits.contains("papaya");
		System.out.println("is exist   " + isExist);
		
		boolean isEmpty = fruits.isEmpty();
		System.out.println("is empty   " +  isEmpty);
		
		int size = fruits.size();
		System.out.println("size is " +  size);
		
	}

}
