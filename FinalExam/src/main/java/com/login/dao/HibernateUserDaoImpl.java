package com.login.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.login.model.UserEntity;

@Repository
public class HibernateUserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public int insertUser(UserEntity user) {
		sessionFactory.getCurrentSession().save(user);
		return 1;
	}

	@Override
	public boolean checkUser(UserEntity user) {
		UserEntity fetchedUser = getUserByEmail(user.getEmailAddress());
		return (fetchedUser.getPassword().equals(user.getPassword()));
	}

	@Override
	public UserEntity getUserByEmail(String email) {
		String hql = "from UserEntity where email= :email";
		Query query = getSession().createQuery(hql);
		query.setParameter("email", email);
		if (query.list().size() > 0) {
			return (UserEntity)query.list().get(0);
		}
		else {
			return null;
		}
	}
}