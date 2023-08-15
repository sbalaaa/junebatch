package com.training.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemoThree {

	public static void main(String[] args) {
		Map<String,String> fruitMap = new HashMap<String,String>();
		fruitMap.put("a", "apple");
		fruitMap.put("b", "biscuit");
		fruitMap.put("j", "jam");
		
		System.out.println(fruitMap);
		
		Set<Entry<String,String>> entries = fruitMap.entrySet();
		
		
		for(Entry entry:entries) {
			System.out.println("Key is " + entry.getKey());
			System.out.println("Value is " + entry.getValue());
			
		}


	}

}
