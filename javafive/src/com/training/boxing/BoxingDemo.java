package com.training.boxing;

import java.util.ArrayList;
import java.util.List;

public class BoxingDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(100);
		list.add(1000);
		
		//Integer i = new Integer(10);
		Integer i = 10;
		
		//int iValue = i.intValue();
		int iValue = i;
		
		System.out.println(iValue);
	}

}
