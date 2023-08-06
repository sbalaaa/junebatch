package com.training.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.set.AgeComparator;
import com.training.set.Employee;
import com.training.set.FirstNameComparator;

public class EmployeeListSortingDemo {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		Employee one = new Employee(3,"anbu","arivu",35);
		Employee two = new Employee(2,"babu","bharath",25);
		Employee three = new Employee(1,"arul","bharath",45);
		
		employees.add(one);
		employees.add(two);
		employees.add(three);
	
		
	
		System.out.println("Before shorting");
		
		for(Employee e : employees ) {
			System.out.println("Employee is: " + e);
		}
		
		//Collections.sort(employees);
		//Collections.sort(employees, new AgeComparator());
		//Collections.sort(employees, new FirstNameComparator());
		
		Collections.sort(
				employees, Comparator.comparing(Employee::getLastName));
		
		System.out.println("After shorting");
		
		for(Employee e : employees ) {
			System.out.println("Employee is: " + e);
		}
		
		

	}

}
