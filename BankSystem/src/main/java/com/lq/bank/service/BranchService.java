package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lq.bank.model.Branch;

@Service
public class BranchService {

	public List<Map<String, Object>> getAllbranches(){
		
		List<Map<String,Object>> branchList = new ArrayList<>();
		
		Map<String, Object> branchInfo = new HashMap<>();
	
		Branch branchA = new Branch(1, "Branch A");
		
		branchInfo.put("name", branchA.getBranchName());
		branchInfo.put("BranchId", branchA.getBranchId());
		
		branchList.add(branchInfo);
		
		Map<String, Object> branchInfo_2 = new HashMap<>();
		
		Branch branchB = new Branch(2, "Branch B");
		
		branchInfo_2.put("name", branchB.getBranchName());
		branchInfo_2.put("branchId", branchB.getBranchId());
		
		branchList.add(branchInfo_2);
		
		return branchList;
		
	}
	
}
