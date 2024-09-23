package com.bank.bankingApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmailDetails {
	
	private String recepient;
	private String messageBody;
	private String subject;
	private String attachment;
	
}
