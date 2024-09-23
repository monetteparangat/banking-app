package com.bank.bankingApplication.utils;

import java.time.Year;

public class AccountUtils {
	
	public static final String ACCOUNT_EXIST_CODE = "001";
	public static final String ACCOUNT_EXISTS_MESSAGE = "User Already exists";
	public static final String ACCOUN_CREATION_SUCCES_CODE = "002";
	public static final String ACCOUNT_CREATION_SUCCESS_MESSAGE = "User Created Successfully";
	
	public static String generateAccountNumber() {
		Year currentYear = Year.now();
		int min = 100000;
		int max = 999999;
		
		int randomNumber = (int)Math.floor(Math.random() * (max-min + 1) + min);
		
		String year = String.valueOf(currentYear);
		String number = String.valueOf(randomNumber);
		
		StringBuilder accountNumber = new StringBuilder();
		accountNumber.append(year).append(accountNumber);
		
		return accountNumber.toString();
	}
	
	public static String accountName(String firstName, String lastName) {
		StringBuilder account = new StringBuilder();
		account.append(firstName).append(lastName);
		return account.toString();
	}
}
