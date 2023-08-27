package com.training.reference;

import java.util.function.Function;

import com.training.functional.Employee;
import com.training.functional.EmployeeVO;

public class ArbitraryMethodReferenceDemo {

	public static void main(String[] args) {
		Employee employee = new Employee("Raja","Ravi",32);
		
		System.out.println(employee);
		
		//Function<Employee,EmployeeVO> converter = (e) -> e.employeeVOConverter();
		Function<Employee,EmployeeVO> converter = Employee::employeeVOConverter;
		
		EmployeeVO result = converter.apply(employee);
		
		System.out.println(result);

	}

}
