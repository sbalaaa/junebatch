package com.training.set;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo {

	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<>();
		
		Employee one = new Employee(1,"anbu","arivu",25);
		Employee two = new Employee(1,"anbu","arivu",25);
		
		employees.add(one);
		employees.add(two);
		
		for(Employee emp : employees ) {
			System.out.println(emp);
		}

	}

}
