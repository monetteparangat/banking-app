package com.bank.bankingApplication.service;

import com.bank.bankingApplication.dto.EmailDetails;

public interface IEmailService {

	public void sendEmailAlert(EmailDetails emailDetails);
	
}
