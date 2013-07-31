package com.lula.regionnewspaper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lula.regionnewspaper.dao.UserDAO;
import com.lula.regionnewspaper.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserDAO userDAO;
	
	@Transactional
	public User getUserById(int idUser) {
		userDAO.getUserById(idUser);
		return null;
	}
	
	@Transactional
	public User getUserByLogin(String loginUser) {
		return userDAO.getUserByLogin(loginUser);
	}

	@Transactional
	public void addUser(User user) {
		userDAO.addUser(user);
	}

}
