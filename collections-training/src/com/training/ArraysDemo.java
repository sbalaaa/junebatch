package com.training;


class ArraysDemo {
	
	public static void main(String args[]) {
	
		int[] numbers;  // Square brackets before variable name (recommended) 
		//int numbers[];  // Square bracke after variable name
		
		numbers = new int[5];
		
		//int[] numbers = new int[5];

		
		numbers[0] = 22;
		numbers[1] = 33;
		numbers[2] = 66;
		numbers[3] = 100;
		numbers[4] = 72;
		
		
		
		int firstElement = numbers[0];
		System.out.println("first element is " + firstElement);
		
		int lastElement = numbers[numbers.length-1];
		System.out.println("last element is " + lastElement);
		
		numbers[5] = 72;
		numbers[6] = 72;
		
		
		//int[] numbers = {22,33,66,100,72};
		
		System.out.println("Numbers are : " + numbers);
		System.out.println("Numbers array length is : " + numbers.length);  

			
		System.out.println("\n \n");
		String hi = "Hello"; 
		System.out.println("Number of character inside string is " + hi.length());
		
		System.out.println("\n \n");
		System.out.println("Print the numbers inside the Array ");
		
		for(int i=0; i < numbers.length; i++ ) {
			System.out.println(i + "  element is " + numbers[i]);
		}
		
		
		
		String[] fruits = new String[3];
		fruits[0]="apple";
		fruits[1]="banana";
		fruits[2]="orange";
		
		
		
		for(String s: fruits) {
			System.out.println("Fruit name is: " + s);
		}	
		


	
	}
	
	
}

// Constructing Multidimensional Arrays