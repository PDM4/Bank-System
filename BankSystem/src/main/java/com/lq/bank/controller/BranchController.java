package com.lq.bank.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lq.bank.model.Branch;
import com.lq.bank.service.BranchService;

@RestController
@RequestMapping("/api/branches")

public class BranchController {

	@Autowired
	private BranchService branchService;

	
	
	@GetMapping
	public List<Map<String,Object>> listAllBranches() {
		
		return branchService.getAllbranches();					//Don't write logic in controller
		
	}
	
	
	@GetMapping("/{id}/customers")
	public String getAllCustomers() {
		
		return "soon-customer-list";
	}
	
	
	@PostMapping
	public String createNewBranch() {
		
		return "Create Branch";
		
	}
	
}
