package com.training.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeSortedSetDemo {

	public static void main(String[] args) {
		Set<Employee> employees = new TreeSet<>();
		
		Employee one = new Employee(3,"anbu","arivu",25);
		Employee two = new Employee(2,"babu","bharath",25);
		Employee three = new Employee(1,"arul","bharath",25);
		
		employees.add(one);
		employees.add(two);
		employees.add(three);
		
		for(Employee emp : employees ) {
			System.out.println(emp);
		}

	}

}
