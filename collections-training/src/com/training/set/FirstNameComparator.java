package com.training.set;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee first, Employee second) {
		return first.getFirstName().compareToIgnoreCase(second.getFirstName());
	}

}
