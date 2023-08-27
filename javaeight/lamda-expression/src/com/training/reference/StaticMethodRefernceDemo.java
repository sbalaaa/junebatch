package com.training.reference;

import java.util.function.Function;

import com.training.functional.Employee;
import com.training.functional.EmployeeVO;

public class StaticMethodRefernceDemo {

	public static void main(String[] args) {
		Employee employee = new Employee("Raja","Ravi",32);
		
		System.out.println(employee);
		
		//Function<Employee,EmployeeVO> converter = (e) -> Converter.anotherVoConverter(employee);
		Function<Employee,EmployeeVO> converter = Converter::anotherVoConverter;
		
		EmployeeVO result = converter.apply(employee);
		
		System.out.println(result);

	}

}
