package com.training.varargs;

public class DisplayUtil {
	
	static void display(String... values) {
		System.out.println("display method invoked with argument  " + values);
		for (String s : values) {
			System.out.print(" " + s);
		}
		System.out.println();
	}

	static void display(int num, String... values) {
		System.out.println("number is " + num);
		for (String s : values) {
			System.out.print(" " + s);
		}
		System.out.println();
	}

}
