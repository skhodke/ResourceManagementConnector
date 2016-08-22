package com.example.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.UserPermission;
import com.example.domain.UserPermission;
import com.example.repository.UserPermissionRepository;
import com.example.repository.UserPermissionRepository;


@Controller
@RequestMapping(value = {"","/userpermission"})
public class UserPermissionController {
	
	@Autowired
	private UserPermissionRepository repo;
	
	@RequestMapping(value="",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<UserPermission> getAllPermissions(){
		List<UserPermission> list = (List<UserPermission>) repo.findAll();
		return list;
	}

	@RequestMapping(value="/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public UserPermission getPermission(@PathVariable("id") int id){
		List<UserPermission> list = (List<UserPermission>) repo.findAll();
		for(UserPermission up:list){
			if(up.getUser_permission_id().equals(id))
				return up;
		}
		return null;
	}
	
	@RequestMapping(value="",method=RequestMethod.POST)
	@ResponseBody
	public void addUserPermission(@RequestBody UserPermission UserPermission){
		if(!UserPermission.equals(null)){
			repo.save(UserPermission);
		    System.out.println("New UserPermission Created:" +UserPermission);
		}
		else
			System.out.println("No Data Received");			
	}		 
	
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public void deleteUserPermissions(@PathVariable("id") int id){
	//	if(repo.exists(id))
			repo.delete(id);
	//	else
		//	System.out.println("id does not exist");
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	@ResponseBody
	public void updateUserPermission(@RequestBody UserPermission UserPermission){
			repo.save(UserPermission);
		
	}
}
