package com.customerapp.springrest.service;

import java.util.List;

import com.customerapp.springrest.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
