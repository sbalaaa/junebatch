package com.second;

public class SecondSubClass {
	
	
	private void printSecondSubClassVariables() {
		//System.out.println(noModifier);
		//System.out.println(privateModifier);
		//System.out.println(protectedModifier);
		//System.out.println(publicModifier);
		
		SecondBaseClass obj = new SecondBaseClass();
		System.out.println(obj.protectedModifier);
		System.out.println(obj.publicModifier);
		
	}

}
