package com.training.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.training.functional.Employee;
import com.training.functional.EmployeeVO;

public class StreamEmployeeFilterDemo {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Stacy","Robin",22));
		employees.add(new Employee("Ruth","Johonson",20));
		
		
	
		List<Employee> filteredEmployees =employees.stream().filter( e -> e.getAge() > 20).collect(Collectors.toList());
		
		filteredEmployees.forEach(System.out::println);
		
		
		

	}

}
