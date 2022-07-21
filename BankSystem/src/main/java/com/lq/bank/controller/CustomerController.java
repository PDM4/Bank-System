package com.lq.bank.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.lq.bank.model.Branch;
import com.lq.bank.service.CustomerService;

@RestController
@RequestMapping("/api/customers")

public class CustomerController {	
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping
	public List<Map> listOfAllcustomers(){
		
		return customerService.getlistOfAllcustomers();
		
	}

	
	@GetMapping("{id}/accounts")
	public List<Map<String,Object>> listofAccountsForCustomer() {
		
		return customerService.getlistofAccountsForCustomer();
	}
	
	@GetMapping("/{id}")         											//Inside Spring Boot we will get the id from the url
	public List<Map> get_CustomerInfo(){                         //(@PathVariable("id") int userid) {    	//Get that above "id" and put it into a variable of type int named "userId"
		
		return customerService.getCustomerInfo();
	}
	
	
	@PostMapping()
	public String createNewCustomer() {
		
		return "Soon Create";
	}
	
	@PutMapping("/{id}")
	public String updateCustomer() {
		
		return "Soon Update";
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomer() {
		
		return "Soon Delete";
	}
	
}





/*	@GetMapping()
public Map<String, Object> listOfAllCustomers() {
	
	Map<String, Object> r = new HashMap<>();
	
	r.put("name", "John");
	r.put("family", "Doe");
	r.put("age", 15);
	
	return r;
*/

/*	
@GetMapping
public Map<String, List<Map>> listOfAllcustomers(){
	
	Map< String,List<Map>> returnData = new HashMap<String, List<Map>>();
	List<Map> customersList = new ArrayList<Map>();
	
	Map<String, Object> r1 = new HashMap<>();
	r1.put("name", "John");
	r1.put("family", "Doe");
	r1.put("age", 15);
	
	Map<String, Object> r2 = new HashMap<>();
	r2.put("name", "Jane");
	r2.put("family", "Doe");
	r2.put("age", 35);
	
	customersList.add(r1);
	customersList.add(r2);
	
	returnData.put("customers", customersList);
	
	return returnData;
	
	
}

*/	