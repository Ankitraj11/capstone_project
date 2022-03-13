package com.te.empwebapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.te.empwebapp.beans.EmployeeDetails;
import com.te.empwebapp.exception.EmployeeException;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public EmployeeDetails login(int id, String pass) {
		// TODO Auto-generated method stub

		// EntityManagerFactory
		// factory=Persistence.createEntityManagerFactory("EmployeeUnit01");
		EntityManager manager = factory.createEntityManager();
		EmployeeDetails details = manager.find(EmployeeDetails.class, id);
		if (details != null) {
			if (details.getPassword().equals(pass)) {

				return details;

			} else {
				throw new EmployeeException("invalid pasword");
			}

		} else {
			throw new EmployeeException("invalid id");
		}

	}

	@Override
	public boolean addData(EmployeeDetails details) {
		// TODO Auto-generated method stub
		EntityTransaction transaction = null;
		boolean isAdded = false;
		try {
			// EntityManagerFactory factory
			// =Persistence.createEntityManagerFactory("EmployeeUnit01");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(details);
			isAdded = true;
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();

		}
		return isAdded;
	}

	@Override
	public EmployeeDetails getDetails(int id) {
		// TODO Auto-generated method stub
		// EntityManagerFactory
		// factory=Persistence.createEntityManagerFactory("EmployeeUnit01");
		EntityManager manager = factory.createEntityManager();
		EmployeeDetails details = manager.find(EmployeeDetails.class, id);
		if (details != null) {
			return details;
		}

		return null;

	}

	@Override
	public boolean updateDetails(int id, EmployeeDetails details2) {
		// TODO Auto-generated method stub
		boolean isUpdated = false;
		EntityTransaction transaction = null;
		try {
			// EntityManagerFactory
			// factory=Persistence.createEntityManagerFactory("EmployeeUnit01");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			EmployeeDetails details3 = manager.find(EmployeeDetails.class, id);
			if (details3 != null) {
				details3.setEmail(details2.getEmail());
				details3.setName(details2.getName());
				details3.setAddress(details2.getAddress());
				details3.setPassword(details2.getPassword());

				transaction.begin();
				manager.persist(details3);
				transaction.commit();
				isUpdated = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			transaction.rollback();
			e.printStackTrace();
		}

		return isUpdated;
	}

}
