package com.training.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMapExample obj = new HashMapExample();
		Map<String,List<String>> animals = obj.getAnimals();
		
		List<String> domestics = animals.get("d");
		
		for(String a : domestics) {
			System.out.println(a);
		}

	}
	
	
	List<String> getWildAnimals() {
		List<String> wild = new ArrayList();
		wild.add("Lion");
		wild.add("Tiger");
		return wild;
	}
	
	List<String> getDomesticAnimals() {
		List<String> domestic = new ArrayList();
		domestic.add("Cow");
		domestic.add("Cat");
		return domestic;
	}
	
	Map<String,List<String>> getAnimals() {
		
		Map<String,List<String>> animals = new HashMap<>();
		
		List<String> wild = new ArrayList();
		wild.add("Lion");
		wild.add("Tiger");
		
		List<String> domestic = new ArrayList();
		domestic.add("Cow");
		domestic.add("Cat");
		
		animals.put("d", domestic);
		animals.put("w", wild);
		
		
		return animals;
	}
	
	

}
