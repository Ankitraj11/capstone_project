package com.te.empwebapp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="emp_info")
public class EmployeeDetails {
	@Id 

  	private int id;
	@Column(name="e_name")
	private String name;
	@Column(name="e_pass")
	private String  password;
	@Column(name="e_email")
     private String email;
	@Column(name="e_address")
	private String address;
     


}
