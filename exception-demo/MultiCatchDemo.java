package com.training;


public class MultiCatchDemo {

	public static void main(String[] args) {
		System.out.println("Programme Starts");
		//String s = "Hello";
		int[] a = {10,20,30};
		String s = null;
		
		try {
			System.out.println("11111");
			System.out.println("Length of string is " + s.length());
			System.out.println("A Element in array is" + a[3]);
			System.out.println("22222");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException caught");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught");
		} finally {
			System.out.println("finally block");
		}
		
		
		System.out.println("Programme Ends");
	}

}
