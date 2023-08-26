package com.training.lamda;

public class LamdaWithOutArugmentDemo {

	public static void main(String[] args) {
		//PrintImpl obj = new PrintImpl();
		Print obj = new PrintImpl();
		obj.write();
		
		Print lamdaObj = () -> System.out.print("Lamda print");
		lamdaObj.write();

	}

}
