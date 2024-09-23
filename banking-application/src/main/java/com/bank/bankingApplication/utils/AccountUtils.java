package com.bank.bankingApplication.utils;

import java.time.Year;

public class AccountUtils {
	
	
	
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
}
