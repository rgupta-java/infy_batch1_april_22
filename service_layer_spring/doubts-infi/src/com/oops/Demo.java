package com.oops;
//Object orintation : abstarction encapsulation and modulary and hierarchy

// interface and abstract class
//abstract class: incomplete class, and it provide a common hierachy

// Employee: PartTimeEmployee, FullTimeEmployee

//When i should go for abstract class: When i want to create a common hierachy, at that time i should go for abstract class
abstract class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		System.out.println("--------");
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public abstract double getTotalPay();
}

class FullTimeEmployee extends Employee {
	private double ppf;

	public FullTimeEmployee(int id, String name, double salary, double ppf) {
		super(id, name, salary);
		this.ppf = ppf;
	}

	@Override
	public String toString() {
		return  super.toString()+ "FullTimeEmployee [ppf=" + ppf + "]";
	}

	@Override
	public double getTotalPay() {
		// total - tax
		return .8 * getSalary();
	}

}

class PartTimeEmployee extends Employee {

	private int noOfHr;
	private int costOfHr;

	public PartTimeEmployee(int id, String name, double salary, int noOfHr, int costOfHr) {
		super(id, name, salary);
		this.noOfHr = noOfHr;
		this.costOfHr = costOfHr;
	}

	public int getNoOfHr() {
		return noOfHr;
	}

	public void setNoOfHr(int noOfHr) {
		this.noOfHr = noOfHr;
	}

	public int getCostOfHr() {
		return costOfHr;
	}

	public void setCostOfHr(int costOfHr) {
		this.costOfHr = costOfHr;
	}

	@Override
	public String toString() {
		super.toString();
		return "PartTimeEmployee [noOfHr=" + noOfHr + ", costOfHr=" + costOfHr + "]";
	}

	@Override
	public double getTotalPay() {
		return getCostOfHr()*getNoOfHr();
	}

}

public class Demo {

	public static void main(String[] args) {
		Employee employee = new FullTimeEmployee(1, "rajat", 50000, 5000);
		System.out.println(employee);
	}
}
