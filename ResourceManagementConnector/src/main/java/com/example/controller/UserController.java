/* Basic Controller for user services
 * Created by: Sayali
 * Date: 8/17/2016
*/
package com.example.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.BillingInfo;
import com.example.domain.User;
import com.example.repository.BillingInfoRepository;
import com.example.repository.UserRepository;

@Controller
@RequestMapping(value = {"","/users"})
public class UserController {
	
		@Autowired
		private UserRepository ur;
		private BillingInfoRepository repo;
		@RequestMapping(value="",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public List<User> getAllUsers(){
			List<User> list = (List<User>) ur.findAll();
			return list;
		}
		
		@RequestMapping(value="/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		public User getCustomer(@PathVariable("id") int id){
			List<User> list = (List<User>) ur.findAll();
			for(User u:list){
				if(u.getId().equals(id))
					return u;
			}
			return null;
		}
		
		@RequestMapping(value="",method=RequestMethod.POST)
		@ResponseBody
		public Integer addUser(@RequestBody User user){
			if(!user.equals(null)){			
				User savedUser=	ur.save(user);
				return savedUser.getId();			    
			}
			else
				System.out.println("No Data Received");		
			return null;
		}		 
		
		
		@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
		@ResponseBody
		public void deleteUsers(@PathVariable("id") int id){
				ur.delete(id);
		}
		
		@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
		@ResponseBody
		public void updateUser(@PathVariable("id") int id, @RequestBody User user){		
			User savedUser = ur.save(user);
		}
		
		
		
}
