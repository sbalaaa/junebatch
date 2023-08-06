package com.training.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethods {

	public static void main(String[] args) {
		Map<String,String> obj = new HashMap<>();
		obj.put("a", "apple");
		obj.put("b", "banana");
		obj.put("c", "cherry");
		
	
		String value = obj.get("b");
		System.out.println(value);
		
		Set<String> keys = obj.keySet();
		System.out.println(keys);
		
		if(keys.contains("e")) {
			System.out.println("key exist");
		} else {
			System.out.println("key deoe not exist");
		}
		
		//Collection<String> values = obj.values();
		//System.out.println(values);
		
		Set<Map.Entry<String,String>> entries = obj.entrySet();
		
		for(Map.Entry<String,String> entry : entries) {
			System.out.println("My key is : " + entry.getKey() );
			System.out.println("My value is : " + entry.getValue() );
		}
		


	}
	
	
	

}
