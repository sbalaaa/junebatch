package com.training.set;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee first, Employee second) {
		if( first.getAge() > second.getAge()) {
			return 1;
		} else if( first.getAge() < second.getAge()){
			return -1;
		} else {
			return 0;
		}
	}

}
