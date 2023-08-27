package com.training.reference;

import com.training.functional.Employee;
import com.training.functional.EmployeeVO;

public class Converter {
	
	public EmployeeVO voConverter(Employee e ) {
		EmployeeVO vo = new EmployeeVO();
		vo.setfName(e.getFirstName());
		vo.setlName(e.getLastName());
		vo.setAge(e.getAge());
		return vo;
	}
	
	
	public static EmployeeVO anotherVoConverter(Employee e ) {
		EmployeeVO vo = new EmployeeVO();
		vo.setfName(e.getFirstName());
		vo.setlName(e.getLastName());
		vo.setAge(e.getAge());
		return vo;
	}

}
