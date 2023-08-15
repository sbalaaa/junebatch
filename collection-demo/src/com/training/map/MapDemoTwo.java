package com.training.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemoTwo {

	public static void main(String[] args) {
		Map<String,String> fruitMap = new HashMap<String,String>();
		fruitMap.put("a", "apple");
		fruitMap.put("b", "biscuit");
		fruitMap.put("j", "jam");
		
		System.out.println(fruitMap);
		
		Set<String> keys = fruitMap.keySet();
		//System.out.println(keys);
		for(String key: keys) {
			System.out.println(key);
		}
		
		
		Collection<String> valjues = fruitMap.values();
		System.out.println(valjues);

	}

}
