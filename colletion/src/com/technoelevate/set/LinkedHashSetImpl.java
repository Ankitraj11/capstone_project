package com.technoelevate.set;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;

public class LinkedHashSetImpl {

  public static void main(String[] args) {
	
	  Set<Employee> employees=new LinkedHashSet<Employee>();
	  employees.add(new Employee(12,"ankit",23000));
	  employees.add(new Employee(15,"pankaj",24000));
	  employees.add(new Employee(34,"rohan",27000));
	  employees.add(new Employee(56,"sohan",21000));
	  employees.add(new Employee(17,"kiran",234000));
	  
	  for(Employee employee:employees) {
		  System.out.println(employee);
	  }
	  System.out.println("---using iterator--------");
	  Iterator<Employee> iteraotr=employees.iterator();
	  while(iteraotr.hasNext()) {
		  System.out.println(iteraotr.next());
	  }
	  System.out.println("-----using sort method----------");
	ArrayList<Employee> employees4= new ArrayList<Employee>(employees);
	  
	Collections.sort(employees4);
	  ListIterator<Employee> employeeIterator=employees4.listIterator();
	  while(employeeIterator.hasNext()) {
		  System.out.println(employeeIterator.next());
	  }
	  
	  
}
	
}
