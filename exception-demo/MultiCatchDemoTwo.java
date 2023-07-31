package com.training;


public class MultiCatchDemoTwo {

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
		} catch (Exception e) {
			System.out.println("Exception caught " + e.toString());
		} 
		/*catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught");
		} */
		
		
		System.out.println("Programme Ends");
	}

}
