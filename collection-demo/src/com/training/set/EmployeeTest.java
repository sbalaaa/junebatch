package com.training.set;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee ravi = new Employee(1, "Ravi","Sankar");
		//ravi.employeeId = 0;
		//ravi.setEmployeeId(1);
		//ravi.setFirstName("Ravi");
		//ravi.setLastName("Sankar");
		
		System.out.println(ravi);
		
		System.out.println(ravi.getEmployeeId());

	}

}
