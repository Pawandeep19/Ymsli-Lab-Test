package com.custApp.entities;

import java.sql.Date;

public class Customer {
	//id, name,address, phone number, dob. 
	private int id;
	private String name;
	private String address;
	private String phNo;
	private Date dob;
	public Customer(int id, String name, String address, String phNo, Date dob) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.phNo = phNo;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public Date getDob() {
		return  dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phNo=" + phNo + ", dob=" + dob
				+ "]";
	}
	
	
	
}
