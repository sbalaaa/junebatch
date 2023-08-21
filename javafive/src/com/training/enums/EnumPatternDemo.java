package com.training.enums;

public class EnumPatternDemo {
	
	private static void getInformation(Season seasion) {
		switch(seasion){
			case WINTER:
				System.out.println(Season.WINTER);
				break;
			case SUMMER:
				System.out.println(Season.SUMMER);
				break;
			default:
				System.out.println("default season");
		}

	}
	
	
	public static void main(String[] args ) {
		//getInformation(Season.WINTER);
		//getInformation(Season.SUMMER);
		
		//System.out.println(Season.WINTER);
		
		Season s = Season.RAINING;
		System.out.println(s.ordinal());
		System.out.println(s.name());
		System.out.println(s.getId());

	}

}
