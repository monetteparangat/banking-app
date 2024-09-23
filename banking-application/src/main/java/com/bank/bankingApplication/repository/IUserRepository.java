package com.bank.bankingApplication.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.bankingApplication.entity.User;

public interface IUserRepository extends JpaRepository<User, Long>{
	Boolean existsByEmail(String email);
	Boolean existsByAccountNumber(String accountNumber);
	
	
}
