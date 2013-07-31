package com.lula.regionnewspaper.service;

import com.lula.regionnewspaper.model.User;

public interface UserService {
	public User getUserById(int idUser);
	public User getUserByLogin(String loginUser);
    public void addUser(User user);
}
