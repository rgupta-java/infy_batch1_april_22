package com.funcational_programming;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
//
public class Main {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(new Employee(121, "ravi",78000));
		employees.add(new Employee(1, "suman",38000));
		employees.add(new Employee(21, "rajiv",178000));
		employees.add(new Employee(9121, "gunika",898000));
		employees.add(new Employee(11, "ekta",898050));
		employees.add(new Employee(921, "sumit",98000));
		
//		for(Employee employee: employees) {
//			System.out.println(employee);
//		}
		//what i want to get name of all emp whose salary is >=50000 in sorted order
		//java 7 ways
		
		//1...get all emp getting salary more then 50k
//		List<Employee> empSalaryMoreThen50k= new ArrayList<Employee>();
//		for(Employee employee: employees) {
//			if(employee.getSalary()>=50000) {
//				empSalaryMoreThen50k.add(employee);
//			}
//		}
//		//2...sort all emp as per salary , desc order
//		Collections.sort(empSalaryMoreThen50k, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return Double.compare(o2.getSalary(), o1.getSalary());//i want to reverse sort?
//			}
//		});
//		
//		//3. i want only names
//		List<String> empNamesSalaryMoreThen50k=new ArrayList<String>();
//		for(Employee emp: empSalaryMoreThen50k) {
//			empNamesSalaryMoreThen50k.add(emp.getName());
//			
//		}
//		
//		//4. print them 
//		
//		for(String name: empNamesSalaryMoreThen50k) {
//			System.out.println(name);
//		}
//		
		
		//fiter map sorting  ...very easy...
		
		// java 8 ways. (must be more easier and look :)
		
		//java 8 provide declartive way of coding ....
		//how it provide : it use a concept of streams: flow of data is just moving on conver belt
		//and it can be process while it is moving: we can apply some method: map, filter, sorted ....
		
		
//		List<String> empNames= employees
//				.stream()
//				.filter(emp-> emp.getSalary()>50000)
//				.sorted(Comparator.comparing(Employee::getSalary).reversed())
//				.map(emp-> emp.getName())
//				.collect(Collectors.toList());
//		
//		empNames.forEach(name-> System.out.println(name));		
		
		Function<Employee, EmpData> function= e -> new EmpData(e.getName(), e.getSalary());
//			
//		List<EmpData> empData= 
//				employees.stream()
//		.filter(emp-> emp.getSalary()>50000)
//		.sorted(Comparator.comparing(Employee::getSalary).reversed())
//		.map(e ->new EmpData(e.getName(), e.getSalary()))
//		.collect(Collectors.toList());
//
//		empData.forEach(e-> System.out.println(e));	
		
	}
}




