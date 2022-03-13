package com.technoelevate.collection.setex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String[] args) {
		
	   Set<Employee> employees=new LinkedHashSet<Employee>();
	   employees.add(new Employee(100,"Tbhi",33000));
	   employees.add(new Employee(300,"Tbhi",36000));
	   employees.add(new Employee(200,"Tbhi",31230));
	   employees.add(new Employee(800,"Tbhi",34000));
	   
	 System.out.println(employees);
	 for(Employee employee:employees) {
		 System.out.println(employee);
	 }
	 
	 System.out.println("sorted hashset method using list method");
	 ArrayList<Employee> employees2=new ArrayList<Employee>(employees);
	 Collections.sort(employees2);
	 for(Employee employee:employees2) {
		 System.out.println(employee);
	 }
	 System.out.println("sorting using treeset");
	 
	 Set<Employee> employees3=new TreeSet<Employee>(employees);
	 for(Employee employee:employees3) {
		 System.out.println(employee);
	 }
	 
	}
}
