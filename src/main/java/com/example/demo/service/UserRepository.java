package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserRepository {
	
	User getUser(String username);
}
