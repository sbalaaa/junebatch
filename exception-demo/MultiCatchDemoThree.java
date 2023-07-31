package com.training;


public class MultiCatchDemoThree {

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
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught " + e.toString());
		} catch (Exception e) {
			System.out.println("Exception caught");
		} 
		
		
		System.out.println("Programme Ends");
	}

}
