package com.login.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.login.model.UserEntity;

public class UserMapper implements RowMapper<UserEntity>{
	@Override
	public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new UserEntity(rs.getInt("id"), rs.getString("email"), rs.getString("password"));
	}
}