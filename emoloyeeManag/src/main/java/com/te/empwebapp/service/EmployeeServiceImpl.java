package com.te.empwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.empwebapp.beans.EmployeeDetails;
import com.te.empwebapp.dao.EmployeeDao;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public EmployeeDetails login(int id, String pass) {
		// TODO Auto-generated method stub
		if(id<=0) {
			return null;
		}
		else {
			return dao.login(id, pass);
		}
	}

	@Override
	public boolean addData(EmployeeDetails details) {
		// TODO Auto-generated method stub
		return dao.addData(details);
	}

	@Override
	public EmployeeDetails getDetails(int id) {
		// TODO Auto-generated method stub
		return dao.getDetails(id);
	}

	@Override
	public boolean updateDetails(int id, EmployeeDetails details2) {
		// TODO Auto-generated method stub
		return dao.updateDetails(id, details2);
	}

	
}
