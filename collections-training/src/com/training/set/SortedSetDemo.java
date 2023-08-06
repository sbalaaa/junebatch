package com.training.set;

import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		names.add("Jawith");
		names.add("Bharani");
		names.add("Velraj");
		names.add("Arivu");
		names.add("Arivu");
		names.add("Arivu");
		names.add("Arivu");
		names.add("Abraham");
		
		for(String s : names ) {
			System.out.println(" name is: " + s);
		}
	}
}
