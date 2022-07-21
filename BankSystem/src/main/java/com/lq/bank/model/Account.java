package com.lq.bank.model;

import com.lq.bank.enums.AccountType;


public class Account {

	private int id;
	
	private AccountType type;

	private String Label;
	
	private Branch branch;
	
	private Customer customer;

	public Account(int id, AccountType type, String label, Branch branch, Customer customer) {
		super();
		this.id = id;
		this.type = type;
		Label = label;
		this.branch = branch;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

	
	
	
}
