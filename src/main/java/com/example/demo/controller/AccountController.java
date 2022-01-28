package com.example.demo.controller;



import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.entity.Customer;
import com.example.demo.service.AccountService;

@RestController
public class AccountController {
	public void addAccount() {
		AccountService accountService;
		@PostMapping("/account") // create
		@ResponseStatus(code = HttpStatus.CREATED)
		public void createAccount(@RequestBody Account account){
			accountService.saveAccount(account);
		}
		
	}

}
