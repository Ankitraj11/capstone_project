package com.te.empwebapp.dao;

import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.empwebapp.beans.EmployeeDetails;
import com.te.empwebapp.service.EmployeeService;

public interface EmployeeDao {

	public EmployeeDetails login(int id , String pass);
	
	public boolean addData(EmployeeDetails details); 
	public EmployeeDetails getDetails(int id);
	public boolean updateDetails(int id ,EmployeeDetails details2);
	
}
