package com.bank.bankingApplication.service;

import com.bank.bankingApplication.dto.BankResponse;
import com.bank.bankingApplication.dto.UserRequest;

public interface IUserService {

	BankResponse createAccount(UserRequest userRequest);
	
}
