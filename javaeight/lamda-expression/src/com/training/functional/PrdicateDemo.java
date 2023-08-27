package com.training.functional;

import java.util.function.Predicate;

public class PrdicateDemo {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Raja","Ravi",32);
		Employee employeeTwo = new Employee("Raja","Ravi",16);
		/*Predicate<Employee> adultPrdicate = (e) -> {
			if(e.getAge() > 18) {
				return true;
			} else {
				return false;
			}
		};*/
		
		Predicate<Employee> adultPrdicate = e -> e.getAge() > 18;
		
		boolean result = adultPrdicate.test(employee);
		
		System.out.println(result);
		
		
		boolean result2 = adultPrdicate.test(employeeTwo);
		
		System.out.println(result2);

	}

}
