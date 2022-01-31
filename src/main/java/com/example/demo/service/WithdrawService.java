package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.WithdrawRepository;

@Service
public class WithdrawService {
	@Autowired
	private WithdrawRepository withdrawRepository;
}
