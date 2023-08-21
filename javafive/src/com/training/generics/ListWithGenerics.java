package com.training.generics;

import java.util.ArrayList;
import java.util.List;

public class ListWithGenerics {

	public static void main(String[] args) {
		List<String> fruites = new ArrayList<>();
		
		fruites.add("apple");
		fruites.add("banana");
		//fruites.add(new Integer(1));
		//fruites.add(new Float(1));
		
		String firstFruit = fruites.get(0);
		System.out.println(firstFruit);
		
		
		

	}

}
