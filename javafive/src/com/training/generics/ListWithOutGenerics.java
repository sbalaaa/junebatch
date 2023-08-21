package com.training.generics;

import java.util.ArrayList;
import java.util.List;

public class ListWithOutGenerics {

	public static void main(String[] args) {
		List fruites = new ArrayList();
		fruites.add("apple");
		fruites.add("banana");
		fruites.add(new Integer(1));
		fruites.add(new Float(1));
		
		
		String firstFruit = (String) fruites.get(2);
		System.out.println(firstFruit);

	}

}
