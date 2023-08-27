package com.training.functional;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Employee employee = new Employee("Raja","Ravi",32);
		
		Consumer<Employee> employeeConsumer = e -> System.out.println(e);
		
		employeeConsumer.accept(employee);

	}

}
