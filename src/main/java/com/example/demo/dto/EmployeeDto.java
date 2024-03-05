package com.example.demo.dto;

public class EmployeeDto {

	private String id;
	private String  name;
	private String email;
	private String mobileno;
	private String address;
	private String gender;
	private String bookpickdate;
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
	private String bookname;
	
	 	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
