package com.technoelevate.collection.setex.comparator;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
  int id;
  String name;
  double salary;
	
	public Employee() {
	
}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}

	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
  
}
