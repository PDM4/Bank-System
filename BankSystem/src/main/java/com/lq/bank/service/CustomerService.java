package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.lq.bank.enums.AccountType;
import com.lq.bank.model.Account;
import com.lq.bank.model.Branch;
import com.lq.bank.model.Customer;

@Service
public class CustomerService {

		@Autowired
		private AccountService accountService;
	
	   public Map<String, Object> buildCustomerInfo (Customer customer)
	    {
	        Map<String, Object> customerInfo = new HashMap<>();
	        customerInfo.put("name", customer.getName() );
	        customerInfo.put("family", customer.getFamily() );
	        customerInfo.put("age",customer.getAge() );
	        customerInfo.put("customerId", customer.getId());
	       
	        return customerInfo;
	    }
	
	
	
	public List<Map> getlistOfAllcustomers(){
		
		List<Map> customersList = new ArrayList<Map>();
	
		Map<String, Object> r1 = new HashMap<>();
		

		Branch branchA = new Branch(1, "Branch A");
		Customer c1 = new Customer("John", "Doe", 20, 1, branchA);
		r1 = buildCustomerInfo(c1);
		
//		r1.put("name", c1.getName() );
//		r1.put("family", c1.getFamily());
//		r1.put("age", c1.getAge());
	
//		Map<String, Object> r2 = new HashMap<>();
		Branch branchB = new Branch(2, "Branch B");
		Customer c2 = new Customer("Jane", "Doe", 35, 2, branchB );
//		r2.put("name", c2.getName());
//		r2.put("family", c2.getFamily());
//		r2.put("age", c2.getAge());
	
		customersList.add(r1);
		customersList.add(buildCustomerInfo(c2));
	
		return customersList;
	
	}
	
	public List<Map<String,Object>> getlistofAccountsForCustomer() {
		
		List<Map<String,Object>> accountList = new ArrayList<>();
		
//		Map<String, Object> accountInfo = new HashMap<>();
		
		Branch branchB = new  Branch (2, "Branch B"); 
		Customer c2 = new Customer("Harry", "Potter", 32, 3, branchB);
		Account account =  new Account(3, AccountType.CHECKING, "Ch 3",branchB, c2);
		
//		accountInfo.put("accountId", 10);
//		accountInfo.put("type", 1);
//		accountInfo.put("balance", 1500.98);
//		accountInfo.put("customerId", 1);
//		accountInfo.put("label", "Checking 1");
//		accountInfo.put("branchId", 850);

		accountList.add(accountService.buildAccountInfo(account));
	
				
		Map<String, Object> accountInfo_2 = new HashMap<>();
		
		Account account_2 = new Account(1, AccountType.SAVINGS, "Ch 2", branchB, c2);
		accountInfo_2 = accountService.buildAccountInfo(account_2);
		
//		accountInfo_2.put("accountId", 16);
//		accountInfo_2.put("type", 2);
//		accountInfo_2.put("balance", 68000.51);
//		accountInfo_2.put("customerId", 2);
//		accountInfo_2.put("label", "Saving 1");
//		accountInfo_2.put("branchId", 150);

		
		accountList.add(accountInfo_2);
		
		return accountList;
	}
	
	public List<Map> getCustomerInfo() {    	
	
		List<Map> customersList = new ArrayList<>();

		Branch branchC = new Branch(3, "Branch C");
		Customer c3 = new Customer("Hermione", "Granger", 32, 4,branchC );
	
		customersList.add(buildCustomerInfo(c3));				//We make a list even for one customer to make it simple for the next developer for re-usability
	
		return customersList;
	}


}
