package com.second;

import com.first.FirstBaseClass;

public class SecondBaseClass extends FirstBaseClass{
	
	private void printSecondBaseClassVariables() {
		//System.out.println(noModifier);
		//System.out.println(privateModifier);
		System.out.println(protectedModifier);
		System.out.println(publicModifier);
		
		SecondBaseClass obj = new SecondBaseClass();
		System.out.println(obj.protectedModifier);
		System.out.println(obj.publicModifier);
		
	}

}
