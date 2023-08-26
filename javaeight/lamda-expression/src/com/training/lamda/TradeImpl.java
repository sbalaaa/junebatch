package com.training.lamda;

public class TradeImpl implements ITrade {

	@Override
	public int getTrade(int num) {
		int trade = num * 10;
		return trade;
	}

}
