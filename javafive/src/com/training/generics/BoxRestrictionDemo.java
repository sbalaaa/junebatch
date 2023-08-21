package com.training.generics;

import java.util.concurrent.atomic.AtomicInteger;

public class BoxRestrictionDemo {

	public static void main(String[] args) {
		BoxRestriction<Integer> intObj = new BoxRestriction<Integer>();
		intObj.setObj(1);
		Integer i = intObj.getObj();
		
		//BoxRestriction<String> strObj = new BoxRestriction<String>();
		//strObj.setObj("Hello");
		//String s = strObj.getObj();
		
		BoxRestriction<Float> floatObj = new BoxRestriction<Float>();
		floatObj.setObj(1F);
		Float f = floatObj.getObj();
		
		BoxRestriction<AtomicInteger> atomicIntegerObj = new BoxRestriction<>();

	}

}
