package com.training.enums;

public class IntPatternDemo {
	
	private static void getInformation(int seasion) {
		switch(seasion){
			case Constant.WINTER:
				System.out.println(Constant.WINTER);
				break;
			case Constant.SUMMER:
				System.out.println(Constant.SUMMER);
				break;
			default:
				System.out.println("default season");
		}

	}
	
	
	public static void main(String[] args ) {
		getInformation(0);
		getInformation(Constant.WINTER);
		getInformation(1);
		getInformation(Constant.SUMMER);
		getInformation(2);
		getInformation(100);
	}

}
