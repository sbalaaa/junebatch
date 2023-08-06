package com.training.set;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private int age;
	
	public Employee() {
		
	}
	
	public Employee(int employeeId, String firstName, String lastName, int age) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId;
	}

	@Override
	public int compareTo(Employee o) {
		if( this.getEmployeeId() > o.getEmployeeId()) {
			return 1;
		} else if( this.getEmployeeId() < o.getEmployeeId()){
			return -1;
		} else {
			return 0;
		}
		
	}
	
	
	
	
	

}
