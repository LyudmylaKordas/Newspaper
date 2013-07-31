package com.lula.regionnewspaper.dao;

import com.lula.regionnewspaper.model.User;


public interface UserDAO {
	public User getUserById(int idUser);
	public User getUserByLogin(String loginUser);
    public void addUser(User user);
}
