package com.training.sort;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeListSorting {

	public static void main(String[] args) {
	
		List<Employee> employees = Employee.getEmployeeList();
		employees.forEach(System.out::println);
		
		System.out.println("After Sorting");
		
		
		employees.sort((e1,e2) -> e1.getLastName().compareTo(e2.getLastName()));
		
		employees.forEach(System.out::println);

	}

}
