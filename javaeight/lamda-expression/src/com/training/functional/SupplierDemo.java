package com.training.functional;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Employee> employeeSupplier = () -> new Employee("Raja","Ravi",32);
		Employee result = employeeSupplier.get();
		System.out.println(result);

	}

}
