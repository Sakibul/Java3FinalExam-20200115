package com.login.service;

import com.login.model.UserEntity;

public interface UserService {
	public boolean addUser(UserEntity user); // CREATE
	
	public boolean loginUser(UserEntity user); // CHECK validity
}