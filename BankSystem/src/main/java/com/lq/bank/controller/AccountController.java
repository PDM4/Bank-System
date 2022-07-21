package com.lq.bank.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lq.bank.service.AccountService;


@RestController
@RequestMapping("/api/accounts")

public class AccountController {

	/*
	 * 
	 * Checking =>1
	 * Savings =>2
	 * Salary =>3
	 * Credit =>4 (Lets consider credit has balance)
	 * 
	 */
	
	@Autowired
	AccountService accountService;
	
	@GetMapping
	public List<Map<String,Object>> listAllAccounts() {
		
		return accountService.getlistAllAccounts();
	}
	
	@GetMapping("/{id}")
	public List<Map<String,Object>> get_AccountInfo() {
		
		return accountService.getAccountInfo();
	}
	
	
	@PostMapping
	public String createAccount() {
		
		return "Create Account";
		
	}
	
	@PutMapping("/{id}")
	public String updateAccount() {
		
		return "Update Account";
	}
	
	@DeleteMapping("/{id}")
	public String deleteAccount() {
		
		return "Delete Account";
	}
	
	@PostMapping("/{id}/deposit")
	public String depositAccount() {
		
		return "deposit";
	}
	
	
	@PutMapping("/{id}/withdrawal")
	public String withdrawalAccount() {
		
		return "withdrawal";
	}
}
