package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Employee_seq")
	@SequenceGenerator(name="Employee_seq",sequenceName = "Employee_seq",allocationSize = 1)
	private Long id;
	
	@Column(name="Name")
	private String  name;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Mobileno")
	private String mobileno;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="PickDate")
	private String bookpickdate;

	@Column(name="ReturnDate")
	private String bookreturndate;
	
	public String getBookpickdate() {
		return bookpickdate;
	}

	public void setBookpickdate(String bookpickdate) {
		this.bookpickdate = bookpickdate;
	}

	public String getBookreturndate() {
		return bookreturndate;
	}

	public void setBookreturndate(String bookreturndate) {
		this.bookreturndate = bookreturndate;
	}

	@Column(name="BookName")
	private String bookname;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	
	
	
	
	
}
