package com.demo;

import java.util.Optional;

public class DemoNPEx {
	
	public static void main(String[] args) {
		
		EmpApp app=new EmpApp();
		
		Optional<Employee> employeeOpt=app.getEmployeeByName("amit");
		
		String empName= employeeOpt.map(e-> e.getName()).orElse("name not found");
		System.out.println(empName);
	}

}
