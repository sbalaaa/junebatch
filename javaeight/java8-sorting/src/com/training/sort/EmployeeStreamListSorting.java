package com.training.sort;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamListSorting {

	public static void main(String[] args) {
	
		List<Employee> employees = Employee.getEmployeeList();
		employees.forEach(System.out::println);
		
		System.out.println("After Sorting");
		
		//List<Employee> sortedEmployees = employees.stream().sorted().collect(Collectors.toList());
		
		//List<Employee> sortedEmployees = employees.stream().sorted((e1,e2) -> e1.getFirstName().compareTo(e2.getFirstName())).collect(Collectors.toList());
		
		List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
		
		sortedEmployees.forEach(System.out::println);

	}

}
