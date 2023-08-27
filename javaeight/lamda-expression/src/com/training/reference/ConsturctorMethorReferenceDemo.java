package com.training.reference;

import java.util.function.Function;

import com.training.functional.Employee;
import com.training.functional.EmployeeVO;

public class ConsturctorMethorReferenceDemo {

	public static void main(String[] args) {
		Employee employee = new Employee("Raja","Ravi",32);
		
		System.out.println(employee);
		
		//Function<Employee,EmployeeVO> converter = (e) -> new EmployeeVO(e);
		
		Function<Employee,EmployeeVO> converter = EmployeeVO::new;
		
		EmployeeVO result = converter.apply(employee);
		
		System.out.println(result);

	}

}
