package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repository.ProjectRepository;

@Controller
@RequestMapping(value={"","/project"})
public class ProjectController {
	
	@Autowired
	private ProjectRepository pr;
	
	@RequestMapping(value = {"","/project_index"})
	public String index(){
		System.out.println(pr.findAll());
		return "Index for Project";
	}
	
	@RequestMapping(value={"","/project_create"})
	public String create(){
		return "New Project created!";
	}

}
