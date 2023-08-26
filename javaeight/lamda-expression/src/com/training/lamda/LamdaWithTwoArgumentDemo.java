package com.training.lamda;

public class LamdaWithTwoArgumentDemo {

	public static void main(String[] args) {
		MathInteface mi = (int a, int b) -> {
			return a + b;
		};
		
		MathInteface mii = (int a, int b) ->  a + b;
		
		MathInteface miii = (a,b) ->  a + b;
		
		System.out.println(miii.sum(1, 2));
		

	}

}
