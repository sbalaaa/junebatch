package com.training.reference;

import java.util.function.Function;

import com.training.functional.Employee;
import com.training.functional.EmployeeVO;

public class MethodRefernceDemo {

	public static void main(String[] args) {
		Employee employee = new Employee("Raja","Ravi",32);
		
		System.out.println(employee);
		
		Converter con = new Converter();
		
		//Function<Employee,EmployeeVO> converter = (e) -> con.voConverter(employee);
		Function<Employee,EmployeeVO> converter = con::voConverter;
		
		EmployeeVO result = converter.apply(employee);
		
		System.out.println(result);

	}

}
