package com.training.forloop;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(100);
		list.add(1000);
		
		
		for(Integer i : list) {
			System.out.println(i);
		}

	}

}
