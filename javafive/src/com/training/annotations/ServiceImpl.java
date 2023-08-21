package com.training.annotations;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service {

	@Override
	public void addCustomer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub

	}
	
	
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(new Integer(10));
		//intList.add(Integer.valueOf(10));
		//intList.add(10);
		
		@SuppressWarnings("rawtypes")
		List rawList = new ArrayList();
	}

}
