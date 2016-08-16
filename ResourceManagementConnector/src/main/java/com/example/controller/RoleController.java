package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repository.RoleRepository;

@Controller
@RequestMapping(value = {"","/role"})
public class RoleController {
	
	@Autowired
	private RoleRepository role;
	
	@RequestMapping(value = {"","/role_index"})
	public String index(){
		System.out.println(role.findAll());
		return "Found all roles";
	}
	
	@RequestMapping(value = {"","role_create"})
	public String create(){
		
		return "Created a new role!";
	}
	
	
	

}
