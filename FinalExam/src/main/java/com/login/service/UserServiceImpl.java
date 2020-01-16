package com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.login.dao.UserDao;
import com.login.model.UserEntity;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	
	@Override
	public boolean addUser(UserEntity user) {
		return userDao.insertUser(user) > 0;
	}

	@Override
	public boolean loginUser(UserEntity user) {
		return userDao.checkUser(user);
	}

}
