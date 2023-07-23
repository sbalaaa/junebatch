package com.first;

public class FirstBaseClass {
	
	String noModifier = " I am noModifer in FirstBaseClass";
	private String privateModifier = " I am privateModifier in FirstBaseClass";
	protected String protectedModifier = " I am protectedModifier in FirstBaseClass";
	public String publicModifier = " I am publicModifier in FirstBaseClass";
	
	
	private void printFirstBaseClassVariables() {
		//private int i = 0;
		System.out.println(noModifier);
		System.out.println(privateModifier);
		System.out.println(protectedModifier);
		System.out.println(publicModifier);
		
	}
	
	
	public static void main(String args[]) {
		FirstBaseClass obj = new FirstBaseClass();
		obj.printFirstBaseClassVariables();
	}
	

}
