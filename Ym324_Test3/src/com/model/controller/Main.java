package com.model.controller;



import java.sql.Date;

import com.custApp.entities.Customer;
import com.model.dao.CustDaoImp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustDaoImp custDaoImp=new CustDaoImp();
		//adding a customer
		Date dob=Date.valueOf("2000-12-21");
		Customer customer1=new Customer(3, "Raghav", "Shalimar Bagh", "9711139045", dob );
		custDaoImp.addCustomer(customer1);
		
		//searching
		Customer customer=custDaoImp.findCustById(3);
		System.out.println(customer.toString());
		


	}

}
