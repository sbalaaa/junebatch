package com.training.generics;

import java.util.ArrayList;
import java.util.List;

public class ListNonGenericsDemo {

	public static void main(String[] args) {

		List fruits = new ArrayList();

		fruits.add("banana");
		fruits.add("orange");
		fruits.add("kiwi");
		Integer i = Integer.valueOf(10);
		fruits.add(i);
		
		Integer first = (Integer)fruits.get(0);
		System.out.println(first);
		

	}

}
