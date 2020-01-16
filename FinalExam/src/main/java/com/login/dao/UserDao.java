package com.login.dao;

import com.login.model.UserEntity;

public interface UserDao {
	public int insertUser(UserEntity user); // CREATE
	public boolean checkUser(UserEntity user); // CHECK
	public UserEntity getUserByEmail(String email);
}