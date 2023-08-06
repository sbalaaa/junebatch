package com.training.set;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo {

	public static void main(String[] args) {
		Employee one = new Employee(1, "Ravi","Sankar");
		Employee two = new Employee(1, "Ravi","Sankar");
		
		if( one.equals(two)) {
			System.out.println("Both employee object is equal");
		} else {
			System.out.println("Both employee object is not equal");
		}
		
		Set<Employee> employees = new HashSet<>();
		employees.add(one);
		employees.add(two);
		
		for(Employee e:employees) {
			System.out.println(e);
		}

	}

}
