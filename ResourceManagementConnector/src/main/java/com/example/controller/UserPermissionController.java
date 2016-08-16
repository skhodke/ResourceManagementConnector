package com.example.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.domain.UserPermission;
import com.example.repository.UserPermissionRepository;


@Controller
@RequestMapping(value = {"","/userpermission"})
public class UserPermissionController {
	
	@Autowired
	private UserPermissionRepository upr;
	
	@RequestMapping(value = {"/userpermission_index"})
	public String index() {
		System.out.println(upr.findAll());
		return "userpermission/index";
	}
	
	 @RequestMapping(value = "/userpermission_test")
	    public String test(){
	        return " hello world";
	    }
	 
	 @RequestMapping(value = "userpermission_create")
	    public String create() {			 	
//		 UserPermission up = new UserPermission();
//		 up.setAccess_status(10);
//		 up.setUser_email_id("shra@gmail.com");
	     return "userpermission/create";
	    }

}
