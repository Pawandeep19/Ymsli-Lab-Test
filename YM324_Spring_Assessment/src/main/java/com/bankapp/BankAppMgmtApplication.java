package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.model.service.AccountService;
import com.bankapp.model.service.UserService;

@SpringBootApplication
public class BankAppMgmtApplication implements CommandLineRunner{
	

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(BankAppMgmtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
//		userService.addUser(new User("PawanMgr", "pawan", "ROLE_MGR", "pawangmgr@gmail.com"));
//		userService.addUser(new User("PawanClerk", "pawan", "ROLE_CLERK", "pawanclerk@gmail.com"));
//		
//		accountService.addAccount(new Account( "PawanMgr", 5000.00, "904654321", 
//				"Rohini Delhi", "pawangmgr@gmail.com"));
//		
//		accountService.addAccount(new Account( "PawanClerk", 1000.00, "956452382", 
//				"Rohini Delhi", "pawanclerk@gmail.com"));

		
	}
}
