package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.BalanceRepository;
import com.example.demo.CustomerRepository;
import com.example.demo.entity.BalanceEnquiry;
import com.example.demo.entity.Customer;

@Service
public class BalanceEnquiryService {
	@Autowired
	private  BalanceRepository balanceRepository;

	public void saveBalance(BalanceEnquiry balance) {
		balanceRepository.save(balance);
		}
	
	public BalanceEnquiry balanceEnquiry(Integer id) {
		// TODO Auto-generated method stub
		return balanceRepository.findById(id).get();
	}

}
