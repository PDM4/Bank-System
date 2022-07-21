package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lq.bank.enums.AccountType;
import com.lq.bank.model.Account;
import com.lq.bank.model.Branch;
import com.lq.bank.model.Customer;

public class AccountService {

	public Map<String, Object> buildAccountInfo(Account account ){
		
		Map<String, Object> a = new HashMap<>();
			
		a.put("accountId", account.getId());
		a.put("type", account.getType());
		a.put("balance", 1005.58 );
		a.put("customerId", account.getCustomer().getId());
		a.put("label", account.getLabel());
		a.put("branchId", account.getBranch().getBranchId());
		
		return a;
		
	}
	
	
	public List<Map<String,Object>> getlistAllAccounts() {
		
		List<Map<String,Object>> accountList = new ArrayList<>();
		
		Map<String, Object> accountInfo = new HashMap<>();
		
		Branch branchA = new  Branch (1, "Branch A"); 
		
		Customer c1 = new Customer("Rodney", "Mckay", 10, branchA);
		
		Account ac_1 = new Account(1, AccountType.CHECKING, "Ch 1", branchA, c1);
	
		accountInfo = buildAccountInfo(ac_1);
		
		accountList.add(accountInfo);
		
		
		Map<String, Object> accountInfo_2 = new HashMap<>();
		
		Account ac_2 = new Account(2, AccountType.SAVINGS, "Ch 2", branchA, c1);
		
		accountInfo_2 = buildAccountInfo(ac_2);
		
		accountList.add(accountInfo_2);
		
		return accountList;
	}
	
	
	public List<Map<String,Object>> getAccountInfo() {
		
		List<Map<String,Object>> accountList = new ArrayList<>();
		

		
		Branch branchB = new  Branch (2, "Branch B"); 
		
		Customer c2 = new Customer("Harry", "Potter", 32, branchB);
		
		Account account =  new Account(3, AccountType.CHECKING, "Ch 3",branchB, c2);
		
		
//		accountInfo.put("accountId", 10);
//		accountInfo.put("type", 1);
//		accountInfo.put("balance", 1500.98);
//		accountInfo.put("customerId", 1);
//		accountInfo.put("label", "Checking 1");
//		accountInfo.put("branchId", 850);

		accountList.add(buildAccountInfo(account));
		
		return accountList;
	}
	
}
