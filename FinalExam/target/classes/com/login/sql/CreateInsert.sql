CREATE DATABASE IF NOT EXISTS FinalExamDB;

USE FinalExamDB;
-------------------------------------------------------------
DROP TABLE IF EXISTS User;
CREATE TABLE User
(
	id INT NOT NULL AUTO_INCREMENT,
	email VARCHAR(255),
	password VARCHAR(255),
	PRIMARY KEY(id)
);
DESCRIBE User;
-------------------------------------------------------------
insert into User (email, password) values('Email1@Address.com', 'Password1');
insert into User (email, password) values('Email2@Address.com', 'Password2');
insert into User (email, password) values('Email3@Address.com', 'Password3');
insert into User (email, password) values('Email4@Address.com', 'Password4');
insert into User (email, password) values('Email5@Address.com', 'Password5');
-------------------------------------------------------------