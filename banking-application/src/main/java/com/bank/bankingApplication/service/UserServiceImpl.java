package com.bank.bankingApplication.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bankingApplication.dto.AccountInfo;
import com.bank.bankingApplication.dto.BankResponse;
import com.bank.bankingApplication.dto.UserRequest;
import com.bank.bankingApplication.entity.User;
import com.bank.bankingApplication.repository.IUserRepository;
import com.bank.bankingApplication.utils.AccountUtils;

import lombok.experimental.var;


@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserRepository userRepository;

	@Override
	public BankResponse createAccount(UserRequest userRequest) {
	
		//if email exists return
		if(userRepository.existsByEmail(userRequest.getEmail())) {
			return BankResponse.builder()
				.responseCode(AccountUtils.ACCOUNT_EXIST_CODE)
				.responseMessage(AccountUtils.ACCOUNT_EXISTS_MESSAGE)
				.accountInfo(null)
				.build();
		}
		
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
		

			User savedUser = userRepository.save(newUser);

			AccountInfo accountInfo = AccountInfo.builder()
					.accountName(AccountUtils.accountName(newUser.getFirstName(), newUser.getLastName()))
					.accountNumber(newUser.getAccountNumber())
					.accountBalance(newUser.getAccountBalance())
					.build();

		return BankResponse.builder()
				.responseCode(AccountUtils.ACCOUN_CREATION_SUCCES_CODE)
				.responseMessage(AccountUtils.ACCOUNT_CREATION_SUCCESS_MESSAGE)
				.accountInfo(accountInfo)
				.build();
	}
}
