package com.login.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
CREATE TABLE User
(
	id INT NOT NULL AUTO_INCREMENT,
	email VARCHAR(255),
	password VARCHAR(255),
	PRIMARY KEY(id)
);
*/

@Entity
@Table(name = "User")
public class UserEntity {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "email", nullable = false, unique = true)
	private String emailAddress;
	
	@Column(name = "password")
	private String password;
	
	public UserEntity() { }
	
	public UserEntity(int id, String emailAddress, String password) {
		this.id = id;
		this.emailAddress = emailAddress;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
