package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AccountRepository;

import com.example.demo.entity.Account;


@Service
public class AccountService {
	@Autowired
	private  AccountRepository accountRepository;

	public void saveAccount(Account account) {
		accountRepository.save(account);
	}

	
}
