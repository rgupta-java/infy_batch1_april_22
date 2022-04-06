package com.funcational_programming;

public class EmpData {

	private String name;
	private double salary;

	public EmpData(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public EmpData() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmpData [name=" + name + ", salary=" + salary + "]";
	}

}
