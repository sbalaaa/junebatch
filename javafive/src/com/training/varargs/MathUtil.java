package com.training.varargs;

public class MathUtil {

	/*static int add (int a, int b) {
		return a + b;
	}*/
	
	static int add (int... args) {
		int total = 0;
		for(int i : args) {
			total = total + i;
		}
		return total;
	}
	
	
}
