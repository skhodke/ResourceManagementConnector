package com.example.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Contract;
import com.example.repository.ContractRepository;

@Controller
@RequestMapping(value = {"","/contract"})
public class ContractController {
	
	@Autowired
	private ContractRepository cr;
	
	@RequestMapping(value = {"/contract_index"})
	public String index(){		
		System.out.println(cr.findAll());
		return "contract/index";
	}
	
	 @RequestMapping(value = "contract_create")
	    public String create() throws ParseException {		

//		 Contract contract = new Contract();
//		 contract.setContract_resource_id(1);
//		 String input = "06/10/2013 18:29:09";
//	     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//	     Date javaDate = sdf.parse(input);
//	     java.sql.Timestamp date = new java.sql.Timestamp (javaDate.getTime());
//	     contract.setCreationDate(date);
	     return "contract/create";
	    }

}
