package com.training.generics;

import java.util.concurrent.atomic.AtomicInteger;

public class BoxMultiRestrictionDemo {

	public static void main(String[] args) {
		BoxMultiRestriction<Integer> intObj = new BoxMultiRestriction<Integer>();
		intObj.setObj(1);
		Integer i = intObj.getObj();
		
		//BoxRestriction<String> strObj = new BoxRestriction<String>();
		//strObj.setObj("Hello");
		//String s = strObj.getObj();
		
		BoxMultiRestriction<Float> floatObj = new BoxMultiRestriction<Float>();
		floatObj.setObj(1F);
		Float f = floatObj.getObj();
		
		//BoxMultiRestriction<AtomicInteger> atomicIntegerObj = new BoxMultiRestriction<>();

	}

}
