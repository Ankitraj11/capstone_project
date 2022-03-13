package com.technoelevate.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {
public static void main(String[] args) {
	ArrayList<Employee> arrayList=new ArrayList<Employee>();
	arrayList.add(new Employee(23,"ankit","banglore",230000));
	arrayList.add(new Employee(11,"varun","banglore",2350000));
	arrayList.add(new Employee(3,"anu","banglore",2305000));
	arrayList.add(new Employee(12,"manu","banglore",2307000));
	for(Employee employee:arrayList) {
		System.out.println(arrayList);
	}
	Collections.sort(arrayList, new Employee());
	for(Employee employee:arrayList) {
		System.out.println(employee);
	}
	
	
}
	
}
