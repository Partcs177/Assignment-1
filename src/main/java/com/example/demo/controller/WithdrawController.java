package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.WithdrawService;

@RestController
public class WithdrawController {
	@Autowired
	WithdrawService withdrawService;
	@PostMapping("/{id}") // create
	@ResponseStatus(code = HttpStatus.CREATED)

}
