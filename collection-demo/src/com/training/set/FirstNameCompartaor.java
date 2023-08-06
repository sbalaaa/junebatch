package com.training.set;

import java.util.Comparator;

public class FirstNameCompartaor implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
	}



}
