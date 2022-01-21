package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.CustomerRepository;
import com.example.demo.entity.Customer;

@Service
public class CustomerService {
	@Autowired
	private  CustomerRepository customerRepository;

	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
		}
}
