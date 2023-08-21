package com.training.varargs;

public class VarargsDemo {

	public static void main(String[] args) {
		int result = MathUtil.add(10,20,30,40,50);
		//System.out.println(result);
		String[] s = {"Hello","Welcome","Hi"};
		
		DisplayUtil.display("Hello","Welcome","Hi");
		DisplayUtil.display("Hello","Welcome");
		DisplayUtil.display(s);
		DisplayUtil.display(100,"Hello","Welcome");

	}
	
	

}
