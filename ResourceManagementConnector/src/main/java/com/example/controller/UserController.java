package com.example.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.repository.UserRepository;

@Controller
@RequestMapping(value = {"","/user"})
public class UserController {
	
		@Autowired
		private UserRepository ur;
		
		@RequestMapping(value = {"/user_index"})
		public String index(){
			System.out.println(ur.findAll());
			return "user/index";
		}
		
		
		 @RequestMapping(value = "user_create")
		    public String create() throws ParseException{			 
//			 	User user = new User();
//		        user.setEmailId("new@gmail.com");
//		        user.setPassword("new");
//		        String input = "06/10/2013 18:29:09";
//		        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		        Date javaDate = sdf.parse(input);
//		        java.sql.Timestamp date = new java.sql.Timestamp (javaDate.getTime());
//		        user.setCreationDate(date);
//		        user.setLastUpdate(date);
		        return "user/create";
		    }
		
		 @RequestMapping(value = "/user_test")
		    public String test(){
		        return "hello world";
		    }
		 
}
