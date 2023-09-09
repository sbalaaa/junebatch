package com.training.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrdicateDemo {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("kiwi");
		
		// filter the fruits which length is less than 5
		
		List<String> filteredFruits = fruits.stream().filter( s -> s.length() < 5).collect(Collectors.toList());
		
		filteredFruits.forEach(System.out::println);

	}

}
