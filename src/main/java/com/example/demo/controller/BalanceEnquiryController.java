package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BalanceEnquiry;
import com.example.demo.service.BalanceEnquiryService;


@RestController
@RequestMapping("/api/balanceEnquiry")
public class BalanceEnquiryController {
	@Autowired
	BalanceEnquiryService balanceEnquiryService;
	@PostMapping("/{id}balance") // create
	@ResponseStatus(code = HttpStatus.CREATED)
	void createCustomer(@RequestBody @Valid BalanceEnquiry balanceEnquiry, @PathVariable("id") Integer id) {
		balanceEnquiryService.saveBalance(balanceEnquiry);
	}
	@GetMapping("/{id}balance")
	BalanceEnquiry getBalanceEnquiryService(@PathVariable("id") Integer id) {
		return balanceEnquiryService.balanceEnquiry(id);
	}
}
