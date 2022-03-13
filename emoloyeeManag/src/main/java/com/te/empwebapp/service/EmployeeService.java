package com.te.empwebapp.service;

import com.te.empwebapp.beans.EmployeeDetails;
import com.te.empwebapp.dao.EmployeeDao;

public interface EmployeeService {

	public EmployeeDetails login (int id, String password);
	
	public boolean addData(EmployeeDetails details); 
	
	public EmployeeDetails getDetails(int id);
	public boolean updateDetails(int id ,EmployeeDetails details2);

}
