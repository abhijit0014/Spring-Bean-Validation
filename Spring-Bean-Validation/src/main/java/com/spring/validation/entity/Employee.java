package com.spring.validation.entity;

import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.spring.validation.validator.ValidateDOB;
import com.spring.validation.validator.ValidateName;
import com.spring.validation.validator.ValidatePassword;
import com.spring.validation.validator.ValidatePhoneNumber;
import com.spring.validation.validator.ValidateUsername;

public class Employee {

	private Long empId;
	
	@NotEmpty
	@ValidateName(message = "{ValidateName.employee}")
	private String fname;
	
	@NotEmpty
	@ValidateName(message = "{ValidateName.employee}")
	private String lname;
	
	@NotEmpty
	@Email(message="{Email.employee.email}")
	private String email;
	
	@NotNull
	@ValidateDOB(message = "Enter a valid date of birth")
	private Date dob;
	
	@NotEmpty
	@ValidatePhoneNumber(message = "{ValidatePhoneNumber.employee.phone}")
	private String phone;
	
	@NotEmpty(message="{NotNull.employee.username}")
	@ValidateUsername(message = "{ValidateUsername.employee.username}")
	private String username;
	
	@NotEmpty
	@ValidatePassword(message="{ValidatePassword.employee.pass}")
	private String pass;
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
