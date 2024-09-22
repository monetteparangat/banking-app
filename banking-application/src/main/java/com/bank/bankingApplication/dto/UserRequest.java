package com.bank.bankingApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest{
	
	private String firstName;
	private String lastName;
	private String otherName;
	private String gender;
	private String address;
	private String dateOfOrigin;
	private String email;
	private String phoneNumber;
	private String alternativePhoneNumber;
	private String status;

}
