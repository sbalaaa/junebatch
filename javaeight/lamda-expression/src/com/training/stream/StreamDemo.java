package com.training.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("banana");
		
		List<String> upperFruits = new ArrayList<>();
		for(String fruit: fruits) {
			upperFruits.add(fruit.toUpperCase());
			System.out.println(fruit);
		}
		
		/*List<String> lamdaUpperFruits = fruits.stream().map(e -> {
			return e.toUpperCase();
		}).collect(Collectors.toList());*/
		
		//List<String> lamdaUpperFruits = fruits.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
		
		List<String> lamdaUpperFruits = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		//fruits.forEach( e -> System.out.println(e));
		fruits.forEach(System.out::println);

	}

}
