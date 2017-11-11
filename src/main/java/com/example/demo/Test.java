package com.example.demo;

import javax.annotation.PostConstruct;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.interfaces.UserService;

@Service 
//@Component 
//@Repository
public class Test {
	
	@Autowired // k interface 
	private UserService userservice;
	
	private static final Logger logger = LogManager.getLogger(DemoApplication.class);
	
	@PostConstruct
	public void test() {
		User user = userservice.getUser("Karel");
		logger.info("user: "+user);
	}

}
