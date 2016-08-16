package com.example;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.BillingInfo;
import com.example.domain.Contract;
import com.example.domain.Project;
import com.example.domain.Role;
import com.example.domain.Task;
import com.example.domain.User;
import com.example.domain.UserPermission;
import com.example.repository.BillingInfoRepository;
import com.example.repository.ContractRepository;
import com.example.repository.ProjectRepository;
import com.example.repository.RoleRepository;
import com.example.repository.TaskRepository;
import com.example.repository.UserPermissionRepository;
import com.example.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EowApplicationTests {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserPermissionRepository upr;
	
	@Autowired
	private ContractRepository cp;
	
	@Autowired
	private RoleRepository role;
	
	@Autowired
	private BillingInfoRepository bir;
	
	@Autowired
	private ProjectRepository pr;
	
	@Autowired
	private TaskRepository tr;
	
	@Test
	public void contextLoads() throws ParseException {
		
		//Testing for User Creation
		
//		User user = new User();
//        user.setEmailId("new1@gmail.com");
//        user.setPassword("new1");
//        assertNull(user.getId());
//        userRepository.save(user);
//        assertNotNull(user.getId());
//	
		
		//Testing for Searching a particular User
		User fetchuser = userRepository.findOne(3);
		assertNotNull(fetchuser);
		
		
		//Testing for Deleting a specific user
//		userRepository.delete(6);
		
		
		
//		System.out.println(userRepository.findOne(1));
//		System.out.println(userRepository.findAll());		
		
		
		//Testing for New User Permission Creation
//		UserPermission up = new UserPermission();
//		 up.setAccess_status(10);
//		 up.setUser_email_id("shra@gmail.com");
//		 assertNull(up.getUser_permission_id());
//		 upr.save(up);
//		 assertNotNull(up.getUser_permission_id());
		
		 //Testing for Fetching User Permission Details
		// UserPermission fetchuser1 = upr.findOne(1);
		// assertNotNull(fetchuser1);
			
		 
		 //Testing for New Contract Creation
		 
//		 Contract contract = new Contract();
//		 contract.setContract_resource_id(1);
//		 assertNull(contract.getContract_id());
//		 cp.save(contract);
//	     assertNotNull(contract.getContract_id());
		 
		 
		 //Testing for Fetching a particular contract
		 
		 Contract fetchContract = cp.findOne(1);
		 assertNotNull(fetchContract);
		 
		 
		 //Testing for role creation
//		 Role r = new Role();
//		 r.setRole_level(1);
//		 r.setRole_resource_id(1);
//		 r.setRole_status(1);
//		 r.setRole_type("Admin");
//		 assertNull(r.getRole_id());
//		 role.save(r);
//		 assertNotNull(r.getRole_id());
		 
		 
		 //Testing for BillingInfo fetching
//		 BillingInfo bi = bir.findOne(1);
//		 assertNotNull(bi);
		 
		 //Testing for Project Creation
//		 Project p = new Project();
//		 p.setProject_name("Spring Boot App");
//		 p.setProject_timeline(10);
//		 assertNull(p.getProject_id());
//		 pr.save(p);
//		 assertNotNull(p.getProject_id());
		 
//		 Project p1 = pr.findOne(1);
//		 assertNotNull(p1);
		// System.out.println(pr.findOne(1));
		 
		 
		 //Testing for Task Creation
		 
//		 Task t = new Task();
//		 t.setTask_description("spring_task1");
//		 t.setTask_status("inprogress");
//		 assertNull(t.getTask_id());
//		 tr.save(t);
//		 assertNotNull(t.getTask_id());
		 
	}
	
}
