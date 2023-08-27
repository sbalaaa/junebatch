package com.training.functional;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Employee employee = new Employee("Raja","Ravi",32);
		
		System.out.println(employee);
		
		Function<Employee,EmployeeVO> converter = (e) -> {
			EmployeeVO vo = new EmployeeVO();
			vo.setfName(e.getFirstName());
			vo.setlName(e.getLastName());
			vo.setAge(e.getAge());
			return vo;
		};
		
		EmployeeVO result = converter.apply(employee);
		
		System.out.println(result);

	}

}
