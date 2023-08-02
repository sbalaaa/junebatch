package com.training;


public class TryScopeDemo {

	public static void main(String[] args) {
		System.out.println("Programme Starts");
		String s = "Hello";
		//String s = null;
		
		try {
			int i = 0;
			System.out.println("11111");
			System.out.println("Length of string is " + s.length());
			System.out.println("22222");
			System.out.println(i);
		} catch (NullPointerException e) {
			System.out.println("Exception caught");
		}
		//System.out.println(i);
		
		System.out.println("Programme Ends");
	}

}
