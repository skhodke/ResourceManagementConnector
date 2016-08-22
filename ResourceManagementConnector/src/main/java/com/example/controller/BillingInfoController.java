package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.BillingInfo;
import com.example.repository.BillingInfoRepository;
import com.example.repository.UserRepository;

@Controller
@RequestMapping(value={"","/billingInfo"})
public class BillingInfoController {
	@Autowired
	private BillingInfoRepository repo;
	
	@RequestMapping(value="",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<BillingInfo> getAllBillingInfos(){
		List<BillingInfo> list = (List<BillingInfo>) repo.findAll();
		return list;
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public BillingInfo getCustomer(@PathVariable("id") int id){
		List<BillingInfo> list = (List<BillingInfo>) repo.findAll();
		for(BillingInfo u:list){
			if(u.getBilling_info_id().equals(id))
				return u;
		}
		return null;
	}
	
	@RequestMapping(value="",method=RequestMethod.POST)
	@ResponseBody
	public void addBillingInfo(@RequestBody BillingInfo billingInfo){
		if(!billingInfo.equals(null)){
			
			repo.save(billingInfo);
			System.out.println("New BillingInfo Created:" +billingInfo);
		    
		}
		else
			System.out.println("No Data Received");		
	}		 
	
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public void deleteBillingInfos(@PathVariable("id") int id){
			repo.delete(id);
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	@ResponseBody
	public void updateBillingInfo(@PathVariable("id") int id, @RequestBody BillingInfo billingInfo){	
		repo.save(billingInfo);
	}
	

		
}
