package com.training.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeListDemo {

	public static void main(String[] args) {
		Employee one = new Employee(3, "Ravi","Sankar");
		Employee two = new Employee(1, "Raja","Ram");
		Employee three = new Employee(2, "Anbu","Das");
		
		
		List<Employee> employees = new ArrayList<>();
		employees.add(one);
		employees.add(two);
		employees.add(three);
		
		//Collections.sort(employees);
		Collections.sort(employees, new FirstNameCompartaor());
		
		for(Employee e:employees) {
			System.out.println(e);
		}

	}

}
