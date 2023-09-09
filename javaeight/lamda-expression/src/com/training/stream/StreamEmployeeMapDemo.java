package com.training.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.training.functional.Employee;
import com.training.functional.EmployeeVO;

public class StreamEmployeeMapDemo {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Stacy","Robin",22));
		employees.add(new Employee("Ruth","Johonson",20));
		
		 /* Function<Employee,EmployeeVO> converter = (e) -> {
			EmployeeVO vo = new EmployeeVO();
			vo.setfName(e.getFirstName());
			vo.setlName(e.getLastName());
			vo.setAge(e.getAge());
			return vo;
		};
		*/
		
		// List<EmployeeVO> employeeVOs =  employees.stream().map(converter).collect(Collectors.toList());
		
		/*List<EmployeeVO> employeeVOs =  employees.stream().map((e) -> {
			EmployeeVO vo = new EmployeeVO();
			vo.setfName(e.getFirstName());
			vo.setlName(e.getLastName());
			vo.setAge(e.getAge());
			return vo;
		}).collect(Collectors.toList());*/
		
		List<EmployeeVO> employeeVOs =  employees.stream().map(Employee::employeeVOConverter).collect(Collectors.toList());
		
		
		employeeVOs.forEach(System.out::println);

	}

}
