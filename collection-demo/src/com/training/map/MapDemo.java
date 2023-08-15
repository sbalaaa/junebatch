package com.training.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> fruitMap = new HashMap<String,String>();
		fruitMap.put("a", "apple");
		fruitMap.put("b", "biscuit");
		fruitMap.put("j", "jam");
		
		
		String value = fruitMap.get("b");
		System.out.println("Value is => " + value);
		
		fruitMap.put("b", "ball");
		value = fruitMap.get("b");
		System.out.println("Value after overwrite is => " + value);

	}

}
