package com.demo;

import java.util.Optional;

//amit
public class EmpApp {

	public Optional<Employee> getEmployeeByName(String name) {
		
		//logic it is checking from data.."amit"
		Employee employee=new Employee();
		employee.setId(12);
		employee.setName("ravi");
		employee.setSalary(400000);
		return Optional.ofNullable(employee);
	}
}
