package com.bank.bankingApplication.service;

import java.math.BigDecimal;

import com.bank.bankingApplication.dto.BankResponse;
import com.bank.bankingApplication.dto.UserRequest;
import com.bank.bankingApplication.entity.User;
import com.bank.bankingApplication.utils.AccountUtils;

public class UserServiceImpl implements IUserService {

	@Override
	public BankResponse createAccount(UserRequest userRequest) {
		User newUser = User.builder()
				.firstName(userRequest.getFirstName())
				.lastName(userRequest.getLastName())
				.otherName(userRequest.getOtherName())
				.gender(userRequest.getGender())
				.address(userRequest.getAddress())
				.stateOfOrigin(userRequest.getStateOfOrigin())
				.accountNumber(AccountUtils.generateAccountNumber())
				.accountBalance(BigDecimal.ZERO)
				.email(userRequest.getEmail())
				.phoneNumber(userRequest.getPhoneNumber())
				.alternativePhoneNumber(userRequest.getAlternativePhoneNumber())
				.status(userRequest.getStatus())
				.build();

		return null;
	}
}
