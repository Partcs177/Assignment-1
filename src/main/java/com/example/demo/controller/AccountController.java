package com.example.demo.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Deposit;
import com.example.demo.service.AccountService;

@RestController
public class AccountController {
	@Autowired
		AccountService accountService;
		@PostMapping("/{id}account") // create
		@ResponseStatus(code = HttpStatus.CREATED)
		public void createAccount(@RequestBody @Valid Account account, @PathVariable("id") Integer id ){
			accountService.saveAccount(account);
	
		
	}

}
