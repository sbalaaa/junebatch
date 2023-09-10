package com.training.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee implements Comparable<Employee>{

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

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	
	public static List<Employee> getEmployeeList() {
		return Arrays.asList(new Employee("John", "Smith", 25),new Employee("Martin", "Waugh", 28),new Employee("Richard", "Malcom", 27));
	}
	
	@Override
	public int compareTo(Employee o) {
		if( this.getAge() > o.getAge()) {
			return 1;
		} else if( this.getAge() < o.getAge()){
			return -1;
		} else {
			return 0;
		}
		
	}

}
