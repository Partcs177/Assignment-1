package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DepositRepository;
import com.example.demo.entity.Deposit;

@Service
public class DepositService {
	@Autowired
	private DepositRepository depositRepository;
	public void saveDeposit(Deposit deposit) {
		depositRepository.save(deposit);
	}

}
