package com.first;

public class FirstSubClass extends FirstBaseClass{
	
	
	
	private void printFirstSubClassVariables() {
		
		System.out.println(noModifier);
		//System.out.println(privateModifier);
		System.out.println(protectedModifier);
		System.out.println(publicModifier);
		
	}
	
	
	public static void main(String args[]) {
		FirstSubClass obj = new FirstSubClass();
		obj.printFirstSubClassVariables();
	}

}
