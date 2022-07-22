package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.bank.data.BranchRepository;
import com.lq.bank.model.Branch;

@Service
public class BranchService {
	
	
	@Autowired
	private BranchRepository branchRepository;

	public void newBranch(String name) {
		
		Branch newBranch = new Branch("Branch A");
		
		branchRepository.save(newBranch);
		
	}
	
	public List<Map> getSingleBranchInfo(int branchId){
		
		Optional<Branch> temp = branchRepository.findById(branchId);
		
		List<Map> branchList = new ArrayList<Map>();
		
		if(!temp.isEmpty()) {
			
			branchList.add(buildBranchInfo(temp.get()));
			
			
		}
		
		return branchList;
		
	}
	
	public void deleteBranch(int branchId) {
		
		Optional<Branch> temp = branchRepository.findById(branchId);
		if(!temp.isEmpty()) {
			branchRepository.delete(temp.get());
			
		}
	}
	
	public Map buildBranchInfo(Branch branch) {
		
		Map<String, Object>branchInfo = new HashMap<>();
		
		branchInfo.put("name", branch.getBranchName());
		branchInfo.put("branchId", branch.getBranchId());
		
		return branchInfo;
	}
	
	
	public List<Map> getAllbranches(){
		
		List<Map> branchList = new ArrayList<Map>();
		
		Iterable<Branch> allBranches = branchRepository.findAll();
		
		for(Branch t : allBranches) {
			
			branchList.add(buildBranchInfo(t));
		}
		
		return branchList;
		
	}
//	public List<Map<String, Object>> getAllbranches(){
	
		
//		List<Map<String,Object>> branchList = new ArrayList<>();	
		
//		Map<String, Object> branchInfo = new HashMap<>();
//	
//		Branch branchA = new Branch(1, "Branch A");
//		
//		branchInfo.put("name", branchA.getBranchName());
//		branchInfo.put("BranchId", branchA.getBranchId());
//		
//		branchList.add(branchInfo);
//		
//		Map<String, Object> branchInfo_2 = new HashMap<>();
//		
//		Branch branchB = new Branch(2, "Branch B");
//		
//		branchInfo_2.put("name", branchB.getBranchName());
//		branchInfo_2.put("branchId", branchB.getBranchId());
//		
//		branchList.add(branchInfo_2);
		
//		return branchList;
		
//	}
	
}
