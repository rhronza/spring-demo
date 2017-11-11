package com.example.demo.repository;

import com.example.demo.entity.User;
import com.example.demo.service.UserRepository;

public class UserRepositoryImpl implements UserRepository{

	@Override
	public User getUser(String username) {
		User user = new User();
		user.setFirstname("karel");
		user.setLastname("Nov8ak");
		user.setUsername(username);
		return user;
	}

}
