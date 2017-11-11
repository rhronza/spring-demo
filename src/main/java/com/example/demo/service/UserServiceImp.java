package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.interfaces.UserService;

@Service
public class UserServiceImp implements UserService{
	
	//@Override
	//@Scope("prototype" ) // každá instance pro kazdy autowired
	
	@Autowired
	private UserRepository userRepository;
	@Override
	public User getUser(String username) {
				
		return userRepository.getUser(username);
		
		
	}

	
	

}
