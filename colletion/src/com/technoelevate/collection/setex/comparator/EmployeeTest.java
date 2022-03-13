package com.technoelevate.collection.setex.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeTest {
  public static void main(String[] args) {
	Set<Employee> employees=new LinkedHashSet<Employee>();
	employees.add(new Employee(12,"ankit",200000));
	employees.add(new Employee(14,"ankit",200000));
	employees.add(new Employee(10,"ankit",200000));
	employees.add(new Employee(8,"ankit",200000));
	
	for(Employee employee:employees) {
		System.out.println(employee);
	}
	System.out.println("after sorting");
	
	ArrayList<Employee> employees2=new ArrayList<Employee>(employees);
	Collections.sort(employees2, new Employee());
	for(Employee employees3:employees2) {
		System.out.println(employees3);
	}
}
}
