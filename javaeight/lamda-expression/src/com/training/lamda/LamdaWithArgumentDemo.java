package com.training.lamda;

public class LamdaWithArgumentDemo {

	public static void main(String[] args) {

		int result;
		
		//TradeImpl obj = new TradeImpl();
		ITrade obj = new TradeImpl();
		result = obj.getTrade(10);
		System.out.println(result);
		
		ITrade lamdaObj = (int num) -> {
			return num * 10000;
		};
		
		//ITrade lamdaObjj = (int num) -> num * 10000;
		
		// ITrade lamdaObjj = (num) -> num * 10000;
		
		ITrade lamdaObjj = num -> num * 10000;
		
		result = lamdaObjj.getTrade(10);
		System.out.println(result);

	}

}
