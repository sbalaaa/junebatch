package com.training.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String> obj = new HashMap<>();
		obj.put("a", "apple");
		obj.put("b", "banana");
		obj.put("b", "baby banana");
		
		
		String value = obj.get("b");
		System.out.println(value);
		
		System.out.println(obj.get("a"));

	}
	
	
	

}
