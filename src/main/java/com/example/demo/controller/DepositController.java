package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Deposit;
import com.example.demo.service.DepositService;

@RestController
public class DepositController {
	@Autowired
	DepositService depositService;
	
	@PostMapping("/{id}deposit") // create
	@ResponseStatus(code = HttpStatus.CREATED)
	void createDeposit(@RequestBody @Valid Deposit deposit, @PathVariable("id") Integer id) {
		depositService.saveDeposit(deposit);
	}
	

}
