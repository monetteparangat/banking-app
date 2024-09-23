package com.bank.bankingApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.bankingApplication.dto.BankResponse;
import com.bank.bankingApplication.dto.UserRequest;
import com.bank.bankingApplication.service.IUserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	IUserService userService;

	@PostMapping("/createUser")
	public BankResponse createAccount(@RequestBody UserRequest userRequest) {
		BankResponse response = userService.createAccount(userRequest);
		
		return response;
		
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

}
