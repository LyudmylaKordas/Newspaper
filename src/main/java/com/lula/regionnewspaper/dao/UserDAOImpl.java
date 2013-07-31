package com.lula.regionnewspaper.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.lula.regionnewspaper.model.User;

@Repository
public class UserDAOImpl implements UserDAO 
{

 	@Autowired
    private SessionFactory sessionFactory;
	
	public User getUserById(int idUser) 
	{
   	 	List<User> list = sessionFactory.getCurrentSession().createQuery("from User where Id_User="+idUser).list();
   	 	return list.get(0);
	}
	
	public User getUserByLogin(String loginUser) 
	{
		try
		{
	   	 	return (User)sessionFactory.getCurrentSession().createQuery("from User where Login = '"+loginUser+"'").list().get(0);
		}
		catch(Exception e)
		{
	   	 	return null;
		}
	}

	public void addUser(User user) 
	{
		sessionFactory.getCurrentSession().save(user);	
	}

}
