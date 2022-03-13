package com.technoelevate.comparator;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
       String name;
       String address;
       int id;
       double salary;
       
       
	
	public Employee() {
		
	}



	public Employee(int id,String name,String address,double salary) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}



	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
	
}
