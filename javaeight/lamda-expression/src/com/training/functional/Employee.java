package com.training.functional;

public class Employee  {

	private String firstName;
	private String lastName;
	private int age;

	public Employee() {
	}

	public Employee(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public EmployeeVO employeeVOConverter() {
		EmployeeVO vo = new EmployeeVO();
		vo.setfName(this.getFirstName());
		vo.setlName(this.getLastName());
		vo.setAge(this.getAge());
		return vo;
	}

	
	

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

}
