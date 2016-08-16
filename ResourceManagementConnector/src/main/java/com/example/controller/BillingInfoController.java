package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repository.BillingInfoRepository;

@Controller
@RequestMapping(value={"","/billing_info"})
public class BillingInfoController {
	
	@Autowired
	private BillingInfoRepository bir;
	
	@RequestMapping(value = {"","/billing_info_index"})
	public String index(){
		System.out.println(bir.findAll());
		return "BillingInfoIndex";
	}
	
	@RequestMapping(value = {"","/billing_info_create"})
	public String create(){		
		return "Billing Info Created!";
	}

		
}
