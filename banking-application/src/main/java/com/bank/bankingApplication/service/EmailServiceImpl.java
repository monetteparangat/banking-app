package com.bank.bankingApplication.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.bank.bankingApplication.dto.EmailDetails;

@Service
public class EmailServiceImpl implements IEmailService{
	
	@Autowired
	private JavaMailSender javaMailSender;
	@Value("${spring.mail.username}")
	private String senderEmail;
	
	
	@Override
	public void sendEmailAlert(EmailDetails emailDetails) {
		try {
			
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setFrom(senderEmail);
			mailMessage.setTo(emailDetails.getRecepient());
			mailMessage.setText(emailDetails.getMessageBody());
			mailMessage.setSubject(emailDetails.getSubject());
			
			javaMailSender.send(mailMessage);
			System.out.print("Mail sent successfully");
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
